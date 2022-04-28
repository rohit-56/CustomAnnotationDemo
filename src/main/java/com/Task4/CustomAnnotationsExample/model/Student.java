package com.Task4.CustomAnnotationsExample.model;

import com.Task4.CustomAnnotationsExample.Validations.isValidContact;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class Student {

     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private int id;
    private int roll_no;

    @NotBlank(message = "message is necessary")
    @Size(min=2,message = "size should be greater than 2")
    private String name;
    private String email;


    private long contact;

    public Student(int roll_no, String name, String email, long contact) {
        this.roll_no = roll_no;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public Student() {
    }

    public int getId(){
        return id;
    }
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                '}';
    }
}
