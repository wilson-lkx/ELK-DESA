package my.com.elkdesa.service;

import my.com.elkdesa.model.*;

import java.util.List;

public interface AccountService {

    List<ElkdesaForm> findElkdesaFormList();

    ElkdesaForm findElkdesaForm(Integer id);

    void saveElkdesaForm(ElkdesaForm elkdesaForm);

    ElkdesaForm updateElkdesaForm(ElkdesaForm elkdesaForm);

    void deleteElkdesaForm(Integer id);


    List<ElkdesaFormStatus> findElkdesaFormStatusList();

    ElkdesaFormStatus findElkdesaFormStatus(Integer id);

    void saveElkdesaFormStatus(ElkdesaFormStatus elkdesaFormStatus);

    ElkdesaFormStatus updateElkdesaFormStatus(ElkdesaFormStatus elkdesaFormStatus);

    void deleteElkdesaFormStatus(Integer id);


    List<ElkdesaJournalDocumentType> findElkdesaJournalDocumentTypeList();

    ElkdesaJournalDocumentType findElkdesaJournalDocumentType(Integer id);

    void saveElkdesaJournalDocumentType(ElkdesaJournalDocumentType elkdesaJournalDocumentType);

    ElkdesaJournalDocumentType updateElkdesaJournalDocumentType(ElkdesaJournalDocumentType elkdesaJournalDocumentType);

    void deleteElkdesaJournalDocumentType(Integer id);



    List<ElkdesaJournalEntryForm> findElkdesaJournalEntryFormList();

    ElkdesaJournalEntryForm findElkdesaJournalEntryForm(Integer id);

    void saveElkdesaJournalEntryForm(ElkdesaJournalEntryForm elkdesaJournalEntryForm);

    ElkdesaJournalEntryForm updateElkdesaJournalEntryForm(ElkdesaJournalEntryForm elkdesaJournalEntryForm);

    void deleteElkdesaJournalEntryForm(Integer id);


    List<ElkdesaJournalEntryFormData> findElkdesaJournalEntryFormDataList();

    ElkdesaJournalEntryFormData findElkdesaJournalEntryFormData(Integer id);

    void saveElkdesaJournalEntryFormData(ElkdesaJournalEntryFormData elkdesaJournalEntryFormData);

    ElkdesaJournalEntryFormData updateElkdesaJournalEntryFormData(ElkdesaJournalEntryFormData elkdesaJournalEntryFormData);

    void deleteElkdesaJournalEntryFormData(Integer id);



    List<ElkdesaJournalEntrySequence> findElkdesaJournalEntrySequenceList();

    ElkdesaJournalEntrySequence findElkdesaJournalEntrySequence(Integer id);

    void saveElkdesaJournalEntrySequence(ElkdesaJournalEntrySequence elkdesaJournalEntrySequence);

    ElkdesaJournalEntrySequence updateElkdesaJournalEntrySequence(ElkdesaJournalEntrySequence elkdesaJournalEntrySequence);

    void deleteElkdesaJournalEntrySequence(Integer id);



    List<ElkdesaJournalType> findElkdesaJournalTypeList();

    ElkdesaJournalType findElkdesaJournalType(Integer id);

    void saveElkdesaJournalType(ElkdesaJournalType elkdesaJournalType);

    ElkdesaJournalType updateElkdesaJournalType(ElkdesaJournalType elkdesaJournalType);

    void deleteElkdesaJournalType(Integer id);



    List<ElkdesaRejectedReason> findElkdesaRejectedReasonList();

    ElkdesaRejectedReason findElkdesaRejectedReason(Integer id);

    void saveElkdesaRejectedReason(ElkdesaRejectedReason elkdesaRejectedReason);

    ElkdesaRejectedReason updateElkdesaRejectedReason(ElkdesaRejectedReason elkdesaRejectedReason);

    void deleteElkdesaRejectedReason(Integer id);
}
