package newLoader;

import javax.swing.*;
/**
 * @author King Fox
 */
public class Launcher {
	
   public static void main(String[] args) {
   	 final Splash s = new Splash();
        s.setVisible(true);
        SwingUtilities.invokeLater(new Runnable(){
            public void run()  {
                 s.setVisible(true);
            }
        });
   }


}
