package paulinastapor.iudicium.student;

import lombok.Getter;
import lombok.Setter;
import paulinastapor.iudicium.role.Role;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentFirstName;
    private String studentLastName;
    @NotNull
    @Column(unique = true)
    private Integer studentIndexNumber;
    @Column(unique = true)
    private String studentEmail;
    private String studentPassword;
    @ManyToMany
    @JoinTable(name = "user_role")
    private Set<Role> roles;
}
