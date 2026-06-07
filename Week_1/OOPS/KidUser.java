public class KidUser implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have been successfully registered with a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("you are allowed to take only kids books");
        }
    }
}
