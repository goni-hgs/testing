package toby;

import java.util.List;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/24/16
 */
public interface UserDao {

	void add(final User user);

	User get(String id);

	List<User> getAll();

	void deleteAll();

	int getCount();

	void update(User user1);
}
