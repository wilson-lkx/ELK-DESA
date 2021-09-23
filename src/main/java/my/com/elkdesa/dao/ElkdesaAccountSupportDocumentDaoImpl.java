package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaAccountSupportDocument;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository
@Transactional
public class ElkdesaAccountSupportDocumentDaoImpl extends AbstractHibernateDaoImpl<ElkdesaAccountSupportDocument> implements ElkdesaAccountSupportDocumentDao<ElkdesaAccountSupportDocument> {

    public ElkdesaAccountSupportDocumentDaoImpl() { super(ElkdesaAccountSupportDocument.class); }

    @Override
    public List<ElkdesaAccountSupportDocument> findElkdesaAccountSupportDocumentByJournalType(Integer journalType) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ElkdesaAccountSupportDocument> criteriaQuery = builder.createQuery(ElkdesaAccountSupportDocument.class);
        Root<ElkdesaAccountSupportDocument> root = criteriaQuery.from(ElkdesaAccountSupportDocument.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("documentJournalType"), journalType));
        TypedQuery<ElkdesaAccountSupportDocument> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
