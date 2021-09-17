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

    @Column(name = "rejected_reson", nullable = false)
    private String rejectedReson;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRejectedReson(String rejectedReson) {
        this.rejectedReson = rejectedReson;
    }

    public String getRejectedReson() {
        return rejectedReson;
    }

    @Override
    public String toString() {
        return "ElkdesaAccountRejectedReason{" +
                "id=" + id + '\'' +
                "rejectedReson=" + rejectedReson + '\'' +
                '}';
    }
}
