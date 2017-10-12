
/**
 * Author Frezer G.
 * Purpase to uase a Flowchart
 * date 10/11/2017
 */

import javax.swing.*;

public class UserName{

    public static void main (String [] args){
        // Used to JoptionPane to have a dialog with users
        String a = JOptionPane.showInputDialog(null, "Enter Your User Name");
        String b = JOptionPane.showInputDialog(null, "Enter Your User Password");

        // Used if else statment to have the right password and Username
        if ("Frezer". equals (a) && "123456".equals(b)) {
            JOptionPane.showMessageDialog(null,"Wellcome Frezer");
        }else {
            JOptionPane.showMessageDialog(null,"Wrong User name or Password");
        }
    }
}
