public class MathSubject extends Subject {
    private double examScore;
    private double assignmentScore;
    
    public MathSubject(double examScore, double assignmentScore) {
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }
    
    public double calculateGrade() { return (examScore * 0.7) + (assignmentScore * 0.3); }
    public String getSubjectName() { return "Math"; }
}