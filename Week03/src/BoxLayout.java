import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

class BoxLayoutEx extends JFrame {
    public BoxLayoutEx() {
        setTitle("BoxLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Horizontal center alignment in case of "BoxLayout.Y_AXIS"
        JButton loginButton = new JButton("Log in");
        JButton signupButton = new JButton("Sign up");
        JButton exitButton = new JButton("exit");

        loginButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        signupButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
//        loginButton.setAlignmentY(JComponent.CENTER_ALIGNMENT);
//        signupButton.setAlignmentY(JComponent.CENTER_ALIGNMENT);
//        exitButton.setAlignmentY(JComponent.CENTER_ALIGNMENT);

        panel.add(Box.createHorizontalStrut(15));   //  Vertical margin between components
        panel.add(loginButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(signupButton);
        panel.add(Box.createVerticalStrut(10));
//        panel.add(Box.createVerticalGlue());            // 최하단 밀착
        panel.add(exitButton);

//        panel.add(Box.createHorizontalStrut(15));   // Vertical margin between components
//        panel.add(loginButton);
//        panel.add(Box.createHorizontalStrut(10));
//        panel.add(signupButton);
//        panel.add(Box.createHorizontalGlue());
//        panel.add(exitButton);
//        panel.add(Box.createHorizontalStrut(15));

        add(panel);                             // JFrame 에 add
        setLocationRelativeTo(null);

        setSize(500, 200);
        setVisible(true);
    }

    static void main(String[] args) {
        FlatDarkLaf.setup();
        SwingUtilities.invokeLater(BoxLayoutEx::new);
    }
}