package paulinastapor.iudicium.subject;

import org.springframework.stereotype.Service;

@Service
public class SubjectDtoToSubjectEntityMapper {
    public Subject rewriteSubject(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectDto.getSubjectName());
        return subject;
    }

}
