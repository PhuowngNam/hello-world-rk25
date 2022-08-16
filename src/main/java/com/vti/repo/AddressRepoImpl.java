package com.vti.repo;

import com.vti.entity.Address;
import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class AddressRepoImpl implements IAddressRepo {

    private final HibernateUtils hibernateUtils;

    public AddressRepoImpl() {
        this.hibernateUtils = HibernateUtils.getInstance();
    }

    @Override
    public List<Address> getAll() {
        Session session = null;

        try {
            session = hibernateUtils.openSession();

            Query<Address> query = session.createQuery("from Address ");

            return query.list();

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Address getOne(int id) {
        return null;
    }

    @Override
    public Address create(Address address) {

        Session session = null;

        try {
            session = hibernateUtils.openSession();
            session.save(address);
            return address;

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Address update(int id, Address address) {
        return null;
    }

    @Override
    public Address delete(int id) {
        return null;
    }

    @Override
    public Boolean isExistedById(int id) {
        return null;
    }
}
