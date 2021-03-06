/*
 * CS3810 - Principles of Database Systems - Spring 2021
 * Instructor: Thyago Mota
 * Description: DB 03 - EnrollmentPK
 * Student(s) Name(s): Brandon Young, Stuart Griffin, Timothy Trusov
 */

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EnrollmentPK implements Serializable {

    @Id
    private String code;
    @Id
    private int id;

    public String getCode(){return code;}

    public void setCode(String code){this.code = code;}

    public int getId(){return id;}

    public void setId(int id){this.id = id;}
}
