package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elkdesa_account_journal_type")
public class ElkdesaAccountJournalType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "journal_type", nullable = false)
    private String journalType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setJournalType(String journalType) {
        this.journalType = journalType;
    }

    public String getJournalType() {
        return journalType;
    }

    @Override
    public String toString() {
        return "ElkdesaAccountJournalType{" +
                "id=" + id + '\'' +
                "journalType=" + journalType + '\'' +
                '}';
    }
}
