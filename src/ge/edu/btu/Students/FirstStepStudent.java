package ge.edu.btu.Students;

public class FirstStepStudent extends Student {
    private final double coefficient = 0.12142;

    public FirstStepStudent(){}
    public FirstStepStudent(String fullName, double score, int age, String id,double numOfSubjects, double maxScore, String step){
        super(fullName, score, age, id, numOfSubjects, maxScore, step);
    }

    @Override
    public void calculateScore(){
        setScore((getMaxScore()/getNumOfSubjects())*coefficient );
    }
}
