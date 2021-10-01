package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_rejected_reason")
public class ElkdesaRejectedReason implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rejected_form", nullable = false)
    private Integer rejectedForm;

    @Column(name = "rejected_reason", nullable = false)
    private String rejectedReason;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRejectedForm(Integer rejectedForm) {
        this.rejectedForm = rejectedForm;
    }

    public Integer getRejectedForm() {
        return rejectedForm;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    @Override
    public String toString() {
        return "ElkdesaRejectedReason{" +
                "id=" + id + '\'' +
                "rejectedForm=" + rejectedForm + '\'' +
                "rejectedReason=" + rejectedReason + '\'' +
                '}';
    }
}
