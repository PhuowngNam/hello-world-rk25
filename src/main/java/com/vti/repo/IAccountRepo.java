package com.vti.repo;

import com.vti.entity.Account;
import java.util.List;

public interface IAccountRepo {
    List<Account> getAll();
}
