package paulinastapor.iudicium.mark;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import paulinastapor.iudicium.subject.Subject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Subject subjectName;
    private int mark;
    private Date dateOfIssue;
}
