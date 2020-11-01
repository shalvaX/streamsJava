package ge.edu.btu.ReadWriter;
import ge.edu.btu.Students.Student;

import java.io.*;

public class Read {
    private int lastNumOfStuds=0;
    private String fileName;

    public Read() throws IOException {}
    public Read(String fileName) throws IOException {}{
        this.fileName = fileName;
    }

    public void getStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while (((line = reader.readLine()) != null)) {
                if (line.split(";")[0].equals("First")) {
                    System.out.println(line.split(";")[0]);
                }
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public int getLastNumOfStuds() {
        return lastNumOfStuds;
    }
}
