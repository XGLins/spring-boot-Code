package cn.xing.jdbc.test;

import cn.xing.jdbc.dao.IEmployeeDAO;
import cn.xing.jdbc.dao.impl.EmployeeDAOImpl;
import org.junit.Test;

/**
 * @author XGLins
 * @date 2023/5/15 22:22
 */
public class EmployeeDAOTest {
    //多态 子类的对象 赋值给 父类的类型
    IEmployeeDAO dao = new EmployeeDAOImpl();

    /**
     * 增加一个用户
     */
    @Test
    public void testAdd() {
        dao.saveEmployee("公孙离", 18);
    }

    /**
     * 根据id删除用户
     */
    @Test
    public void testDelete() {
        dao.deleteEmployee(5);
    }

    /**
     * 修改幸国霖的年龄为19岁
     */
    @Test
    public void testUpdate() {
        dao.updateEmployee(19);
    }
}
