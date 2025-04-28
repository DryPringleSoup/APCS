public class SubjectTest {
    public static void main(String[] args) {
        MathSubject math = new MathSubject(90, 75); // Sample scores
        EnglishSubject english = new EnglishSubject(80, 70); // Sample scores
        
        math.displaySubjectInfo();
        english.displaySubjectInfo();
    }
}
