import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class School {
    private String schoolName;

    public List<Student> getStudents() {
        return students;
    }

    private List<Student> students = Collections.EMPTY_LIST;

    public School(String schoolName, List<Student> students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student s) {
        addStudents(s);
    }

    public void addStudents(Student... students) {
        this.students = Stream.concat(
                this.students.stream(),
                Arrays.stream(students)
        ).toList();
    }

    public OptionalDouble calcAllStudentsAvg() {
        return students.stream()
                .map(Student::calcMarksAvg)
                .filter(OptionalDouble::isPresent)
                .mapToDouble(OptionalDouble::getAsDouble)
                .average();
    }

    public String getSchoolName() {
        return schoolName;
    }
}
