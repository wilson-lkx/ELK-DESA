package my.com.elkdesa.service;

import my.com.elkdesa.dao.ElkdesaCompanyDao;
import my.com.elkdesa.model.ElkdesaCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    ElkdesaCompanyDao<ElkdesaCompany> elkdesaCompanyDao;



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




}
