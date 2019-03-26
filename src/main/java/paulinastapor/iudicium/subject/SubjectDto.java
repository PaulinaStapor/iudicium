package paulinastapor.iudicium.subject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class SubjectDto {
    @NotBlank
    private String subjectName;
}
