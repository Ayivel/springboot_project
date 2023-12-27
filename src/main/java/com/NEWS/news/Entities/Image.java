package com.NEWS.news.Entities;

public class Image {

    private Long id;

    private byte[] content;
    private String mime;

    public Image() {
    }

    public Image(byte[] content, String mime) {
        this.content = content;
        this.mime = mime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

}
