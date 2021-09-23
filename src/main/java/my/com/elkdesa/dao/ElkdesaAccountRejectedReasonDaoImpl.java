package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaAccountRejectedReason;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaAccountRejectedReasonDaoImpl extends AbstractHibernateDaoImpl<ElkdesaAccountRejectedReason> implements ElkdesaAccountRejectedReasonDao<ElkdesaAccountRejectedReason> {

    public ElkdesaAccountRejectedReasonDaoImpl() { super(ElkdesaAccountRejectedReason.class); }
}
