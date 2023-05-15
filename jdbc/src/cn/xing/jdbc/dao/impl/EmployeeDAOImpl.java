package cn.xing.jdbc.dao.impl;

import cn.xing.jdbc.dao.IEmployeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author XGLins
 * @date 2023/5/15 22:20
 */
public class EmployeeDAOImpl implements IEmployeeDAO {
    @Override
    public void saveEmployee(String name, int age) {
        String sql = "insert into student (name,age) values ('" + name + "'," + age + ")";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                    "123456");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(Integer id) {
        String sql = "delete from student where id=" + id;
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Integer age) {
        String sql="UPDATE student SET age ='"+age+"'WHERE name='幸国霖'";
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
