package toby;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author : Goni of Berlin
 * @Date   : 1/28/16
 */
public class UserDaoJdbc implements UserDao {
	private JdbcTemplate jdbcTemplate;
	private RowMapper<User> userMapper =
		new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId((rs.getString("id")));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setLevel(Level.valueOf(rs.getInt("level")));
				user.setLogin(rs.getInt("login"));
				user.setRecommend(rs.getInt("recommend"));

				return user;
			}
		};

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void add(final User user) throws DuplicateUserIdException {
		jdbcTemplate.update("INSERT INTO users(id, name, password, level, login, recommend) VALUES(?, ?, ?, ?, ?, ?)",
			user.getId(), user.getName(), user.getPassword(), user.getLevel().intValue(), user.getLogin(), user.getRecommend());
	}

	public User get(String id) {
		return jdbcTemplate.queryForObject("select * from users where id = ?",
			new Object[] { id }, userMapper);
	}

	public void deleteAll() {
		jdbcTemplate.update("DELETE FROM users");
	}

	public int getCount() {
		return jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
	}

	@Override
	public void update(User user1) {
		jdbcTemplate.update("update users set name = ?, password = ?, level = ?, login = ?, recommend = ? where id = ? ", user1.getName(),
			user1.getPassword(), user1.getLevel().intValue(), user1.getLogin(), user1.getRecommend(), user1.getId());
	}

	public List<User> getAll() {
		return jdbcTemplate.query("select * from users order by id", userMapper);
	}
}
