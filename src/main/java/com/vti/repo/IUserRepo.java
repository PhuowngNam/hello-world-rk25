package com.vti.repo;

import com.vti.entity.User;
import java.util.List;

public interface IUserRepo {
    List<User> getAll();
    User getOne(int id);
    User create(User user);
    User update(int id, User user);
    User delete(int id);
    Boolean isExistedById(int id);
}
