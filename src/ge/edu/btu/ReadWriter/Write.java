package ge.edu.btu.ReadWriter;
import ge.edu.btu.Students.Student;
import java.io.*;

public  class Write{
    private String fileName;

    public Write() throws IOException {}

    public Write(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public void save(Student Student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
             BufferedReader reader = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while (true) {
                if ((line = reader.readLine()) == null) {
                    writer.write("\n"+Student.getStep() + ";" + Student.getFullName() + ";" + Student.getId() + ";" + Student.getAge() + ";" + Student.getMaxScore() + ";" + Student.getNumOfSubjects());
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
