package cz.upol.pja.lecture05.models;

public class ParticipatedUser {

    private String firstName;
    private int numberOfPosts;

    public ParticipatedUser(String firstName) {
        this.firstName = firstName;
        this.numberOfPosts = 0;
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    
       public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public void incNumberOfPosts() {
        this.numberOfPosts = this.numberOfPosts+1;
    }

    // </editor-fold>
}
