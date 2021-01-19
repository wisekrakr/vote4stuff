package com.wisekrakr.vote4stuff.app.entities.embedded;

import com.wisekrakr.vote4stuff.app.entities.ShowCase;
import com.wisekrakr.vote4stuff.app.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {

    private static final long serialVersionUID = 2068416718267695438L;
    private User user;
    private ShowCase showCase;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public ShowCase getShowCase() {
        return showCase;
    }

    public void setShowCase(ShowCase showCase) {
        this.showCase = showCase;
    }
}
