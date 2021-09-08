import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class KeyForPurchaselist implements Serializable {
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course_name")
    private String courseName;

    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

}