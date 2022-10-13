import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

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
         if (this.passedCourses.contains(course))
         {
             return false;
         }
         else
         {
              this.currentCourses.add(course);
              return true;
         }
    }

    public ArrayList<String> getCourses() {
       return this.currentCourses;
    }
}
