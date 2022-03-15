package form;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public Form() {
        JLabel headTitle = new JLabel("<html> <h1>ANWB Publications Questionnarie</h1> </html>");
        JLabel registerTitle = new JLabel("<html> <h2>Registreted visitors</h2> </html>");
        JLabel login = new JLabel("<html> <h3>User name:</h3> </html>");
        JLabel password = new JLabel("<html> <h3>Password:</h3> </html>");
        JTextField loginField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton Log_in = new JButton("<html> <h3> Log in </h3> </html>");
        JLabel visitorTitle = new JLabel("<html> <h2> New visitors </h2> </html>");
        JButton registerButton = new JButton("<html> <h3> Register </h3> </html>");

        headTitle.setBounds(20, -30, 400, 100);
        headTitle.setForeground(new Color(91, 81, 235));

        registerTitle.setBounds(20, 30, 450, 100);
        registerTitle.setForeground(new Color(91, 81, 235));

        login.setBounds(50, 100, 80, 20);
        password.setBounds(60, 130, 80, 20);

        loginField.setBounds(140, 100, 200, 20);
        passwordField.setBounds(140, 130, 200, 20);

        Log_in.setBounds(10, 200, 410, 30);
        visitorTitle.setBounds(20, 250, 420, 40);
        registerButton.setBounds(10, 300, 410, 30);

        setSize(450, 400);
        add(headTitle);
        add(registerTitle);
        add(login);
        add(password);
        add(loginField);
        add(passwordField);
        add(Log_in);
        add(visitorTitle);
        add(registerButton);
        setResizable(false);

        getContentPane().setBackground(new Color(247, 250, 159));
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}
