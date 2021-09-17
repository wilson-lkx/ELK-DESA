package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "elkdesa_account_journal_form_data")
public class ElkdesaAccountJournalFormData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "form_id", nullable = false)
    private Integer formId;

    @Column(name = "form_status", nullable = false)
    private Integer formStatus;

    @Column(name = "form_rejected")
    private Integer formRejected;

    @Column(name = "form_remark")
    private String formRemark;

    @Column(name = "form_raised_by", nullable = false)
    private Integer formRaisedBy;

    @Column(name = "form_raised_datetime", nullable = false)
    private Date formRaisedDatetime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormStatus(Integer formStatus) {
        this.formStatus = formStatus;
    }

    public Integer getFormStatus() {
        return formStatus;
    }

    public void setFormRejected(Integer formRejected) {
        this.formRejected = formRejected;
    }

    public Integer getFormRejected() {
        return formRejected;
    }

    public void setFormRemark(String formRemark) {
        this.formRemark = formRemark;
    }

    public String getFormRemark() {
        return formRemark;
    }

    public void setFormRaisedBy(Integer formRaisedBy) {
        this.formRaisedBy = formRaisedBy;
    }

    public Integer getFormRaisedBy() {
        return formRaisedBy;
    }

    public void setFormRaisedDatetime(Date formRaisedDatetime) {
        this.formRaisedDatetime = formRaisedDatetime;
    }

    public Date getFormRaisedDatetime() {
        return formRaisedDatetime;
    }

    @Override
    public String toString() {
        return "ElkdesaAccountJournalFormData{" +
                "id=" + id + '\'' +
                "formId=" + formId + '\'' +
                "formStatus=" + formStatus + '\'' +
                "formRejected=" + formRejected + '\'' +
                "formRemark=" + formRemark + '\'' +
                "formRaisedBy=" + formRaisedBy + '\'' +
                "formRaisedDatetime=" + formRaisedDatetime + '\'' +
                '}';
    }
}
