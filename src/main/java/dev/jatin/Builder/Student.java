package dev.jatin.Builder;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    int gradYear;
    String phoneNumber;
    double psp;

      private Student(Builder builder) {       // Private Constructor so builder class is nested inside the student class so that---
                                              // build method can use this constructor
          this.name = builder.name;
          this.age = builder.age;
          this.batch = builder.batch;
          this.universityName = builder.universityName;
          this.gradYear = builder.gradYear;
          this.psp = builder.psp;
          this.phoneNumber = builder.phoneNumber;

      }

      public static Builder getBuilder(){
          return new Builder();
      }

    public static class Builder {
        String name;
        int age;
        String batch;
        String universityName;
        int gradYear;
        String phoneNumber;
        double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){

            if(this.getGradYear() < 2020){
                throw new RuntimeException("Grad year must be >= 2020");
            }                                                                // All validations put here as student object yaha ban raa hay
            if(this.getPsp() < 80){                                          //its better to validate here
                throw new RuntimeException("PSP must be >= 80");
            }


            return new Student(this);
        }


    }


}
