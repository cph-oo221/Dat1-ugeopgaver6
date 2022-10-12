import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourses = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

   public Student(String name)
   {
       super(name);

   }

   // 3.4: make a method that's overrids addcourse
   // remaber that students course can be added to passedCoursses
   // because the course have all-rdy been passed
   @Override
    public boolean addCourse(String course)
    {
         if (passedCourses.contains(course))
         {
              return false;
         }
         else
         {
              currentCourses.add(course);
              return true;
         }
    }

}
