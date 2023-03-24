import javax.swing.*;
import java.awt.*;

public class CalcPanel extends GeneralPanel {

    private JButton Screen;
    private JButton One;
    private JButton Two;
    private JButton Three;
    private JButton Four;
    private JButton Five;
    private JButton Six;
    private JButton Seven;
    private JButton Eight;
    private JButton Nine;
    private JButton Zero;
    private JButton Add;
    private JButton Subtract;
    private JButton Multiply;
    private JButton Divide;
    private JButton Equals;



    public CalcPanel() {
        super();
        Screen = new JButton("Screen");
        Screen.setPreferredSize(new Dimension(300, 150));
        One = new JButton("1");
        Two = new JButton("2");
        Three = new JButton("3");
        Four  = new JButton("4");
        Five  = new JButton("5");
        Six  = new JButton("6");
        Seven  = new JButton("7");
        Eight  = new JButton("8");
        Nine = new JButton("9");
        Zero = new JButton("0");
        Add = new JButton("+");
        Subtract = new JButton("-");
        Multiply = new JButton("*");
        Divide = new JButton("/");
        Equals = new JButton("=");

        add(Screen, BorderLayout.NORTH);
        add(One);
        add(Two);
        add(Three);
        add(Four);
        add(Five);
        add(Six);
        add(Seven);
        add(Eight);
        add(Nine);
        add(Zero);
        add(Add);
        add(Subtract);
        add(Multiply);
        add(Divide);
        add(Equals);
    }
}
