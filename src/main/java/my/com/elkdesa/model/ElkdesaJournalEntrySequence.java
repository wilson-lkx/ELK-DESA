package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_journal_entry_sequence")
public class ElkdesaJournalEntrySequence implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sequence_no", nullable = false)
    private String sequenceNo;

    @Column(name = "created_datetime", nullable = false)
    private Date createdDatetime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    @Override
    public String toString() {
        return "ElkdesaJournalEntrySequence{" +
                "id=" + id + '\'' +
                "sequenceNo=" + sequenceNo + '\'' +
                "createdDatetime=" + createdDatetime + '\'' +
                '}';
    }
}
