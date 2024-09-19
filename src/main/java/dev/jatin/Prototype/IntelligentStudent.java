package dev.jatin.Prototype;

public class IntelligentStudent extends Student {

    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent intelligentStudent){

        super(intelligentStudent); // this will give call to CC in student class as the attributes are private and no getter methods
        this.iq = intelligentStudent.iq;

    }

    @Override
    public IntelligentStudent clone(){
        // "this" keyword will refer to IntelligentStudent in Student class Copy constructor

        return new IntelligentStudent(this);
    }



    public void setIq(int iq) {
        this.iq = iq;
    }
}
