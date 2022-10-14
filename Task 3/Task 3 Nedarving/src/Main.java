import java.util.ArrayList;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<Person>();


        Teacher teacher1 = new Teacher("Lars", new ArrayList<>(Arrays.asList("Math", "English", "History")));
        Teacher teacher2 = new Teacher("Peter", new ArrayList<>(Arrays.asList("Math", "Java 1.0", "History")));

        Student student1 = new Student("Hans", new ArrayList<>(Arrays.asList("Java 1.0")));
        Student student2 = new Student("Fie", new ArrayList<>());

        // add teachers and student to the arraylist:
        persons.add(teacher1);
        persons.add(teacher2);

        persons.add(student1);
        persons.add(student2);

        for (Person p : persons)
        {
            if (!p.addCourse("Java 1.0"))
            {
                if (p instanceof Student)
                {
                    System.out.println("Student: " + p.getName() + " har allerede bestået dette kursus");
                } else
                {
                    System.out.println("Teacher: " + p.getName() + " kan ikke undervise i dette kursus");
                }
            }
        }
    }
}
