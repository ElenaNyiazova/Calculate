package src;

import java.awt.*;
import javax.swing.*;

public class NewGui extends JFrame {
    int x=0,y=0,result=0;
    char operation=' ';

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

        one.addActionListener(new Action(this));
        two.addActionListener(new Action(this));
        three.addActionListener(new Action(this));
        foure.addActionListener(new Action(this));
        five.addActionListener(new Action(this));
        six.addActionListener(new Action(this));
        seven.addActionListener(new Action(this));
        eight.addActionListener(new Action(this));
        nine.addActionListener(new Action(this));
        zero.addActionListener(new Action(this));
        plas.addActionListener(new Action(this));
        mines.addActionListener(new Action(this));
        umnoj.addActionListener(new Action(this));
        delenie.addActionListener(new Action(this));
        ravno.addActionListener(new Action(this));
        dellLast.addActionListener(new DellAction(this));
        dellAll.addActionListener(new DellAction(this));

        cont.add(dellAll);
        cont.add(window);
        cont.add(dellLast);
        cont.add(one);
        cont.add(two);
        cont.add(three);
        cont.add(foure);
        cont.add(five);
        cont.add(six);
        cont.add(seven);
        cont.add(eight);
        cont.add(nine);
        cont.add(plas);
        cont.add(zero);
        cont.add(mines);
        cont.add(umnoj);
        cont.add(delenie);
        cont.add(ravno);
        this.setVisible(true);
    }

}

