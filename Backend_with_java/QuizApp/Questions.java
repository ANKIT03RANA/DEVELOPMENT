package Backend_with_java.QuizApp;

import java.util.Arrays;

public class Questions {
    private int id;
    private String question;
    private String options[];
    private String answer;
    public Questions(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
    public int getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }
    public String[] getOptions() {
        return options;
    }
    public String getAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return "Questions [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
                + answer + "]";
    }
    
}
