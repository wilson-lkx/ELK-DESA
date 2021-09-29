package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ElkdesaUserDaoImpl extends AbstractHibernateDaoImpl <ElkdesaUser> implements ElkdesaUserDao<ElkdesaUser> {

    public ElkdesaUserDaoImpl(){ super(ElkdesaUser.class);}
}
