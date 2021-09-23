package my.com.elkdesa.service;

import my.com.elkdesa.dao.ElkdesaAccountJournalTypeDao;
import my.com.elkdesa.dao.ElkdesaAccountRejectedReasonDao;
import my.com.elkdesa.dao.ElkdesaAccountSupportDocumentDao;
import my.com.elkdesa.model.ElkdesaAccountJournalType;
import my.com.elkdesa.model.ElkdesaAccountRejectedReason;
import my.com.elkdesa.model.ElkdesaAccountSupportDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    ElkdesaAccountJournalTypeDao<ElkdesaAccountJournalType> elkdesaAccountJournalTypeDao;

    @Autowired
    ElkdesaAccountSupportDocumentDao<ElkdesaAccountSupportDocument> elkdesaAccountSupportDocumentDao;

    @Autowired
    ElkdesaAccountRejectedReasonDao<ElkdesaAccountRejectedReason> elkdesaAccountRejectedReasonDao;

    @Override
    public List<ElkdesaAccountJournalType> findElkdesaAccountJournalList() {
        return elkdesaAccountJournalTypeDao.findAll("journalType");
    }

    @Override
    public ElkdesaAccountJournalType findElkdesaAccountJournalType(Integer id) {
        return elkdesaAccountJournalTypeDao.findOne(id);
    }

    @Override
    public void saveElkdesaAccountJournalType(ElkdesaAccountJournalType elkdesaAccountJournalType) {
        elkdesaAccountJournalTypeDao.save(elkdesaAccountJournalType);
    }

    @Override
    public ElkdesaAccountJournalType updateElkdesaAccountJournalType(ElkdesaAccountJournalType elkdesaAccountJournalType) {
        return elkdesaAccountJournalTypeDao.update(elkdesaAccountJournalType);
    }

    @Override
    public void deleteElkdesaAccountJournalType(Integer id) {
        elkdesaAccountJournalTypeDao.deleteById(id);
    }

    @Override
    public List<ElkdesaAccountSupportDocument> findElkdesaAccountSupportDocumentList() {
        return elkdesaAccountSupportDocumentDao.findAll();
    }

    @Override
    public List<ElkdesaAccountSupportDocument> findElkdesaAccountSupportDocumentByJournalType(Integer journalType) {
        return elkdesaAccountSupportDocumentDao.findElkdesaAccountSupportDocumentByJournalType(journalType);
    }

    @Override
    public ElkdesaAccountSupportDocument findElkdesaAccountSupportDocument(Integer id) {
        return elkdesaAccountSupportDocumentDao.findOne(id);
    }

    @Override
    public void saveElkdesaAccountSupportDocument(ElkdesaAccountSupportDocument elkdesaAccountSupportDocument) {
        elkdesaAccountSupportDocumentDao.save(elkdesaAccountSupportDocument);
    }

    @Override
    public ElkdesaAccountSupportDocument updateElkdesaAccountSupportDocument(ElkdesaAccountSupportDocument elkdesaAccountSupportDocument) {
        return elkdesaAccountSupportDocumentDao.update(elkdesaAccountSupportDocument);
    }

    @Override
    public void deleteElkdesaAccountSupportDocument(Integer id) {
        elkdesaAccountSupportDocumentDao.deleteById(id);
    }

    @Override
    public List<ElkdesaAccountRejectedReason> findElkdesaAccountRejectedReasonList() {
        return elkdesaAccountRejectedReasonDao.findAll();
    }

    @Override
    public ElkdesaAccountRejectedReason findElkdesaAccountRejectedReason(Integer id) {
        return elkdesaAccountRejectedReasonDao.findOne(id);
    }

    @Override
    public void saveElkdesaAccountRejectedReason(ElkdesaAccountRejectedReason elkdesaAccountRejectedReason) {
        elkdesaAccountRejectedReasonDao.save(elkdesaAccountRejectedReason);
    }

    @Override
    public ElkdesaAccountRejectedReason updateElkdesaAccountRejectedReason(ElkdesaAccountRejectedReason elkdesaAccountRejectedReason) {
        return elkdesaAccountRejectedReasonDao.update(elkdesaAccountRejectedReason);
    }

    @Override
    public void deleteElkdesaAccountRejectedReason(Integer id) {
        elkdesaAccountRejectedReasonDao.deleteById(id);
    }

}
