package cn.xing.jdbc.dao;

public interface IEmployeeDAO {
    //增加一个员工
    void saveEmployee(String name,int age);

    //删除一个员工
    void deleteEmployee(Integer id);

    //编辑员工
    void updateEmployee(Integer age);
}
