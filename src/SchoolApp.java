import java.util.List;

public class SchoolApp {
    public static void main(String[] args) {
        Student ola = new Student("88050511223", "Ola", "Kowalska");
        ola.addMarks(5.0, 5.0);

        Student roman = new Student("88070711223", "Roman", "Kowalski", List.of(4.0, 5.0, 5.0));

        School school = new School("Hirely", List.of(ola, roman));
        School sp1 = new School("super Szkoła Podstawowa nr 1", List.of(ola, roman));
        printSchoolMarksAverage(sp1);
        School sp2 = new School("great Szkoła Podstawowa nr 2");
        printSchoolMarksAverage(sp2);
        School sp3 = new School("cool Szkola Podstawowa nr 3");
        printSchoolMarksAverage(sp3);
    }

//    private static void printSchoolMarksAverage(School school) {
//        school.calcAllStudentsAvg().ifPresentOrElse(
//                (avg -> System.out.println("Średnia ocen wszystkich uczniów w " + school.getSchoolName() + " wynosi: " + avg)),
//                () -> System.out.println(school.getSchoolName() + " nie ma uczniów. Nie można policzyć średniej.")
//        School sp1 = new School("Szkoła Podstawowa nr 1", List.of(ola, roman));
//        printSchoolMarksAverage(sp1);
//
//        School sp2 = new School("Szkoła Podstawowa nr 2");
//        printSchoolMarksAverage(sp2);
//    }

    private static void printSchoolMarksAverage(School school) {
        school.calcAllStudentsAvg().ifPresentOrElse(
                (avg -> System.out.println("Średnia ocen wszystkich uczniów w " + school.getSchoolName() + " wynosi: " + avg)),
                () -> System.out.println(school.getSchoolName() + " nie ma uczniów. Nie można policzyć średniej.")
        );
    }
}