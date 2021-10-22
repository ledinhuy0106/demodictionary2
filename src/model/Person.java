package model;

public class Person {
    private String name;
    int age;
    int code;

    public Person() {
    }

    public Person(String name, int age, int code) {
        this.name = name;
        this.age = age;
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", code=" + code +
                '}';
    }
}
