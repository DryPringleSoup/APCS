public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String s, String n, double pcp, double cp) {
        this.symbol = s;
        this.name = n;
        this.previousClosingPrice = pcp;
        this.currentPrice = cp;
    }
    
    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public double getPCP() { return previousClosingPrice; }
    public double getCP() { return currentPrice; }
    
    public double getChangePercent() {
        return (currentPrice/previousClosingPrice-1)*100;
    }
}