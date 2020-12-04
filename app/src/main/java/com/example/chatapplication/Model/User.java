package com.example.chatapplication.Model;

public class User {
    private String id;
    private String username;
    private String imageurl;
    private String status;
    private String search;


    public User(String id, String username, String imageurl ,String status,String search) {
        this.id = id;
        this.username = username;
        this.imageurl = imageurl;
        this.status=status;
        this.search=search;
    }

    public User() {

    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getimageurl() {
        return imageurl;
    }

    public void setimageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
