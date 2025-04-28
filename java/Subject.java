abstract class Subject {
    public abstract double calculateGrade();
    
    public void displaySubjectInfo() {
        System.out.println("Subject: "+getSubjectName());
        System.out.println("Grade: "+calculateGrade()+"\n");;
    }
    
    public abstract String getSubjectName();
}