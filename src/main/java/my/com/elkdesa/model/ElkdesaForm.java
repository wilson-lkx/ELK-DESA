package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_form")
public class ElkdesaForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "form_title", nullable = false)
    private String formTitle;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getFormTitle() {
        return formTitle;
    }

    @Override
    public String toString() {
        return "ElkdesaForm{" +
                "id=" + id + '\'' +
                "formTitle=" + formTitle + '\'' +
                '}';
    }
}
