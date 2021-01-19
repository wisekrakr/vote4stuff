package com.wisekrakr.vote4stuff.entities.embedded;

import com.wisekrakr.vote4stuff.entities.Product;
import com.wisekrakr.vote4stuff.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {

    private static final long serialVersionUID = 2068416718267695438L;
    private User user;
    private Product product;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
