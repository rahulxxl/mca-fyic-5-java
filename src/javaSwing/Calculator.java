import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calc extends JFrame {

  private JTextField textField;
  private double firstOperand, secondOperand, result;
  private String operator;

  public Calculator() {
    textField = new JTextField(16);
    textField.setHorizontalAlignment(JTextField.RIGHT);
    textField.setEditable(false);
    JButton[] numberButtons = new JButton[10];
    for (int i = 0; i < 10; i++) {
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(new NumberButtonClickListener());
    }
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");
    JButton equalsButton = new JButton("=");
    JButton clearButton = new JButton("C");
    addButton.addActionListener(new OperatorButtonClickListener());
    subtractButton.addActionListener(new OperatorButtonClickListener());
    multiplyButton.addActionListener(new OperatorButtonClickListener());
    divideButton.addActionListener(new OperatorButtonClickListener());
    equalsButton.addActionListener(new EqualsButtonClickListener());
    clearButton.addActionListener(new ClearButtonClickListener());
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));
    panel.add(numberButtons[7]);
    panel.add(numberButtons[8]);
    panel.add(numberButtons[9]);
    panel.add(divideButton);
    panel.add(numberButtons[4]);
    panel.add(numberButtons[5]);
    panel.add(numberButtons[6]);
    panel.add(multiplyButton);
    panel.add(numberButtons[1]);
    panel.add(numberButtons[2]);
    panel.add(numberButtons[3]);
    panel.add(subtractButton);
    panel.add(numberButtons[0]);
    panel.add(clearButton);
    panel.add(equalsButton);
    panel.add(addButton);
    setLayout(new BorderLayout());
    add(textField, BorderLayout.NORTH);
    add(panel, BorderLayout.CENTER);
    setTitle("Calculator");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  private class NumberButtonClickListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      String currentText = textField.getText();
      JButton button = (JButton) e.getSource();
      textField.setText(currentText + button.getText());
    }
  }

  private class OperatorButtonClickListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      JButton button = (JButton) e.getSource();
      firstOperand = Double.parseDouble(textField.getText());
      operator = button.getText();
      textField.setText("");
    }
  }

  private class EqualsButtonClickListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      secondOperand = Double.parseDouble(textField.getText());
      switch (operator) {
        case "+":
          result = firstOperand + secondOperand;
          break;
        case "-":
          result = firstOperand - secondOperand;
          break;
        case "*":
          result = firstOperand * secondOperand;
          break;
        case "/":
          result = firstOperand / secondOperand;
          break;
      }
      textField.setText(String.valueOf(result));
    }
  }

  private class ClearButtonClickListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      textField.setText("");
      firstOperand = 0;
      secondOperand = 0;
      result = 0;
      operator = null;
    }
  }
}
public class Calculator{
    public static void main(String[] args){
     new Calculator();
    }
}