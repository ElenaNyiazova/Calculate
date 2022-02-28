package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DellAction implements ActionListener { //delete listener
    private final NewGui newGui;

    public DellAction(NewGui newGui) {
        this.newGui = newGui;
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("C")) { //dell all
            newGui.window.setText("");
            newGui.x = 0;
            newGui.y = 0;
            newGui.result = 0;

        } else if (ae.getActionCommand().equals("<-")) { //delete latest char

            if (newGui.window.getText() != null) {
                String str = newGui.window.getText();
                int i = str.length() - 1;
                String str2 = str.substring(0, i);
                newGui.window.setText(str2);
            }
        }
    }
}
