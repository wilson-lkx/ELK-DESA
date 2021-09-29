package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_user")
public class ElkdesaUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_login_id", nullable = false)
    private String userLoginId;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_email", nullable = false)
    private String userEmail;

    @Column(name = "user_role")
    private Integer userRole;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "ElkdesaUser{" +
                "id=" + id + '\'' +
                "userLoginId=" + userLoginId + '\'' +
                "userPassword=" + userPassword + '\'' +
                "userName=" + userName + '\'' +
                "userEmail=" + userEmail + '\'' +
                "userRole=" + userRole + '\'' +
                '}';
    }
}
