import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private long id;
    private List<String> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    // returns the student's id
    public static long getId(long id){
        return id;
    }

    // returns the student's name
    public static String getName(String name){
        return name;
    }

    // adds the given grade to the grades list
    public static void addGrade(int grade){
//        grade.add

    }
//
//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){
//
//    }
//
//    // returns the average of the students grades
//    public double getGradeAverage(){
//
//    }

}
