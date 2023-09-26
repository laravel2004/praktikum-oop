
package controllers;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

public class Apps {

    private JFrame app;
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Apps app = new Apps();
            
        });
    }
    
    public Apps () {
        this.app = new JFrame();
        this.app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.app.setSize(334, 488);
        this.app.setResizable(false);
        this.app.setLocationRelativeTo(null);
    }
    
    private void changeView(JPanel view) {
       this.app.getContentPane().removeAll();
       this.app.getContentPane().add(view);
       this.app.revalidate();
       this.app.repaint();
    }
    
}
