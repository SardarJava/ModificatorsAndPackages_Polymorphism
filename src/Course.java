public class Course {
    private String courseName;
    private int number;
    private String courseTeachers;
    private Group[] groups;

    public Course (){}

    public Course(String courseName, int number, String courseTeachers, Group[] groups) {
        this.courseName = courseName;
        this.number = number;
        this.courseTeachers = courseTeachers;
        this.groups = groups;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourseTeachers() {
        return courseTeachers;
    }

    public void setCourseTeachers(String courseTeachers) {
        this.courseTeachers = courseTeachers;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
