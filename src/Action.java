package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Action implements ActionListener { // Buttons and actions listener
    int i;
    private final NewGui newGui;

    public Action(NewGui newGui) {
        this.newGui = newGui;
    }

    public void actionPerformed(ActionEvent e) {

        String event = e.getActionCommand();

        if (event.matches("[-+]?\\d+")) {
            try{
                i = Integer.parseInt(event);
            }catch(NumberFormatException exc){
                exc.fillInStackTrace();
            }

            newGui.window.setText(newGui.window.getText() + i);

        } //else if(event.matches("")){//todo символы и не =

       // metod(у);
        else if (event.equals("+")) {
            if (newGui.window.getText() != null) {
                if (newGui.x == 0) {
                    newGui.x = Integer.parseInt(newGui.window.getText());
                    newGui.operation = '+';

                } else {
                    newGui.y = Integer.parseInt(newGui.window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
                    newGui.x = newGui.result;
                    newGui.operation = '+';
                }
            }
            newGui.window.setText("");


        } else if (event.equals("-")) {
            if (newGui.window.getText() != null) {
                if (newGui.x == 0) {
                    newGui.x = Integer.parseInt(newGui.window.getText());
                    newGui.operation = '-';

                } else {
                    newGui.y = Integer.parseInt(newGui.window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
                    newGui.x = newGui.result;
                    newGui.operation = '-';
                }
            }
            newGui.window.setText("");

        } else if (event.equals("*")) {
            if (newGui.window.getText() != null) {
                if (newGui.x == 0) {
                    newGui.x = Integer.parseInt(newGui.window.getText());
                    newGui.operation = '*';

                } else {
                    newGui.y = Integer.parseInt(newGui.window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
                    newGui.x = newGui.result;
                    newGui.operation = '*';
                }
            }
            newGui.window.setText("");

        } else if (event.equals("/")) {
            if (newGui.window.getText() != null) {
                if (newGui.x == 0) {
                    newGui.x = Integer.parseInt(newGui.window.getText());
                    newGui.operation = '/';

                } else {
                    newGui.y = Integer.parseInt(newGui.window.getText());
                    ResultMakerClass res = new ResultMakerClass();
                    newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
                    newGui.x = newGui.result;
                    newGui.operation = '/';
                }
            }
            newGui.window.setText("");

        } else if (event.equals("=")) {
            if (newGui.x == 0) {
                newGui.window.setText(Integer.toString(newGui.result));
                //operation = ' ';
            } else {
                newGui.y = Integer.parseInt(newGui.window.getText());
                ResultMakerClass res = new ResultMakerClass();
                newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
                newGui.operation = ' ';
                newGui.x = 0;
                newGui.y = 0;

                newGui.window.setText("");
                newGui.window.setText(Integer.toString(newGui.result));
                newGui.result = 0;
            }
        }
    }

//    public void metod (char c) {
//        if (newGui.window.getText() != null) {
//            if (newGui.x == 0) {
//                newGui.x = Integer.parseInt(newGui.window.getText());
//                newGui.operation = c;
//
//            } else {
//                newGui.y = Integer.parseInt(newGui.window.getText());
//                ResultMakerClass res = new ResultMakerClass();
//                newGui.result = (res.ResultMaker(newGui.x, newGui.y, newGui.operation));
//                newGui.x = newGui.result;
//                newGui.operation = c;
//            }
//        }
//        newGui.window.setText("");
//    }
}
