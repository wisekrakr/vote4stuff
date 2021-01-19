package com.wisekrakr.vote4stuff.app.entities;

import com.wisekrakr.vote4stuff.app.entities.embedded.CommentId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
    private CommentId embeddedId;
    private String text;

    @EmbeddedId
    public CommentId getEmbeddedId() {
        return embeddedId;
    }

    public void setEmbeddedId(CommentId embeddedId) {
        this.embeddedId = embeddedId;
    }

    @Column(length = 3000)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
