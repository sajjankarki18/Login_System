import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginSystem {
    public static void main(String[] args) {
        new login();
    }
}
class login implements ActionListener{
    JTextField userField;
    JLabel userLabel;
    JPasswordField userPassword;
    JLabel passwordLabel;
    JButton loginButton;
    JButton clearButton;

    JLabel messageLabel;
    login(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        userField = new JTextField();
        userField.setBounds(130,50,300,50);
        userField.setFont(new Font("Monospaced",Font.PLAIN,20));

        userLabel = new JLabel();
        userLabel.setText("USERNAME");
        userLabel.setBounds(50, 50, 100,50);

        userPassword = new JPasswordField();
        userPassword.setBounds(130, 125,300,50);
        userPassword.setFont(new Font("Monospaced",Font.PLAIN,20));

        passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setBounds(50,125,300,50);

        loginButton = new JButton("Login");
        loginButton.setBounds(130,190,150,50);
        loginButton.setFont(new Font("Monospaced",Font.PLAIN,20));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setBounds(280,190,150,50);
        clearButton.setFont(new Font("Monospaced",Font.PLAIN,20));
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        messageLabel = new JLabel();
        messageLabel.setText("");
        messageLabel.setBounds(130,260,400,50);

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passwordLabel);
        frame.add(userPassword);
        frame.add(loginButton);
        frame.add(clearButton);
        frame.add(messageLabel);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            String username = userField.getText();
            String password = userPassword.getText();

            if(username.equalsIgnoreCase("karkisajan008@gmail.com") && password.equalsIgnoreCase("iamanhacker")){
                messageLabel.setText("LOGIN SUCCESSFUL");
                messageLabel.setForeground(Color.green);
                messageLabel.setFont(new Font("MONOSPACED",Font.PLAIN,25));
                new newWindowOpen();
            }else {
                messageLabel.setText("USERNAME NOT FOUND");
                messageLabel.setForeground(Color.red);
                messageLabel.setFont(new Font("MONOSPACED",Font.PLAIN,25));
            }

        }
        if(e.getSource()==clearButton){
            userField.setText("");
            userPassword.setText("");
            messageLabel.setText("");
        }
    }
}
class newWindowOpen extends JFrame{
    newWindowOpen(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Login");
        frame.setSize(550,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Login Successfull, Opened new Window!!!");
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setBounds(50,50,1000,100);

        frame.add(label);
        frame.setVisible(true);
    }
}
