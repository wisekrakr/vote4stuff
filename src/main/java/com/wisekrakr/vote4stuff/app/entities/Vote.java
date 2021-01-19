package com.wisekrakr.vote4stuff.app.entities;

import com.wisekrakr.vote4stuff.app.entities.embedded.VoteId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {

    private VoteId embeddedId;
    private boolean upVote;

    @EmbeddedId
    public VoteId getEmbeddedId() {
        return embeddedId;
    }

    public void setEmbeddedId(VoteId embeddedId) {
        this.embeddedId = embeddedId;
    }

    public boolean isUpVote() {
        return upVote;
    }

    public void setUpVote(boolean upVote) {
        this.upVote = upVote;
    }
}
