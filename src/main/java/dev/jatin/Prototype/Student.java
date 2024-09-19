package dev.jatin.Prototype;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private String batch;                // private attributes withour getters
    private double psp;
    private double averagePsp;
    private String city;

    public Student(){}  // default constructor

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;     // Copy constructor
        this.averagePsp = student.averagePsp;
        this.city = student.city;
    }

    @Override
    public Student clone() {

        return new Student(this); //call to copy constructor, this will make the clone
    }



    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAveragePsp(double averagePsp) {
        this.averagePsp = averagePsp;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
