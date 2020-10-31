package ge.edu.btu.ReadWriter;

public class Read {
    private int lastNumOfStuds=0;
    private String fileName;

    public Read(){};
    public Read(String fileName){
        this.fileName = fileName;
    }

    public int getLastNumOfStuds() {
        return lastNumOfStuds;
    }
}
