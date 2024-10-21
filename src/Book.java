class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    // Constructor với đầy đủ thuộc tính
    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    // Triển khai phương thức showinfo
    @Override
    public void showinfo() {
        System.out.println("Book - Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}