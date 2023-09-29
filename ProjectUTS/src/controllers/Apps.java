
package controllers;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import models.Platform;
import views.RegisterView;

public class Apps {

    private JFrame app;
    private Platform platform;
    
    public static void main(String args[]) {
        
        SwingUtilities.invokeLater(() -> {
            Apps app = new Apps();
            app.getRegisterView();
        });
    }
    
    public Apps () {
        this.app = new JFrame("Suketku");
        this.platform = new Platform();
        this.app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.app.setSize(334, 488);
        this.app.setResizable(false);
        this.app.setLocationRelativeTo(null);
    }
    
    private void changeView(JPanel view) {
       app.getContentPane().removeAll();
       app.getContentPane().add(view);
       app.revalidate();
       app.repaint();
    }
    
    public void getRegisterView () {
        changeView(new RegisterView(this));
    }
    
}
