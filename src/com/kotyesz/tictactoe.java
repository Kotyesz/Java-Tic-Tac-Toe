package com.kotyesz;

import javax.swing.*;
import java.awt.*;

class tictactoe{
    protected boolean isRed = true;

    protected void click(JButton button){
        button.setEnabled(false);
        if(isRed) {
            button.setText("RED");
            button.setBackground(new Color(100,0,0));
        } else {
            button.setText("BLUE");
            button.setBackground(new Color(0,0,100));
        }
        isRed = !isRed;
    }

    protected void winnerCheck(JButton buttons[]){
        if(buttons[0].getText() == buttons[1].getText() && buttons[0].getText() == buttons[2].getText() && buttons[0].getText() != "") dialog(false);
        if(buttons[3].getText() == buttons[4].getText() && buttons[3].getText() == buttons[5].getText() && buttons[3].getText() != "") dialog(false);
        if(buttons[6].getText() == buttons[7].getText() && buttons[6].getText() == buttons[8].getText() && buttons[6].getText() != "") dialog(false);

        if(buttons[0].getText() == buttons[3].getText() && buttons[0].getText() == buttons[6].getText() && buttons[0].getText() != "") dialog(false);
        if(buttons[1].getText() == buttons[7].getText() && buttons[1].getText() == buttons[4].getText() && buttons[1].getText() != "") dialog(false);
        if(buttons[2].getText() == buttons[5].getText() && buttons[2].getText() == buttons[8].getText() && buttons[2].getText() != "") dialog(false);

        if(buttons[0].getText() == buttons[4].getText() && buttons[0].getText() == buttons[8].getText() && buttons[0].getText() != "") dialog(false);
        if(buttons[2].getText() == buttons[4].getText() && buttons[2].getText() == buttons[6].getText() && buttons[2].getText() != "") dialog(false);

        if(      buttons[0].isEnabled() == false && buttons[1].isEnabled() == false && buttons[2].isEnabled() == false &&
                 buttons[3].isEnabled() == false && buttons[4].isEnabled() == false && buttons[5].isEnabled() == false &&
                 buttons[6].isEnabled() == false && buttons[7].isEnabled() == false && buttons[8].isEnabled() == false) dialog(true);
    }

    protected void dialog(boolean tie){
        String msg;
        if(tie) msg = "It's a tie!\nQuiting.";
        else {
            String p = "";
            if(isRed) p = "Blue";
            else p = "Red";
            msg = String.format("%s won!\nQuiting.",p);
        }
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
