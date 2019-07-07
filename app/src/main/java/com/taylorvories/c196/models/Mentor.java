package com.taylorvories.c196.models;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "mentors", foreignKeys = @ForeignKey(entity = Course.class,
                                                        parentColumns = "id",
                                                        childColumns = "courseId",
                                                        onDelete = CASCADE))
public class Mentor {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String email;
    private String phone;
    private int courseId;

    @Ignore
    public Mentor() {

    }

    public Mentor(String name, String email, String phone, int courseId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.courseId = courseId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}