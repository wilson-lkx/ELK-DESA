package my.com.elkdesa.service;

import my.com.elkdesa.model.ElkdesaAccountJournalType;
import my.com.elkdesa.model.ElkdesaAccountRejectedReason;
import my.com.elkdesa.model.ElkdesaAccountSupportDocument;

import java.util.List;

public interface AccountService {

    List<ElkdesaAccountJournalType> findElkdesaAccountJournalList();

    ElkdesaAccountJournalType findElkdesaAccountJournalType(Integer id);

    void saveElkdesaAccountJournalType(ElkdesaAccountJournalType elkdesaAccountJournalType);

    ElkdesaAccountJournalType updateElkdesaAccountJournalType(ElkdesaAccountJournalType elkdesaAccountJournalType);

    void deleteElkdesaAccountJournalType(Integer id);


    List<ElkdesaAccountSupportDocument> findElkdesaAccountSupportDocumentList();

    ElkdesaAccountSupportDocument findElkdesaAccountSupportDocument(Integer id);

    void saveElkdesaAccountSupportDocument(ElkdesaAccountSupportDocument elkdesaAccountSupportDocument);

    ElkdesaAccountSupportDocument updateElkdesaAccountSupportDocument(ElkdesaAccountSupportDocument elkdesaAccountSupportDocument);

    void deleteElkdesaAccountSupportDocument(Integer id);


    List<ElkdesaAccountRejectedReason> findElkdesaAccountRejectedReasonList();

    ElkdesaAccountRejectedReason findElkdesaAccountRejectedReason(Integer id);

    void saveElkdesaAccountRejectedReason(ElkdesaAccountRejectedReason elkdesaAccountRejectedReason);

    ElkdesaAccountRejectedReason updateElkdesaAccountRejectedReason(ElkdesaAccountRejectedReason elkdesaAccountRejectedReason);

    void deleteElkdesaAccountRejectedReason(Integer id);
}
