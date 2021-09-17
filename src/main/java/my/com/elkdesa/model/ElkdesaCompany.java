package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elkdesa_company")
public class ElkdesaCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "ElkdesaCompany{" +
                "id=" + id + '\'' +
                "companyName=" + companyName + '\'' +
                '}';
    }
}
