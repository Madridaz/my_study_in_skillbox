import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LinkedPurchaseList")
public class LinkedPurchaseList {

    @EmbeddedId
    private KeyForPurchaselist id;

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

    private Integer student_id;
    private Integer course_id;


}


//create table LinkedPurchaseList (
//        id INT NOT NULL auto_increment,
//        first_name VARCHAR(20) default NULL,
//        last_name  VARCHAR(20) default NULL,
//        salary     INT  default NULL,
//        PRIMARY KEY (id)
//        );