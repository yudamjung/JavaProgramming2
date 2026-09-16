import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("Border Layout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

//        c.setLayout(new BorderLayout(10,10));
//        setVgap();      // 레이아웃 객체의 속성
//        setHgap();
        BorderLayout layout = new BorderLayout();
        layout.setVgap(50);
        layout.setHgap(20);
        c.setLayout(layout);        // 설정한 레이아웃을 적용시킴

        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    static void main(String[] args) {
        FlatDarkLaf.setup();
        SwingUtilities.invokeLater(BorderLayoutEx::new);
    }
}