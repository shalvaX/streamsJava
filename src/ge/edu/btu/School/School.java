package ge.edu.btu.School;
import ge.edu.btu.Students.Student;
import ge.edu.btu.ReadWriter.Read;

import java.io.IOException;

public class School {
    private String name;
    private Read r = new Read("f");
    private int numOfStudents = r.getLastNumOfStuds();
    private Student[] studs = new Student[100];

    public School() throws IOException {}
    public School(String name) throws IOException {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public Student[] getStuds() {
        return studs;
    }

    public int addStudent(Student Student){
        studs[numOfStudents] = Student;
        ++numOfStudents;
        return numOfStudents;
    }

}
