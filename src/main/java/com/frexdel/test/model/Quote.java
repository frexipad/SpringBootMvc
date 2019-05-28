package com.frexdel.test.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "quote",catalog = "test")
public class Quote {
    public Quote() {
    }

    public Quote(String userName, String quote) {
        this.userName = userName;
        this.quote = quote;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "quote")
    private String quote;
}
