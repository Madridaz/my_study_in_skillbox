import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LinkedPurchaseList")
public class LinkedPurchaseList {
    @EmbeddedId
    private KeyForPurchaselist id;
    @Column(name = "student_name", insertable = false, updatable = false)
    private Integer student_id;
    @Column(name = "course_name", insertable = false, updatable = false)
    private Integer course_id;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}
