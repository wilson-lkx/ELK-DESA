package my.com.elkdesa.dao;


import my.com.elkdesa.model.ElkdesaJournalEntrySequence;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaJournalEntrySequenceDaoImpl extends AbstractHibernateDaoImpl<ElkdesaJournalEntrySequence> implements ElkdesaJournalEntrySequenceDao<ElkdesaJournalEntrySequence>{

    public ElkdesaJournalEntrySequenceDaoImpl(){super(ElkdesaJournalEntrySequence.class);}
}
