package my.com.elkdesa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "elkdesa_journal_document_type")
public class ElkdesaJournalDocumentType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_journal_type", nullable = false)
    private Integer documentJournalType;

    @Column(name = "document_type", nullable = false)
    private String documentType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDocumentJournalType(Integer documentJournalType) {
        this.documentJournalType = documentJournalType;
    }

    public Integer getDocumentJournalType() {
        return documentJournalType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentType() {
        return documentType;
    }

    @Override
    public String toString() {
        return "ElkdesaJournalDocumentType{" +
                "id=" + id + '\'' +
                "documentJournalType=" + documentJournalType + '\'' +
                "documentType=" + documentType + '\'' +
                '}';
    }
}
