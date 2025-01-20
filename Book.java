public class Book {
    private final int numPages;
    private int currentPage;
    
    public Book(int pgCount) {
        this.numPages = pgCount;
        this.currentPage = 1;
    }
    
    public int getNumPages() { return numPages; }
    
    public int getCurrentPage() { return currentPage; }
    
    public void nextPage() { 
        if (currentPage<numPages) { currentPage++; }
    }
}