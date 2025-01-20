public class BookTest{
    public static void main(String[] args) {
        Book bk = new Book(3);
        
        int bkPages = bk.getNumPages();
        for (int i = 0; i<3; i++) {
            int bkPageCurrent = bk.getCurrentPage();
            System.out.println("You are on page " + bkPageCurrent + " of " + bkPages);
            bk.nextPage();
        }
    }
}