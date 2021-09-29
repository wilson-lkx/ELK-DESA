package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_user_role")
public class ElkdesaUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_role", nullable = false)
    private String userRole;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "ElkdesaUserRole{" +
                "id=" + id + '\'' +
                "userRole=" + userRole + '\'' +
                '}';
    }
}
