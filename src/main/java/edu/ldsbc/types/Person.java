package edu.ldsbc.types;

/**
 * Created by XPS on 1/14/2017.
 * this is a model object (really just data)
 */
public class Person {
    // what is missing here
    String name;
    int age;
    Gender  gender;
    MaritalStatus maritalStatus;

    //constructor
    public Person(String name, int age, Gender gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    //Default
    public Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", maritalStatus=" + maritalStatus +
                '}';
    }

    // getter and setters
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}


