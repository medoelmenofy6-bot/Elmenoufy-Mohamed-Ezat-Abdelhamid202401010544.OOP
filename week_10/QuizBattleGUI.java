import javax.swing.*;
import java.awt.event.*;

public class QuizBattleGUI extends JFrame implements ActionListener {

    JLabel lblQuestion;
    JLabel lblResult;

    JButton btn1;
    JButton btn2;

    public QuizBattleGUI() {

        setTitle("Programming Quiz Battle");

        setSize(500, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        lblQuestion = new JLabel();
        lblQuestion.setBounds(30, 20, 320, 30);

        btn1 = new JButton("new");
        btn1.setBounds(50, 80, 120, 40);

        btn2 = new JButton("class");
        btn2.setBounds(200, 80, 120, 40);

        lblResult = new JLabel("Answer the question!");
        lblResult.setBounds(30, 150, 300, 30);

        add(lblQuestion);
        add(btn1);
        add(btn2);
        add(lblResult);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        lblQuestion.setText("Which keyword creates an object?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        Questions question = new Questions();

        if (question.isCorrect(button.getText())) {
            lblResult.setText("Correct! You defeated the Code Boss!");
        } else {
            lblResult.setText("Wrong! Try Again!");
        }
    }

    // main entry point to open the app
    public static void main(String[] args) {
        new QuizBattleGUI().setVisible(true);
    }
}