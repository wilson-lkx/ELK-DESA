package my.com.elkdesa.service;

import my.com.elkdesa.model.ElkdesaCompany;

import java.util.List;

public interface AdministratorService {

    List<ElkdesaCompany> findElkdesaCompanyList();

    ElkdesaCompany findElkdesaCompany(Integer id);

    void saveElkdesaCompany(ElkdesaCompany elkdesaCompany);

    ElkdesaCompany updateElkdesaCompany(ElkdesaCompany elkdesaCompany);

    void deleteElkdesaCompany(Integer id);
}
