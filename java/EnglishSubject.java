class EnglishSubject extends Subject {
    private double essayScore;
    private double quizScore;
    
    public EnglishSubject(double essayScore, double quizScore) {
        this.essayScore = essayScore;
        this.quizScore = quizScore;
    }
    
    public double calculateGrade() { return (essayScore * 0.6) + (quizScore * 0.4); }
    public String getSubjectName() { return "English"; }
}