package ge.edu.btu;
import ge.edu.btu.ReadWriter.Read;
import ge.edu.btu.ReadWriter.Write;
import ge.edu.btu.Students.FirstStepStudent;
import java.io.IOException;

public class Runner {
    private static FirstStepStudent st1 = new FirstStepStudent("test",12.4,20,"1234124",6,100,"First");
    private static Write w;
    private static Read r;

    static {
        try {
            r = new Read("Saved.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static {
        try {
            w = new Write("Saved.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
            w.save(st1);
            r.getStudents();
    }
}
