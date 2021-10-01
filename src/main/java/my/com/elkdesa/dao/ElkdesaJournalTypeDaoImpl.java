package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaJournalType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaJournalTypeDaoImpl extends AbstractHibernateDaoImpl<ElkdesaJournalType> implements ElkdesaJournalTypeDao<ElkdesaJournalType>{

    public ElkdesaJournalTypeDaoImpl(){ super(ElkdesaJournalType.class);}
}
