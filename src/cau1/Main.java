package cau1;

public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Song 1", "A popular song", "MP3001", 15.99f, 4);
        mp3.showinfo();

        System.out.println("---------------" );

        Book book = new Book("cau1.Book 1", "A famous novel", "BK1001", 29.99f, "Author 1", 300, "Fiction");
        book.showinfo();
    }
}