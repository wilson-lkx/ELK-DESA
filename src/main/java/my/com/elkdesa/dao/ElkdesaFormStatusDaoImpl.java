package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaFormStatus;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaFormStatusDaoImpl extends AbstractHibernateDaoImpl<ElkdesaFormStatus> implements ElkdesaFormStatusDao<ElkdesaFormStatus> {

    public ElkdesaFormStatusDaoImpl(){ super(ElkdesaFormStatus.class);}
}
