package com.example.LibraryManagement.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String name;
    private String summary;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String writer;
    private String category;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Books() {
    }

    public Books(int id, String name, String summary, String writer, String category) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.writer = writer;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


