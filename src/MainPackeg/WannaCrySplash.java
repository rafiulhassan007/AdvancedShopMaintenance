/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackeg;

import Gui.Main_LogIn;

/**
 *
 * @author romio-pc
 */
public class WannaCrySplash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //AfterSplash obj =new AfterSplash();
       Main_LogIn obj =new Main_LogIn();
        try {
            Thread.sleep(4500);
        } catch (Exception e) {
        }
        obj.setVisible(true);
    }
    
}
