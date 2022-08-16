package com.vti.repo;

import com.vti.entity.Address;
import java.util.List;

public interface IAddressRepo {
    List<Address> getAll();
    Address getOne(int id);
    Address create(Address address);
    Address update(int id, Address address);
    Address delete(int id);
    Boolean isExistedById(int id);
}
