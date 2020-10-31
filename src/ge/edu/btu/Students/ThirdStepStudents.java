package ge.edu.btu.Students;

public class ThirdStepStudents extends Student{
    private final double coefficient = 0.32142;

    public ThirdStepStudents(){}
    public ThirdStepStudents(String fullName, double score, int age, String id,double numOfSubjects, double maxScore){
        super(fullName, score, age, id, numOfSubjects, maxScore);
    }

    @Override
    public void calculateScore(){
        setScore((getMaxScore()/getNumOfSubjects())*coefficient );
    }
}
