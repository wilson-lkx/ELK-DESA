package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elkdesa_form_status")
public class ElkdesaFormStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ElkdesaFormStatus{" +
                "id=" + id + '\'' +
                "status=" + status + '\'' +
                '}';
    }
}
