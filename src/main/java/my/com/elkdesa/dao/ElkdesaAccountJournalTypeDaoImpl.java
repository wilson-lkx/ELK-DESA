package my.com.elkdesa.dao;

import my.com.elkdesa.model.ElkdesaAccountJournalType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ElkdesaAccountJournalTypeDaoImpl  extends AbstractHibernateDaoImpl<ElkdesaAccountJournalType> implements ElkdesaAccountJournalTypeDao<ElkdesaAccountJournalType>{

    public ElkdesaAccountJournalTypeDaoImpl() {
        super(ElkdesaAccountJournalType.class);
    }
}
