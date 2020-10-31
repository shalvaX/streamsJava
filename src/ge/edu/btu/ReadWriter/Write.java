package ge.edu.btu.ReadWriter;
import ge.edu.btu.Students.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public  class Write{
    private String fileName;

    public Write() throws IOException {}

    public Write(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public void save(Student Student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(Student));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
