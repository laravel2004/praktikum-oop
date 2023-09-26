package view;

import latihan1.*;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.components.*;

public class BankApps {
    
    private JFrame app;
    private Bank bank;
    public int currentUser;

    public static void main(String args[]) {
        
        SwingUtilities.invokeLater(() -> {
            BankApps app = new BankApps();
            app.bank.tambahNasabah("Agung", "Ganteng", 2222, "123123");
            app.getLoginView();
        });
    }
    
    public BankApps() {
        this.app = new JFrame("Bundahara");
        this.bank = new Bank();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.app.setSize(334, 488);
        this.app.setVisible(true);
        this.app.setResizable(false);
        this.app.setLocationRelativeTo(null);
    }
    
    private void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }
    
    public void getLoginView() {
        changeView(new LoginView(this));
        app.setSize(350,500);
    }
    
    public void getAdminView() {
        changeView(new AdminHomeView(this));
        app.setSize(800, 500);
    }
    
    public void getUserView() {
        changeView(new UserHomeView(this));
        app.setSize(300, 500);
    }
    
    public void getWithdrawView() {
        changeView(new UserWithdrawView(this));
        app.setSize(300, 200);
    }
    
    public void getDepositView() {
        changeView(new UserDepositView(this));
        app.setSize(300, 200);
    }
    
    public void getTranferView() {
        changeView(new UserTransferView(this));
        app.setSize(400, 300);
    }
    
    public Bank getBank() {
        return this.bank;
    }                  
}
