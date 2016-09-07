package com.example.kieum.socialappusingfirebase.model;

/**
 * Created by kieum on 8/29/2016.
 */
public class Comment {
    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }
}
