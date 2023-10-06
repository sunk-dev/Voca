package SubjectiveQuiz;

public class Question {
    private String question;
    private String answer;


    public Question() {

    }

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question {"+
        "question='" + question + "'\'' +" +
                ", answer=" + answer +
                "}";
    }

}
