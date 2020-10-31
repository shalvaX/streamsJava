package ge.edu.btu.Students;

public abstract class Student {
    private String fullName;
    private double score;
    private int age;
    private String id;
    private double numOfSubjects;
    private double maxScore;

    public Student(){}
    public Student(String fullName, double score, int age, String id, double numOfSubjects, double maxScore){
        this.fullName = fullName;
        this.score = score;
        this.age = age;
        this.id = id;
        this.numOfSubjects = numOfSubjects;
        this.maxScore = maxScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public double getNumOfSubjects() {
        return numOfSubjects;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public abstract void calculateScore();
}
