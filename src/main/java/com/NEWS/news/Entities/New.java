package com.NEWS.news.Entities;

public class New {

    private Long id;
    private String title;
    private String body;
    private Image image;

    public New() {
    }

    public New(String title, String body, Image image) {
        this.title = title;
        this.body = body;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
