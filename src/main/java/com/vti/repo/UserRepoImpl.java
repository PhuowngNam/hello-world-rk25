package com.vti.repo;

import com.vti.entity.Address;
import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class UserRepoImpl implements IUserRepo {

    private final HibernateUtils hibernateUtils;

    public UserRepoImpl() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<User> getAll() {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            Query<User> query = session.createQuery("from User ");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public User getOne(int id) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            return session.get(User.class, id);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public User delete(int id) {
        return null;
    }

    @Override
    public Boolean isExistedById(int id) {
        return null;
    }
}
