package Inkapseling.Opdracht_1;

import java.util.ArrayList;
import java.util.List;

public class Docent {
    private String voornaam;
    private String achternaam;
    private String id;
    private List<Student> students = new ArrayList<>();
    public Docent(String voornaam, String achternaam, String id, List<Student> students) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.id = id;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
