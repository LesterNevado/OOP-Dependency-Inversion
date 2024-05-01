public class Book implements BorrowableBook{

    @Override
    public void borrow(String title) {
        // logic for borrowing book
        System.out.println("Borrowing Book: " + title);
    }
    
}
