package Inkapseling.Opdracht_1;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String...args)
    {
        List<Student> ls = new ArrayList<Student>();
        Student s1 = new Student("jeroen","weber","1234567");
        ls.add(s1);
        Student s2 = new Student("kees","haverkamp","1234568");
        ls.add(s2);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        Docent docent = new Docent("test", "test", "123", students);
    }
}
