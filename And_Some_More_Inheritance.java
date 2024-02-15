class Course {
    protected String courseName;
    protected String courseCode;
    protected String classVenue;
    protected int creditHours;

    public Course(String courseName, String courseCode, String classVenue, int creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.classVenue = classVenue;
        this.creditHours = creditHours;
    }

    public void display() {
        System.out.println("course Name: " + courseName);
        System.out.println("course Code: " + courseCode);
        System.out.println("Class Venue: " + classVenue);
        System.out.println("Credit Hours: " + creditHours);
    }
}

class JavaCourse extends Course {
    private String teacherName;

    public JavaCourse(String courseName, String courseCode, String classVenue, int creditHours, String teacherName) {
        super(courseName, courseCode, classVenue, creditHours);
        this.teacherName = teacherName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Teacher Name: " + teacherName);
    }
}

public class And_Some_More_Inheritance {
    public static void main(String[] args) {
        JavaCourse j = new JavaCourse("OOP", "CS1004", "Room C17", 3, "Sir Shafique");
        j.display();
    }
}