package com.hitesh.RestFul;

public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }
    //These getters are important for spring to parse the returned object into JSON format
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
