package com.example.poetry.bean;

/**
 * Created with IntelliJ IDEA.
 * User: 嗯
 * Date: 2019/4/3
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

}