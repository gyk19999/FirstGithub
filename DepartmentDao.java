package com.gyk.springboot.dao;

import com.gyk.springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<>();
        departmentMap.put(1, new Department(1, "技术部"));
        departmentMap.put(2, new Department(2, "财务部"));
        departmentMap.put(3, new Department(3, "研发部"));
        departmentMap.put(4, new Department(4, "运营部"));
        departmentMap.put(5, new Department(5, "后勤部"));
    }

    //获取部门的全部信息
    public Collection<Department> departments() {
        return departmentMap.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id) {
        return departmentMap.get(id);
    }

}
