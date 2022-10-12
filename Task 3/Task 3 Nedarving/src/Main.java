import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //3.6 TEST class of student and teacher

        // make a number of students and teachers
        Teacher teacher1 = new Teacher("Lars", new ArrayList<String>(Arrays.asList("Math", "English", "History")));
        Teacher teacher2 = new Teacher("Peter", new ArrayList<String>(Arrays.asList("Math", "English", "History")));

        Student student1 = new Student("Hans");
        Student student2 = new Student("Fie");

        // add some courses to the students and teachers

        // teacher1: Math, English, History
        teacher1.addCourse("Math");
        teacher1.addCourse("English");
        teacher1.addCourse("History");

        teacher2.addCourse("Math");
        teacher2.addCourse("English");
        teacher2.addCourse("History");

        // student: addCourse
        student1.addCourse("Math");
        student1.addCourse("English");
        student1.addCourse("History");

        student2.addCourse("Math");
        student2.addCourse("English");
        student2.addCourse("History");

        // Make a arraylist of person
        ArrayList<Person> persons = new ArrayList<Person>();

        // add teachers and student to the arraylist:
        persons.add(teacher1);
        persons.add(teacher2);

        persons.add(student1);
        persons.add(student2);
        

        //3.7 make for loop and a course: Java 1.0.
        // make sure some of the students allready has passed this course and some student has'nt passed.
        // make sure that the teacher can teach this course "Java 1.0" and some can't.






    }
}
