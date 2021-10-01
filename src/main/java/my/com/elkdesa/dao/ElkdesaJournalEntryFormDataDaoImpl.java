package my.com.elkdesa.dao;


import my.com.elkdesa.model.ElkdesaJournalEntryFormData;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaJournalEntryFormDataDaoImpl extends AbstractHibernateDaoImpl<ElkdesaJournalEntryFormData> implements ElkdesaJournalEntryFormDataDao<ElkdesaJournalEntryFormData>{

    public ElkdesaJournalEntryFormDataDaoImpl(){ super(ElkdesaJournalEntryFormData.class);}


}
