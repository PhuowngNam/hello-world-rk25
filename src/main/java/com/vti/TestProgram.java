package com.vti;

import com.vti.entity.Address;
import com.vti.entity.User;
import com.vti.repo.AccountRepoImpl;
import com.vti.repo.AddressRepoImpl;
import com.vti.repo.DepartmentRepoImpl;
import com.vti.repo.IAccountRepo;
import com.vti.repo.IAddressRepo;
import com.vti.repo.IDepartmentRepo;
import com.vti.repo.IUserRepo;
import com.vti.repo.UserRepoImpl;

public class TestProgram {

    public static void main(String[] args) {

        IDepartmentRepo departmentRepo = new DepartmentRepoImpl();
//		IGroupRepo groupRepo = new GroupRepoImpl();
        IAccountRepo accountRepo = new AccountRepoImpl();
        IAddressRepo addressRepo = new AddressRepoImpl();
        IUserRepo userRepo = new UserRepoImpl();

        // get List:
//		List<Department> departmentList = departmentRepo.getAllDepartments();
//		departmentList.forEach(System.out::println);

        //get one: id: 10
//		Department department10 = departmentRepo.getOne(10);
//		System.out.println(department10);

//		List<Group> groupList = groupRepo.getAllGroups();
//		groupList.forEach(System.out::println);

//		Group group = new Group();
//		group.setName("Group 1");
//		groupRepo.create(group);

//		Department newDept = new Department();
//		newDept.setName("Ky thuat may tinh");
//
//		departmentRepo.update(5, newDept);

//		accountRepo.getAll().forEach(System.out::println);

//		addressRepo.getAll().forEach(System.out::println);

//        User user4 = userRepo.getOne(4);
//
//        Address newAddress =
//			new Address()
//			.city("HCM")
//			.street("Thu thiem")
//			.user(user4);
//
//        addressRepo.create(newAddress);

        userRepo.getAll().forEach(user -> {
            System.out.println(String.format("%s - %s", user.getId(), user.getUsername()));
            user.getUserAddressList().forEach(userAddress -> {
                System.out.println(userAddress.getAddress());
            });
        });

        addressRepo.getAll().forEach(address -> {
            System.out.println(String.format("%s - %s", address.getId(), address.getCity()));
            address.getUserAddressList().forEach(userAddress -> {
                System.out.println(userAddress.getUser());
            });
        });
    }
}
