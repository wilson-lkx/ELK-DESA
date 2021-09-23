package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaAccountSupportDocument;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ElkdesaAccountSupportDocumentDaoImpl extends AbstractHibernateDaoImpl<ElkdesaAccountSupportDocument> implements ElkdesaAccountSupportDocumentDao<ElkdesaAccountSupportDocument> {

    public ElkdesaAccountSupportDocumentDaoImpl() { super(ElkdesaAccountSupportDocument.class); }
}
