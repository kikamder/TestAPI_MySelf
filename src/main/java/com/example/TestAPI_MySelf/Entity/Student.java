package com.example.TestAPI_MySelf.Entity;

import jakarta.persistence.*;

@Table (name = "studentApi")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String fname;

    @Column(name = "lastname")
    private String lname;

    @Column(name = "year")
    private int year;

    @Column (name ="major")
    private String major;
    public Student() {

    }
    public Student(String fname , String lname , int year , String major) {
        this.fname = fname;
        this.lname = lname;
        this.year = year;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
