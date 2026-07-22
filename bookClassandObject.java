class Book{
    int serialno;
    String title;
    String theme;
    String author;
    int year;
    Book(int serialno, String title, String theme, String author, int year)
    {
        this.serialno = serialno;
        this.title = title;
        this.theme = theme;
        this.author =author;
        this.year = year;
    }
    void display() {
        System.out.println("Serial no : " + serialno);
        System.out.println("Title   : " + title);
        System.out.println("Theme   : " + theme);
        System.out.println("Author : " + author);
        System.out.println("Year    : " + year);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

       Book[] books = new Book[3];

        Book s1 = new Book(101, "Alice to life", "story", "Arun", 2);
       books[0] = s1;

        Book s2 = new Book(102, "Bob to fire", "action", "yash", 3);
        books[1] = s2;

        books[2] = new Book(103, "Charlie& Chapile", "love", "ammu", 1);

        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
