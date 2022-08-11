package com.vti.repo;

import com.vti.entity.Department;
import com.vti.entity.Group;
import java.util.List;

public interface IGroupRepo {
    List<Group> getAllGroups();
    Group getOne(int id);
    Group create(Group group);
    Group update(int id, Group group);
    Group delete(int id);
}
