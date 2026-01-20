import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private Library library;

    Menu(Library library){
        setTitle("Menu");
        setLayout(null);
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton personnelButton = new JButton("Personnel");
        personnelButton.setBounds(100,50,200,50);
        add(personnelButton);
        personnelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPasswordField passwordField = new JPasswordField();
                Object[] message = {
                    "Enter Password: ", passwordField
                };
                int option = JOptionPane.showConfirmDialog(null,message,"Login",JOptionPane.OK_CANCEL_OPTION);
                if(option== JOptionPane.OK_OPTION){
                    String enterPassword = new String(passwordField.getPassword());

                    if(enterPassword.equals("123")){
                        new PersonnelScreen(library);
                    }else{
                        JOptionPane.showMessageDialog(null,"False Password","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }


            }
        });

        JButton guestButton = new JButton("Guest Screen");
        guestButton.setBounds(100, 151, 200, 50);
        add(guestButton);
        guestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GuestScreen(library);
            }
        });
        setVisible(true);
    }
}
