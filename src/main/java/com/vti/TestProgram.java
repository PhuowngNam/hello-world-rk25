package com.vti;

import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.repo.DepartmentRepoImpl;
import com.vti.repo.GroupRepoImpl;
import com.vti.repo.IDepartmentRepo;
import com.vti.repo.IGroupRepo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class TestProgram {
	
	public static void main(String[] args) {

		IDepartmentRepo departmentRepo = new DepartmentRepoImpl();
		IGroupRepo groupRepo = new GroupRepoImpl();

		// get List:
//		List<Department> departmentList = departmentRepo.getAllDepartments();
//		departmentList.forEach(System.out::println);

		//get one: id: 10
//		Department department10 = departmentRepo.getOne(10);
//		System.out.println(department10);

//		List<Group> groupList = groupRepo.getAllGroups();
//		groupList.forEach(System.out::println);

		Group group = new Group();
		group.setName("Group 1");
		groupRepo.create(group);
	}
}
