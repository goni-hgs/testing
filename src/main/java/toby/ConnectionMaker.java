package toby;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author : Goni of Berlin
 * @Date   : 2/7/16
 */
public interface ConnectionMaker {
	public Connection makeConnection() throws ClassNotFoundException, SQLException;
}

