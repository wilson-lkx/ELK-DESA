package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaUserRole;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
@Transactional
public class ElkdesaUserRoleDaoImpl extends AbstractHibernateDaoImpl<ElkdesaUserRole> implements ElkdesaUserRoleDao<ElkdesaUserRole> {

    public ElkdesaUserRoleDaoImpl(){ super(ElkdesaUserRole.class);}
}
