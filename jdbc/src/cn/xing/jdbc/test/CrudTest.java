package cn.xing.jdbc.test;

import cn.xing.jdbc.entity.Student;
import cn.xing.jdbc.tools.JdbcTools;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author XGLins
 * @date 2023/5/12 8:35
 */
public class CrudTest {
    //注入JdbcTools全局变量
    private JdbcTools jt = new JdbcTools();

    /**
     * 查询表中有多少条信息
     * */
    @Test
    public void testCount(){
        //获取连接
        try {
            //执行sql
            String sql = "select count(1) from student";
            jt.select(sql);

            //聚合查询数据
            ResultSet resultSet = jt.executeQuery("select count(1) from student");
            if (resultSet.next()){
                int anInt = resultSet.getInt("count(1)");
                System.out.println("表中有"+anInt+"条数据");
            }
            //关闭资源
            resultSet.close();
            jt.close();
            jt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 往表中增加一条数据
     * */
    @Test
    public void add() {
            String sql="INSERT INTO student (name, age) VALUES ('张三 ', 20)";
            //执行sql
            jt.executeUpdate(sql);
            //释放资源
            jt.close();
            jt.close();
    }

    /**
     * 删除名字为张三的这条数据
     * */
    @Test
    public void testDelete(){
        //加载驱动
        //执行sql
        jt.executeUpdate("DELETE FROM student where name='张三'");
        //关闭资源
        jt.close();
        jt.close();
    }

    /**
     * 修改id为1的数据的名字为zhangsan
     * */
    @Test
    public void testUpdate() {
        //获取连接
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            //获取语句对象
            Statement statement = connection.createStatement();
            //执行sql
            statement.executeUpdate("update student set name='zhangsan' where id=2");
            //关闭资源
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 查询表中有多少条数据'
     * */
    //查询表中有多少条信息
    @Test
    public void testCount2(){
        //获取连接
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            //获取语句对象
            Statement statement = connection.createStatement();
            //执行sql
            ResultSet resultSet = statement.executeQuery("select count(1) from student");
            if (resultSet.next()) {
                int anInt = resultSet.getInt("count(1)");
                System.out.println("表中有" + anInt + "条数据");
            }
            //关闭资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 查询某条数据
     * */
    @Test
    public void testGetOne(){
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student where id=2");
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                Student student = new Student(id, name, age);
                System.out.println(student);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 获取数据库表中所有数据
     * */
    @Test
    public void testGetAll(){
        //获取连接
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai", "root",
                            "123456");
            //获取语句对象
            Statement statement = connection.createStatement();
            //执行sql
            ResultSet resultSet = statement.executeQuery("select * from student");
                    List<Student> list=new ArrayList<>();
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String name= resultSet.getString("name");
                int age= resultSet.getInt("age");
                Student student=new Student(id,name,age);
                list.add(student);
            }
            for(Student s:list){
                System.out.println(s);
            }
            //关闭资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
