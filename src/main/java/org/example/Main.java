package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student stud = new Student();
        stud.setFullName("Ivan Ivanov");
        stud.setUniversityId("001-tech");
        stud.setCurrentCourseNumber(4);
        stud.setAvgExamScore(4.0f);
        System.out.println(stud);

        University univ = new University();
        univ.setId("001-tech");
        univ.setFullName("DonGosTehUniver");
        univ.setShortName("DGTU");
        univ.setYearOfFoundation(1957);
        univ.setMainProfile(StudyProfile.IT_TEHNOLOGY);
        System.out.println(univ);

    }
}