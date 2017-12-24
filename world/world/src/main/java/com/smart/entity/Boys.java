package com.smart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by admin on 2017/12/10.
 */
@Entity
public class Boys {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String clzss;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClzss() {
        return clzss;
    }

    public void setClzss(String clzss) {
        this.clzss = clzss;
    }
}
