import java.time.LocalDate;

public class Group {
    private Student[] students;
    private String course;
    private LocalDate dateOfStart;

    public Group (){}

    public Group(Student[] students, String course, LocalDate dateOfStart) {
        this.students = students;
        this.course = course;
        this.dateOfStart = dateOfStart;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }
}
