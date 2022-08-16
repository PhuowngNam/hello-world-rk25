package com.vti.repo;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class AccountRepoImpl implements IAccountRepo {

    private final HibernateUtils hibernateUtils;

    public AccountRepoImpl() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Account> getAll() {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            Query<Account> query = session.createQuery("from Account ");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
