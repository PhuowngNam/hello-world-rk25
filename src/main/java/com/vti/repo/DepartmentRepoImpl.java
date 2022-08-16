package com.vti.repo;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class DepartmentRepoImpl implements IDepartmentRepo {

    private final HibernateUtils hibernateUtils;

    public DepartmentRepoImpl() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Department> getAllDepartments() {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            Query<Department> query = session.createQuery("from Department");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Department getOne(int id) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            return session.get(Department.class, id);

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Department create(Department department) {
        Session session = null;

        try {
            session = hibernateUtils.openSession();
            session.save(department);
            return department;

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Department update(int id, Department department) {
        Session session = null;
        
        try {
            session = hibernateUtils.openSession();
            session.beginTransaction();
            // validate id exists
            if (isExistedById(id)) {
                department.setId(id);
                session.update(department);
            }
            session.getTransaction().commit();
            return department;

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Department delete(int id) {
        return null;
    }

    @Override
    public Boolean isExistedById(int id) {
        Department department = getOne(id);
        return department != null;
    }
}
