package Calculate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewGui extends JFrame {
    int x=0,y=0,result=0;
    char operation=' ';

    private JTextField window = new JTextField("", SwingConstants.CENTER);
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

    NewGui(){
        super("Калькулятор");
        this.setBounds(100,100,250,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(6,3,2,2));

        one.addActionListener(new Action());
        two.addActionListener(new Action());
        three.addActionListener(new Action());
        foure.addActionListener(new Action());
        five.addActionListener(new Action());
        six.addActionListener(new Action());
        seven.addActionListener(new Action());
        eight.addActionListener(new Action());
        nine.addActionListener(new Action());
        zero.addActionListener(new Action());
        plas.addActionListener(new Action());
        mines.addActionListener(new Action());
        umnoj.addActionListener(new Action());
        delenie.addActionListener(new Action());
        ravno.addActionListener(new Action());
        dellLast.addActionListener(new DellAction());
        dellAll.addActionListener(new DellAction());

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

    class DellAction implements ActionListener { //слушатели удаления
        public void actionPerformed(ActionEvent ae) {
            if (ae.getActionCommand().equals("C")) { //удалить всё
                window.setText("");
                x = 0;
                y = 0;
                result = 0;
            } else if (ae.getActionCommand().equals("<-")) { //удалить последний символ
                if (window.getText() != null) {
                String str =window.getText();
                int i=str.length()-1;
                String str2 =str.substring(0,i);
                window.setText(str2);
                }
            }
        }
    }

    class Action implements ActionListener{ // слушатели кнопок и действий
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("1"))
                window.setText(window.getText() + "1");
            else if(e.getActionCommand().equals("2"))
                window.setText(window.getText()+ "2");
            else if(e.getActionCommand().equals("3"))
                window.setText(window.getText()+ "3");
            else if(e.getActionCommand().equals("4"))
                window.setText(window.getText()+ "4");
            else if(e.getActionCommand().equals("5"))
                window.setText(window.getText()+ "5");
            else if(e.getActionCommand().equals("6"))
                window.setText(window.getText()+ "6");
            else if(e.getActionCommand().equals("7"))
                window.setText(window.getText()+ "7");
            else if(e.getActionCommand().equals("8"))
                window.setText(window.getText()+ "8");
            else if(e.getActionCommand().equals("9"))
                window.setText(window.getText()+ "9");
            else if(e.getActionCommand().equals("0"))
                window.setText(window.getText()+ "0");

            else if(e.getActionCommand().equals("+")) {
                if (window.getText() != null) {
                    if (x == 0) {
                        x = Integer.parseInt(window.getText());
                        operation = '+';

                    } else {y = Integer.parseInt(window.getText());
                        ResultMakerClass res = new ResultMakerClass();
                        result = (res.ResultMaker(x, y, operation));
                    x = result;
                    operation = '+';}
                }  window.setText("");
            }

            else if(e.getActionCommand().equals("-")){
                if (window.getText() != null) {
                    if (x == 0) {
                        x = Integer.parseInt(window.getText());
                        operation = '-';

                    } else {y = Integer.parseInt(window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    result = (res.ResultMaker(x, y, operation));
                    x = result;
                    operation = '-';}
                }  window.setText("");
            }

            else if(e.getActionCommand().equals("*")){
                if (window.getText() != null) {
                    if (x == 0) {
                        x = Integer.parseInt(window.getText());
                        operation = '*';

                    } else {y = Integer.parseInt(window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    result = (res.ResultMaker(x, y, operation));
                    x = result;
                    operation = '*';}
                }  window.setText("");
            }

            else if(e.getActionCommand().equals("/")){
                if (window.getText() != null) {
                    if (x == 0) {
                        x = Integer.parseInt(window.getText());
                        operation = '/';

                    } else {y = Integer.parseInt(window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    result = (res.ResultMaker(x, y, operation));
                    x = result;
                    operation = '/';}
                }  window.setText("");
            }

            else if(e.getActionCommand().equals("=")) {
                    if (x == 0) {
                       window.setText(Integer.toString(result));
                        //operation = ' ';
                    } else {y = Integer.parseInt(window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    result = (res.ResultMaker(x, y, operation));
                   operation = ' ';
                        x=0;
                        y=0;

                window.setText("");
                window.setText(Integer.toString(result));
                result=0;}
                }
            }
        }


}

