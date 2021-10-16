package lab1.task2;

import java.util.List;
import java.util.*;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public List<Student> filterYear(int year, Course course){
        List<Student> studentList = new ArrayList<Student>();

        int count = 0;
        while(count < course.students.length){
            if(course.students[count].getYear().equals(year)){
                studentList.add(course.students[count]);
            }
            count++;
        }

        return studentList;
    }
}
