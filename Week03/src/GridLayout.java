import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

//        c.setLayout(new GridLayout(4, 2, 5, 5));

        GridLayout grid = new GridLayout(5, 2);
        grid.setVgap(5);
        grid.setHgap(5);
        c.setLayout(grid);
        setLocationRelativeTo(null);

        /*
        c.add(new JLabel("Name"), JLabel.CENTER);
        c.add(new JTextField(""));
        c.add(new JLabel("Grade"), JLabel.LEFT);
        c.add(new JTextField(""));
        c.add(new JLabel("Major"), JLabel.CENTER);
        c.add(new JTextField());
        c.add(new JLabel("Tel."), JLabel.RIGHT);
        c.add(new JTextField(""));
         */

        // priority on the row!!!
        for (int i = 0; i < 15; i++) {
            c.add(new JButton(Integer.toString(i+1)));
        }

        setSize(300, 300);
        setVisible(true);
    }

    static void main(String[] args) {
        FlatDarkLaf.setup();
        SwingUtilities.invokeLater(GridLayoutEx::new);
    }
}