package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaJournalEntryForm;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaJournalEntryFormDaoImpl extends AbstractHibernateDaoImpl<ElkdesaJournalEntryForm> implements ElkdesaJournalEntryFormDao<ElkdesaJournalEntryForm> {

    public ElkdesaJournalEntryFormDaoImpl(){ super(ElkdesaJournalEntryForm.class);}
}
