package my.com.elkdesa.dao;

import java.io.Serializable;
import java.util.List;

public interface ElkdesaAccountSupportDocumentDao <T extends Serializable> extends AbstractHibernateDao<T> {

    List<T> findElkdesaAccountSupportDocumentByJournalType(Integer journalType);
}
