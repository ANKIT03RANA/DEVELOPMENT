package Backend_with_java.QuizApp;

public class QuestionService {
    String[] option1 = {"Platform Independent","JVM","JRE","JDK"};
    Questions questions[]= new Questions[4];
    public QuestionService(){
        questions[0]=new Questions(1,"Java is ",option1,"Platform Independent");
        questions[1]=new Questions(2,"Which one is Platform Dependent ",option1,"JVM");
        questions[2]=new Questions(3,"JVM + JRE is ",option1,"JDK");
        questions[3]=new Questions(4,"Accronym for Java Runtime is ",option1,"JRE");
    }
    public void displayQuestion(){
        System.out.println(questions[0]);
    }
}
