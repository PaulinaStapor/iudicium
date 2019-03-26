package paulinastapor.iudicium.student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Data
public class StudentDto {
    @NotBlank
    private String studentFirstName;
    @NotBlank
    private String studentLastName;
    @NotNull
    private Integer studentIndexNumber;
    @Email
    @NotBlank
    private String studentEmail;
    @NotBlank
    @Size(min = 8)
    private String studentPassword;


}
