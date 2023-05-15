package cn.xing.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author XGLins
 * @date 2023/5/12 8:35
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        //获取数据库连接
        Connection connection =
                DriverManager.getConnection("jdbc:mysql:///jdbc?useSSL=false&serverTimezone=GMT", "root", "123456");
        System.out.println(connection);
        //获取语句对象
        Statement statement = connection.createStatement();
        //执行sql
        int i = statement.executeUpdate("CREATE TABLE student (\n" +
                " id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n" +
                " name VARCHAR(20) NOT NULL,\n" +
                " age INT\n" +
                ");");
        //释放资源
        statement.close();
        connection.close();
    }
}
