package com.example.poetry.bean;

import java.io.Serializable;

/**
 * User: wangtao
 * Date: 2020/7/15
 *
 * @author false
 * Description:
 */
public class CopyPerson implements Cloneable{


    private String name;
    private String age;

    public CopyPerson(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public CopyPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CopyPerson{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    @Override
    public Object clone(){
        CopyPerson person = null;
        try {
            person =(CopyPerson)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        person =(CopyPerson) person.clone();
        return person;

    }
}
