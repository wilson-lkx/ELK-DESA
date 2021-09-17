package my.com.elkdesa.service;

import my.com.elkdesa.dao.ElkdesaCompanyDao;
import my.com.elkdesa.model.ElkdesaCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    ElkdesaCompanyDao<ElkdesaCompany> elkdesaCompanyDao;

    @Override
    public List<ElkdesaCompany> findElkdesaCompanyList() {
        return elkdesaCompanyDao.findAll();
    }
}
