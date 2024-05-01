public class Journal implements BorrowableBook{

    @Override
    public void borrow(String title) {
        // logic for borrowing journal
        System.out.println("Borrowing Journal: " + title);
    }

}
