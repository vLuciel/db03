/*
 * CS3810 - Principles of Database Systems - Spring 2021
 * Instructor: Thyago Mota
 * Description: DB 03 - Controller
 * Student(s) Name(s): Brandon Young, Stuart Griffin, Timothy Trusov
 */

import org.hibernate.Session;
import org.hibernate.internal.SessionImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Controller {

    private EntityManager em;
    private Session session;

    public Controller() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db03");
        em = emf.createEntityManager();
        session = em.unwrap(Session.class);
    }

    // TODO: return a Student entity from the given id (or null if the entity does not exist)
    public Student getStudent(int id) {

        // new Student();
        Student testStudent = new Student();

        if(getStudent(id) != null){

            // student = something here, then return it

            System.out.println("This one worked!!!!!!!!!!");
            return testStudent;

        }

        System.out.println("I don't think this one worked!!!!!!!!!!");
        return null;

    }

    // TODO: add the given student entity, returning true/false depending whether the operation was successful or not
    public boolean addStudent(final Student student) {


        boolean flag = true;

        if (false){
            // this is used to check if student successfully was added
            return false;
        }

        // student.add();

        return flag;
    }

    // TODO: return a list of all Course entities
    public List<Course> getCourses() {
        return null;
    }

    // TODO: enroll a student to a course based on the given parameters, returning true/false depending whether the operation was successful or not
    public boolean enrollStudent(String code, int id) {
        return false;
    }

    // TODO: drop a student from a course based on the given parameters, returning true/false depending whether the operation was successful or not
    public boolean dropStudent(String code, int id) {
        return false;
    }

    // TODO: return a list of all Student entities enrolled in the given course (hint: use the stored procedure 'list_students')
    public List<Student> getStudentsEnrolled(String course) {

        /* SessionImpl sessionImpl = (SessionImpl) session;
        Connection conn = sessionImpl.connection(); */
        return null;
    }
}
