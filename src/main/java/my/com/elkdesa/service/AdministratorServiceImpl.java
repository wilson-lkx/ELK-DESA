package my.com.elkdesa.service;

import my.com.elkdesa.dao.ElkdesaCompanyDao;
import my.com.elkdesa.dao.ElkdesaUserDao;
import my.com.elkdesa.dao.ElkdesaUserRoleDao;
import my.com.elkdesa.model.ElkdesaCompany;
import my.com.elkdesa.model.ElkdesaUser;
import my.com.elkdesa.model.ElkdesaUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    ElkdesaCompanyDao<ElkdesaCompany> elkdesaCompanyDao;

    @Autowired
    ElkdesaUserDao<ElkdesaUser> elkdesaUserDao;

    @Autowired
    ElkdesaUserRoleDao<ElkdesaUserRole> elkdesaUserRoleDao;

    @Override
    public List<ElkdesaCompany> findElkdesaCompanyList() {
        return elkdesaCompanyDao.findAll();
    }

    @Override
    public ElkdesaCompany findElkdesaCompany(Integer id) {
        return elkdesaCompanyDao.findOne(id);
    }

    @Override
    public void saveElkdesaCompany(ElkdesaCompany elkdesaCompany) {
        elkdesaCompanyDao.save(elkdesaCompany);
    }

    @Override
    public ElkdesaCompany updateElkdesaCompany(ElkdesaCompany elkdesaCompany) {
        return elkdesaCompanyDao.update(elkdesaCompany);
    }

    @Override
    public void deleteElkdesaCompany(Integer id) {
        elkdesaCompanyDao.deleteById(id);
    }


    @Override
    public List<ElkdesaUser> findElkdesaUserList() {
        return elkdesaUserDao.findAll();
    }

    @Override
    public ElkdesaUser findElkdesaUser(Integer id) {
        return elkdesaUserDao.findOne(id);
    }

    @Override
    public void saveElkdesaUser(ElkdesaUser elkdesaUser) {
        elkdesaUserDao.save(elkdesaUser);
    }

    @Override
    public ElkdesaUser updateElkdesaUser(ElkdesaUser elkdesaUser) {
        return elkdesaUserDao.update(elkdesaUser);
    }

    @Override
    public void deleteElkdesaUser(Integer id) {
        elkdesaUserDao.deleteById(id);
    }



    @Override
    public List<ElkdesaUserRole> findElkdesaUserRoleList() {
        return elkdesaUserRoleDao.findAll();
    }

    @Override
    public ElkdesaUserRole findElkdesaUserRole(Integer id) {
        return elkdesaUserRoleDao.findOne(id);
    }

    @Override
    public void saveElkdesaUserRole(ElkdesaUserRole elkdesaUserRole) {
        elkdesaUserRoleDao.save(elkdesaUserRole);
    }

    @Override
    public ElkdesaUserRole updateElkdesaUserRole(ElkdesaUserRole elkdesaUserRole) {
        return elkdesaUserRoleDao.update(elkdesaUserRole);
    }

    @Override
    public void deleteElkdesaUserRole(Integer id) {
        elkdesaUserRoleDao.deleteById(id);
    }

}
