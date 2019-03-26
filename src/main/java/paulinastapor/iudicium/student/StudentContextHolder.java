package paulinastapor.iudicium.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class StudentContextHolder {
    private StudentRepository studentRepository;

    @Autowired
    public StudentContextHolder(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public String getStudentLoggedIn(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if(authentication instanceof AnonymousAuthenticationToken){
            return null;
        }
        Student student=studentRepository.findStudentByStudentEmail(authentication.getName());

        return "Hello "+student.getStudentFirstName()+"!";
    }
}
