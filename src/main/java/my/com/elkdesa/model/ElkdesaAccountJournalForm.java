package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "elkdesa_account_journal_form")
public class ElkdesaAccountJournalForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "form_no", nullable = false)
    private String formNo;

    @Column(name = "form_company", nullable = false)
    private Integer formCompany;

    @Column(name = "form_document_no", nullable = false)
    private String formDocumentNo;

    @Column(name = "form_document_date", nullable = false)
    private Date formDocumentDate;

    @Column(name = "form_journal_type", nullable = false)
    private Integer formJournalType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormCompany(Integer formCompany) {
        this.formCompany = formCompany;
    }

    public Integer getFormCompany() {
        return formCompany;
    }

    public void setFormDocumentNo(String formDocumentNo) {
        this.formDocumentNo = formDocumentNo;
    }

    public String getFormDocumentNo() {
        return formDocumentNo;
    }

    public void setFormDocumentDate(Date formDocumentDate) {
        this.formDocumentDate = formDocumentDate;
    }

    public Date getFormDocumentDate() {
        return formDocumentDate;
    }

    public void setFormJournalType(Integer formJournalType) {
        this.formJournalType = formJournalType;
    }

    public Integer getFormJournalType() {
        return formJournalType;
    }

    @Override
    public String toString() {
        return "ElkdesaAccountJournalForm{" +
                "id=" + id + '\'' +
                "formNo=" + formNo + '\'' +
                "formCompany=" + formCompany + '\'' +
                "formDocumentNo=" + formDocumentNo + '\'' +
                "formDocumentDate=" + formDocumentDate + '\'' +
                "formJournalType=" + formJournalType + '\'' +
                '}';
    }
}
