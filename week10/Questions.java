public class Questions {

    private String question;
    private String option1;
    private String option2;
    private String answer;

    public Questions() {
        question = "Which keyword creates an object?";
        option1 = "new";
        option2 = "class";
        answer = "new";
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}