package service;

import model.Person;

import javax.crypto.Mac;
import java.util.ArrayList;

public class TeacherManager extends PersonManager {
    private String subject ;

    public TeacherManager(ArrayList<Person> people, String subject) {
        super(people);
        this.subject = subject;
    }

    public TeacherManager() {}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
