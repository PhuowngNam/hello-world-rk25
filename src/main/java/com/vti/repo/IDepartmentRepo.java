package com.vti.repo;

import com.vti.entity.Department;
import java.util.List;

public interface IDepartmentRepo {
    List<Department> getAllDepartments();
    Department getOne(int id);
    Department create(Department department);
    Department update(int id, Department department);
    Department delete(int id);
}
