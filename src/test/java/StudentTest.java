import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetId() {
        assertEquals(723720687, Student.getId(723720687));
    }

    @Test
    public void testGetName() {
        assertEquals("Cierra", Student.getName("Cierra"));
    }

    @Test
    public void testAddGrade() {
//        assertEquals(70, Student.addGrade(70));
    }

    @Test
    public void testGetGrades() {

    }

    @Test
    public void testGetGradeAverage() {

    }

}
