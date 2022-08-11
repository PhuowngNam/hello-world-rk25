package com.vti;

import com.vti.entity.Department;
import com.vti.repo.DepartmentRepoImpl;
import com.vti.repo.IDepartmentRepo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestProgram {
	
	public static void main(String[] args) {

		IDepartmentRepo departmentRepo = new DepartmentRepoImpl();

		// get List:
//		List<Department> departmentList = departmentRepo.getAllDepartments();
//		departmentList.forEach(System.out::println);

		//get one: id: 10
		Department department10 = departmentRepo.getOne(10);
		System.out.println(department10);
	}
}
