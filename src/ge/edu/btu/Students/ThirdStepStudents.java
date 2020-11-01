package ge.edu.btu.Students;

public class ThirdStepStudents extends Student{
    private final double coefficient = 0.32142;

    public ThirdStepStudents(){}
    public ThirdStepStudents(String fullName, double score, int age, String id,double numOfSubjects, double maxScore,String step){
        super(fullName, score, age, id, numOfSubjects, maxScore,step);
    }

    @Override
    public void calculateScore(){
        setScore((getMaxScore()/getNumOfSubjects())*coefficient );
    }
}
