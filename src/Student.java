import java.util.*;
import java.util.stream.Stream;

public class Student {
    private String pesel;
    private String firstName;
    private String lastName;
    private List<Double> marks = Collections.EMPTY_LIST;

    @Override
    public String toString() {
        return "Student{" +
                "pesel='" + pesel + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(String pesel, String firstName, String lastName) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String pesel, String firstName, String lastName, List<Double> marks) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public void addMark(double mark) {
        this.marks.add(mark);
    }

    public void addMarks(double... marks) {
        this.marks = Stream.concat(
                this.marks.stream(),
                Arrays.stream(marks).boxed()
        ).toList();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public OptionalDouble calcMarksAvg() {
        return marks.stream().mapToDouble(d -> d).average();
    }
}
