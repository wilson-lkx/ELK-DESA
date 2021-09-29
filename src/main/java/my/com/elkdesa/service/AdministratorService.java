package my.com.elkdesa.service;

import my.com.elkdesa.model.ElkdesaCompany;
import my.com.elkdesa.model.ElkdesaUser;
import my.com.elkdesa.model.ElkdesaUserRole;

import java.util.List;

public interface AdministratorService {

    List<ElkdesaCompany> findElkdesaCompanyList();

    ElkdesaCompany findElkdesaCompany(Integer id);

    void saveElkdesaCompany(ElkdesaCompany elkdesaCompany);

    ElkdesaCompany updateElkdesaCompany(ElkdesaCompany elkdesaCompany);

    void deleteElkdesaCompany(Integer id);

    List<ElkdesaUser> findElkdesaUserList();

    ElkdesaUser findElkdesaUser(Integer id);

    void saveElkdesaUser(ElkdesaUser elkdesaUser);

    ElkdesaUser updateElkdesaUser(ElkdesaUser elkdesaUser);

    void deleteElkdesaUser(Integer id);


    List<ElkdesaUserRole> findElkdesaUserRoleList();

    ElkdesaUserRole findElkdesaUserRole(Integer id);

    void saveElkdesaUserRole(ElkdesaUserRole elkdesaUserRole);

    ElkdesaUserRole updateElkdesaUserRole(ElkdesaUserRole elkdesaUserRole);

    void deleteElkdesaUserRole(Integer id);
}
