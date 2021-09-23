package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elkdesa_account_rejected_reason")
public class ElkdesaAccountRejectedReason implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rejected_reason", nullable = false)
    private String rejectedReason;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    @Override
    public String toString() {
        return "ElkdesaAccountRejectedReason{" +
                "id=" + id + '\'' +
                "rejectedReason=" + rejectedReason + '\'' +
                '}';
    }
}
