import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new CalcPanel();

        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);
    }
}