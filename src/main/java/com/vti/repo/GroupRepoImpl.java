package com.vti.repo;

import com.vti.entity.Group;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class GroupRepoImpl implements IGroupRepo {

    private final HibernateUtils hibernateUtils;

    public GroupRepoImpl() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Group> getAllGroups() {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            Query<Group> query = session.createQuery("from Group");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Group getOne(int id) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            return session.get(Group.class, id);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Group create(Group Group) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();
            session.save(Group);
            return Group;

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Group update(int id, Group Group) {
        return null;
    }

    @Override
    public Group delete(int id) {
        return null;
    }
}
