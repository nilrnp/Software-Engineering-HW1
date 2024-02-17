package Homework1.Problem3;

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher)
    {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
}
