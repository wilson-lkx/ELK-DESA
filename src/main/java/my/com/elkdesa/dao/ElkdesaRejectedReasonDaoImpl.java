package my.com.elkdesa.dao;


import my.com.elkdesa.model.ElkdesaRejectedReason;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaRejectedReasonDaoImpl extends AbstractHibernateDaoImpl<ElkdesaRejectedReason> implements ElkdesaRejectedReasonDao<ElkdesaRejectedReason>{

    public ElkdesaRejectedReasonDaoImpl(){super(ElkdesaRejectedReason.class);}
}
