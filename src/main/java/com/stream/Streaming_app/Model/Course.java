package com.stream.Streaming_app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private String CourseID;
    private String CourseTitle;

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public Course() {
    }

    public Course(String courseTitle, String courseID) {
        CourseTitle = courseTitle;
        CourseID = courseID;
    }
}
