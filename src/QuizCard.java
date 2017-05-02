/**
 * Created by Саша on 02.05.2017.
 */
public class QuizCard {
    private String answer;
    private String question;

    public QuizCard(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
