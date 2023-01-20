package com.example.Gradle_spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String aname;
    private String tech;
    @Autowired
    private Laptop Laptop;
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public com.example.Gradle_spring.Laptop getLaptop() {
        return Laptop;
    }

    public void setLaptop(com.example.Gradle_spring.Laptop laptop) {
        Laptop = laptop;
    }

    public void show()
    {
        System.out.println("In Show");
        Laptop.compile();
    }
}
