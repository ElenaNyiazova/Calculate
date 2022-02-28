package src;

import java.awt.*;
import javax.swing.*;

public class NewGui extends JFrame {
    int x=0, y=0, result=0;
    char operation=' ';
    JButton [] buttons = new JButton[17];
    Font fontArial = new Font("Arial", Font.BOLD, 35);

    public JTextField window = new JTextField("", SwingConstants.CENTER);
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton foure = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton( "8");
    private JButton nine = new JButton("9");
    private JButton zero = new JButton("0");
    private JButton plas = new JButton("+");
    private JButton mines = new JButton("-");
    private JButton umnoj = new JButton("*");
    private JButton delenie = new JButton("/");
    private JButton ravno = new JButton("=");
    private JButton dellLast = new JButton("<-");
    private JButton dellAll = new JButton("C");

    public NewGui(){
        super("Калькулятор");
        this.setBounds(300,300,750,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(6,3,5,5));

        buttons[0] = dellAll;
        // add window
        buttons[1] = dellLast;
        buttons[2] = one;
        buttons[3] = two;
        buttons[4] = three;
        buttons[5] = foure;
        buttons[6] = five;
        buttons[7] = six;
        buttons[8] = seven;
        buttons[9] = eight;
        buttons[10] = nine;
        buttons[11] = plas;
        buttons[12] = zero;
        buttons[13] = mines;
        buttons[14] = umnoj;
        buttons[15] = delenie;
        buttons[16] = ravno;

        window.setFont(fontArial);
        buttons[0].setFont(fontArial);
        buttons[1].setFont(fontArial);

        for(int i = 2; i < buttons.length; i++){
            buttons[i].setFont(fontArial);
            buttons[i].addActionListener(new Action(this));
        }

        buttons[0].addActionListener(new DellAction(this));
        buttons[1].addActionListener(new DellAction(this));

        cont.add(dellAll);
        cont.add(window);

        for(int i = 1; i < buttons.length; i++){
            cont.add(buttons[i]);
        }

        this.setVisible(true);
    }
}

