
package cz.upol.pja.lecture04.models;

public class ForumMessage {
    
    private final String author;
    private final String title;
    private final String body;

    public ForumMessage(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
