package Replit.OOP.BookShelf;

class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("maryfjon temirov");
        System.out.println(b.getAuthor());
        b.setTitle("Barbecue THE End");
        System.out.println("b.title = " + b.getTitle());


        Book book1 = new Book(123, "JOHN GRISHAM", "A TIME TO KILL", 456);
        Book book2 = new Book(456, "EDITH WHARTON", "THE HOUSE OF MIRTH", 708);
        Book book3 = new Book(789, "JOHN STEINBECK","EAST OF EDEN", 1010);
        Book book4 = new Book(147,"ERNEST HEMINGWAY",  "THE SUN ALSO RISES",950);
        Book book5 = new Book(150, "Mark Twain","Life on the Mississippi", 852);

        System.out.println("-------------------------------------");
        System.out.println("Shelf.isShelfEmpty() = " + Shelf.isShelfEmpty());
        Shelf.addBook(book1);
        Shelf.addBook(book2);
        Shelf.addBook(book3);
        Shelf.addBook(book5);
        Shelf.addBook(147, "ERNEST HEMINGWAY","THE SUN ALSO RISES", 950);
        Shelf.addBook(258, "Mark Twain","The Adventures of Tom Sawyer", 768);
        System.out.println("Shelf.getTheBooks() = " + Shelf.getTheBooks());
        System.out.println("----------------------------------------------------------");
        System.out.println("Shelf.getTheBooks().size() = " + Shelf.getTheBooks().size());
        System.out.println("Shelf.isShelfEmpty() = " + Shelf.isShelfEmpty());
        System.out.println("Shelf.isIDUnique(147) = " + Shelf.isIDUnique(147));
        System.out.println("Shelf.isIDUnique(555) = " + Shelf.isIDUnique(555));
        System.out.println("Shelf.getTitleByID(147) = " + Shelf.getTitleByID(147));
        System.out.println("Shelf.findBookByPartialTitle(\"Tom\") = " + Shelf.findBookByPartialTitle("Tom"));
        System.out.println("Shelf.getAllBooksForAuthor(\"Mark Twain\") = " + Shelf.getAllBooksForAuthor("Mark Twain"));
        Shelf.removeBook(150);
        System.out.println("Shelf.getTheBooks() = " + Shelf.getTheBooks().size());
        Shelf.removeBook("Mark Twain");
        System.out.println("Shelf.getTheBooks() = " + Shelf.getTheBooks().size());
        Shelf.clearBookShelf();
        System.out.println("Shelf.getTheBooks() = " + Shelf.getTheBooks());

    }
}