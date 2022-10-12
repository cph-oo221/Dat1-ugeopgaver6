import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> canTeach = new ArrayList<String>();
    ArrayList<String> currentCourses = new ArrayList<String>();

    // Lav om i konstruktørerne, så der skal gives en ArrayList af passedCourses eller canTeach med, når objektet oprettes.
    public Teacher(String name, ArrayList<String> canTeach)
    {
        super(name);
        this.canTeach = canTeach;
    }


    @Override
    public boolean addCourse(String course)
    {
        if (canTeach.contains(course))
        {
            currentCourses.add(course);
            return true;
        }
        else
        {
            return false;
        }
    }



}
