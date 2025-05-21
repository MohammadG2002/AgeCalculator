import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AgeCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Age Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("First Name:");
        JTextField nameField = new JTextField(15);

        JLabel yearLabel = new JLabel("Birth Year:");
        JTextField yearField = new JTextField(4);

        JButton calcButton = new JButton("Calculate Age");
        JLabel resultLabel = new JLabel("");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(yearLabel);
        frame.add(yearField);
        frame.add(calcButton);
        frame.add(resultLabel);

        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int birthYear = Integer.parseInt(yearField.getText());
                int currentYear = java.time.Year.now().getValue();
                int age = currentYear - birthYear;
                resultLabel.setText(name + ", your age is: " + age);
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
