package dev.jatin.Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){

        Student sep24Batch = new Student();
        sep24Batch.setBatch("sep24Batch");
        sep24Batch.setAveragePsp(70);
        studentRegistry.register("sep24Batch", sep24Batch);

        IntelligentStudent sepIntelligentStudent = new IntelligentStudent();
        sepIntelligentStudent.setBatch("sepIntelligentBatch");
        sepIntelligentStudent.setAveragePsp(85);
        sepIntelligentStudent.setIq(165);
        studentRegistry.register("sepIntelligent",sepIntelligentStudent);



    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);


        Student jatin = studentRegistry.get("sep24Batch").clone();
        jatin.setName("Jatin");
        jatin.setAge(25);
        jatin.setCity("bangalore");

        Student dinky = studentRegistry.get("sepIntelligent").clone();
        dinky.setName("Dinky");
        dinky.setAge(26);
        dinky.setCity("katni");

        System.out.println("DEBUG");




    }
}
