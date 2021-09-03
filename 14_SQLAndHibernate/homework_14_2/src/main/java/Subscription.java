import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Subscriptions")
public class Subscription {

    @EmbeddedId
    private Key id;

    private Integer studentId;

    private Integer courseId;

    @Column(name = "student_id", insertable = false, updatable = false)
    public int getStudent_id() {
        return studentId;
    }

    public void setStudent_id(int student_id) {
        this.studentId = studentId;
    }

    @Column(name = "course_id", insertable = false, updatable = false)
    public int getCourse_id() {
        return courseId;
    }

    public void setCourse_id(int course_id) {
        this.courseId = courseId;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
