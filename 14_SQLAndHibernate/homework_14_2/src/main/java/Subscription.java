import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Subscriptions")
public class Subscription {
    public Key getId() {
        return id;
    }

    public void setId(Key id) {
        this.id = id;
    }

    @EmbeddedId
    private Key id;
    private Integer studentId;
    private Integer courseId;
    private Date subscriptionDate;

    @Column(name = "student_id", insertable = false, updatable = false)
    public Integer getStudent_id() {
        return studentId;
    }

    public void setStudent_id(Integer student_id) {
        this.studentId = studentId;
    }

    @Column(name = "course_id", insertable = false, updatable = false)
    public Integer getCourse_id() {
        return courseId;
    }

    public void setCourse_id(Integer course_id) {
        this.courseId = courseId;
    }

    @Column(name = "subscription_date")
    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }


}