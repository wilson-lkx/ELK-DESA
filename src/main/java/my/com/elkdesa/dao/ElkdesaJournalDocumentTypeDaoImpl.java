package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaJournalDocumentType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaJournalDocumentTypeDaoImpl extends AbstractHibernateDaoImpl<ElkdesaJournalDocumentType> implements ElkdesaJournalDocumentTypeDao <ElkdesaJournalDocumentType> {

    public ElkdesaJournalDocumentTypeDaoImpl(){ super(ElkdesaJournalDocumentType.class);}

}
