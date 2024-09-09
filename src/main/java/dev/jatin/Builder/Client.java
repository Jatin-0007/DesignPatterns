package dev.jatin.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.setName("Jatin");
//        builder.setBatch("Sep24 Monday Beginner Morning");
//        builder.setGradYear(2021);
//        builder.setPsp(80.0);
//        builder.setAge(25);
//        builder.setUniversityName("Scaler");
//
//
//        Student student = new Student(builder);
//
//        System.out.println("DEBUG");

        Student student = Student.getBuilder()   //Here the Builder object is created
                                   .setName("Jatin")   //-----------------
                                     .setBatch("Sep24 Morning")  //      |
                                        .setUniversityName("Scaler") //  |--------- Method chaining so in the setter method the return type is Builder
                                          .setAge(25)              //    |
                                            .setPsp(89.0) //---------------
                                              .setGradYear(2021)
                                                  .build();

        System.out.println("DEBUG");

    }
}
