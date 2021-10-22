package service;

import model.Person;
import model.Student;

import java.util.ArrayList;

public class StudentManager extends PersonManager {
    private ArrayList<Student> listStudent = new ArrayList<>();
    private int sum = 0;

    public StudentManager() {
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public int sumAgv() {
        for (Student student : listStudent) {
            sum += student.getScore();
        }
        return sum;
    }
}
