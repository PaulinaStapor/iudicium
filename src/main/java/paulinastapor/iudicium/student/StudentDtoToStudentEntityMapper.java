package paulinastapor.iudicium.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Struct;

@Service
public class StudentDtoToStudentEntityMapper {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
public StudentDtoToStudentEntityMapper(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }
    public Student rewrite (StudentDto studentDto){
        Student student=new Student();
        student.setStudentFirstName(studentDto.getStudentFirstName());
        student.setStudentLastName(studentDto.getStudentLastName());
        student.setStudentIndexNumber(studentDto.getStudentIndexNumber());
        student.setStudentEmail(studentDto.getStudentEmail());
        student.setStudentPassword(bCryptPasswordEncoder.encode(studentDto.getStudentPassword()));

        return student;
    }
}
