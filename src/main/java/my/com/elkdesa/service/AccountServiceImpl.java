package my.com.elkdesa.service;

import my.com.elkdesa.dao.*;
import my.com.elkdesa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    ElkdesaFormDao<ElkdesaForm> elkdesaFormDao;

    @Autowired
    ElkdesaFormStatusDao<ElkdesaFormStatus> elkdesaFormStatusDao;

    @Autowired
    ElkdesaJournalDocumentTypeDao<ElkdesaJournalDocumentType> elkdesaJournalDocumentTypeDao;

    @Autowired
    ElkdesaJournalEntryFormDao<ElkdesaJournalEntryForm> elkdesaJournalEntryFormDao;

    @Autowired
    ElkdesaJournalEntryFormDataDao<ElkdesaJournalEntryFormData> elkdesaJournalEntryFormDataDao;

    @Autowired
    ElkdesaJournalEntrySequenceDao<ElkdesaJournalEntrySequence> elkdesaJournalEntrySequenceDao;

    @Autowired
    ElkdesaJournalTypeDao<ElkdesaJournalType> elkdesaJournalTypeDao;

    @Autowired
    ElkdesaRejectedReasonDao<ElkdesaRejectedReason> elkdesaRejectedReasonDao;

    @Override
    public List<ElkdesaForm> findElkdesaFormList() {
        return elkdesaFormDao.findAll();
    }

    @Override
    public ElkdesaForm findElkdesaForm(Integer id) {
        return elkdesaFormDao.findOne(id);
    }

    @Override
    public void saveElkdesaForm(ElkdesaForm elkdesaForm) {
        elkdesaFormDao.save(elkdesaForm);
    }

    @Override
    public ElkdesaForm updateElkdesaForm(ElkdesaForm elkdesaForm) {return elkdesaFormDao.update(elkdesaForm);}

    @Override
    public void deleteElkdesaForm(Integer id) {elkdesaFormDao.deleteById(id);}



    @Override
    public List<ElkdesaFormStatus> findElkdesaFormStatusList() {
        return elkdesaFormStatusDao.findAll();
    }

    @Override
    public ElkdesaFormStatus findElkdesaFormStatus(Integer id) {
        return elkdesaFormStatusDao.findOne(id);
    }

    @Override
    public void saveElkdesaFormStatus(ElkdesaFormStatus elkdesaFormStatus) {
        elkdesaFormStatusDao.save(elkdesaFormStatus);
    }

    @Override
    public ElkdesaFormStatus updateElkdesaFormStatus(ElkdesaFormStatus elkdesaFormStatus) {
        return elkdesaFormStatusDao.update(elkdesaFormStatus);
    }

    @Override
    public void deleteElkdesaFormStatus(Integer id) {
        elkdesaFormStatusDao.deleteById(id);
    }



    @Override
    public List<ElkdesaJournalDocumentType> findElkdesaJournalDocumentTypeList() {
        return elkdesaJournalDocumentTypeDao.findAll();
    }

    @Override
    public ElkdesaJournalDocumentType findElkdesaJournalDocumentType(Integer id) {
        return elkdesaJournalDocumentTypeDao.findOne(id);
    }

    @Override
    public void saveElkdesaJournalDocumentType(ElkdesaJournalDocumentType elkdesaJournalDocumentType) {
        elkdesaJournalDocumentTypeDao.save(elkdesaJournalDocumentType);
    }

    @Override
    public ElkdesaJournalDocumentType updateElkdesaJournalDocumentType(ElkdesaJournalDocumentType elkdesaJournalDocumentType) {
        return elkdesaJournalDocumentTypeDao.update(elkdesaJournalDocumentType);
    }

    @Override
    public void deleteElkdesaJournalDocumentType(Integer id) {
        elkdesaJournalDocumentTypeDao.deleteById(id);
    }



    @Override
    public List<ElkdesaJournalEntryForm> findElkdesaJournalEntryFormList() {
        return elkdesaJournalEntryFormDao.findAll();
    }

    @Override
    public ElkdesaJournalEntryForm findElkdesaJournalEntryForm(Integer id) {
        return elkdesaJournalEntryFormDao.findOne(id);
    }

    @Override
    public void saveElkdesaJournalEntryForm(ElkdesaJournalEntryForm elkdesaJournalEntryForm) {
        elkdesaJournalEntryFormDao.save(elkdesaJournalEntryForm);
    }

    @Override
    public ElkdesaJournalEntryForm updateElkdesaJournalEntryForm(ElkdesaJournalEntryForm elkdesaJournalEntryForm) {
        return elkdesaJournalEntryFormDao.update(elkdesaJournalEntryForm);
    }

    @Override
    public void deleteElkdesaJournalEntryForm(Integer id) {
        elkdesaJournalEntryFormDao.deleteById(id);
    }



    @Override
    public List<ElkdesaJournalEntryFormData> findElkdesaJournalEntryFormDataList() {
        return elkdesaJournalEntryFormDataDao.findAll();
    }

    @Override
    public ElkdesaJournalEntryFormData findElkdesaJournalEntryFormData(Integer id) {
        return elkdesaJournalEntryFormDataDao.findOne(id);
    }

    @Override
    public void saveElkdesaJournalEntryFormData(ElkdesaJournalEntryFormData elkdesaJournalEntryFormData) {
        elkdesaJournalEntryFormDataDao.save(elkdesaJournalEntryFormData);
    }

    @Override
    public ElkdesaJournalEntryFormData updateElkdesaJournalEntryFormData(ElkdesaJournalEntryFormData elkdesaJournalEntryFormData) {
        return elkdesaJournalEntryFormDataDao.update(elkdesaJournalEntryFormData);
    }

    @Override
    public void deleteElkdesaJournalEntryFormData(Integer id) {
        elkdesaJournalEntryFormDataDao.deleteById(id);
    }




    @Override
    public List<ElkdesaJournalEntrySequence> findElkdesaJournalEntrySequenceList() {
        return elkdesaJournalEntrySequenceDao.findAll();
    }

    @Override
    public ElkdesaJournalEntrySequence findElkdesaJournalEntrySequence(Integer id) {
        return elkdesaJournalEntrySequenceDao.findOne(id);
    }

    @Override
    public void saveElkdesaJournalEntrySequence(ElkdesaJournalEntrySequence elkdesaJournalEntrySequence) {
        elkdesaJournalEntrySequenceDao.save(elkdesaJournalEntrySequence);
    }

    @Override
    public ElkdesaJournalEntrySequence updateElkdesaJournalEntrySequence(ElkdesaJournalEntrySequence elkdesaJournalEntrySequence) {
        return elkdesaJournalEntrySequenceDao.update(elkdesaJournalEntrySequence);
    }

    @Override
    public void deleteElkdesaJournalEntrySequence(Integer id) {
        elkdesaJournalEntrySequenceDao.deleteById(id);
    }



    @Override
    public List<ElkdesaJournalType> findElkdesaJournalTypeList() {
        return elkdesaJournalTypeDao.findAll();
    }

    @Override
    public ElkdesaJournalType findElkdesaJournalType(Integer id) {
        return elkdesaJournalTypeDao.findOne(id);
    }

    @Override
    public void saveElkdesaJournalType(ElkdesaJournalType elkdesaJournalType) {
        elkdesaJournalTypeDao.save(elkdesaJournalType);
    }

    @Override
    public ElkdesaJournalType updateElkdesaJournalType(ElkdesaJournalType elkdesaJournalType) {
        return elkdesaJournalTypeDao.update(elkdesaJournalType);
    }

    @Override
    public void deleteElkdesaJournalType(Integer id) {
        elkdesaJournalTypeDao.deleteById(id);
    }



    @Override
    public List<ElkdesaRejectedReason> findElkdesaRejectedReasonList() {
        return elkdesaRejectedReasonDao.findAll();
    }

    @Override
    public ElkdesaRejectedReason findElkdesaRejectedReason(Integer id) {
        return elkdesaRejectedReasonDao.findOne(id);
    }

    @Override
    public void saveElkdesaRejectedReason(ElkdesaRejectedReason elkdesaRejectedReason) {
        elkdesaRejectedReasonDao.save(elkdesaRejectedReason);
    }

    @Override
    public ElkdesaRejectedReason updateElkdesaRejectedReason(ElkdesaRejectedReason elkdesaRejectedReason) {
        return elkdesaRejectedReasonDao.update(elkdesaRejectedReason);
    }

    @Override
    public void deleteElkdesaRejectedReason(Integer id) {
        elkdesaRejectedReasonDao.deleteById(id);
    }

}
