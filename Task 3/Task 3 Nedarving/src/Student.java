import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

   public Student(String name, ArrayList<String> passedCourses)
   {
       super(name);
       this.passedCourses = passedCourses;
   }

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
