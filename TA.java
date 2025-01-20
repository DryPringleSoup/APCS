public class TA {
    private String name;
    private double rate;
    private int hours;
    
    public TA(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    
    public double getPay() { return rate*hours; }
}