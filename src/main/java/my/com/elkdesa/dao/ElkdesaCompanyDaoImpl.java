package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaCompany;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaCompanyDaoImpl extends AbstractHibernateDaoImpl<ElkdesaCompany> implements ElkdesaCompanyDao<ElkdesaCompany>{

    public ElkdesaCompanyDaoImpl() {
        super(ElkdesaCompany.class);
    }
}
