package my.com.elkdesa.dao;


import my.com.elkdesa.model.ElkdesaForm;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaFormDaoImpl extends AbstractHibernateDaoImpl<ElkdesaForm> implements ElkdesaFormDao<ElkdesaForm>{

    public ElkdesaFormDaoImpl(){ super(ElkdesaForm.class);}
}
