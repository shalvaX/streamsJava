package ge.edu.btu.Students;

public class SecondStepStudent extends Student {
    private final double coefficient = 0.22142;

    public SecondStepStudent(){}
    public SecondStepStudent(String fullName, double score, int age, String id,double numOfSubjects, double maxScore){
        super(fullName, score, age, id, numOfSubjects, maxScore);
    }

    @Override
    public void calculateScore(){
        setScore((getMaxScore()/getNumOfSubjects())*coefficient );
    }
}
