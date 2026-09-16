
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {

        setTitle("Content Pane JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        cp.setBackground(Color.decode("#6E8978"));  // Content Pane 배경 색 변경
        cp.setLayout(new FlowLayout());


        /*
        JButton jb = new JButton("ok");
        cp.add(jb);
        추후에 개체에 접근할 수 있다
         */
        cp.add(new JButton("OK"),BorderLayout.NORTH);      // 한 줄로 간단하지만, 나중에 객체에 접근할 방법이 없다.
        cp.add(new JButton("Cancel"),BorderLayout.CENTER);
        cp.add(new JButton("Ignore"),BorderLayout.SOUTH);

        setSize(500, 150);
        setVisible(true);
    }

    static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlatDarkLaf.setup();
            ContentPaneEx dark = new ContentPaneEx();
            dark.setTitle("Dark Mode");
            dark.setLocation(100, 100);
        });

        SwingUtilities.invokeLater(() -> {
            FlatLightLaf.setup();
            ContentPaneEx light = new ContentPaneEx();
            light.setTitle("Light Mode");
            light.setLocation(650, 100);
        });

        SwingUtilities.invokeLater(() -> {
            ContentPaneEx ex = new ContentPaneEx();
            ex.setTitle("기본");
            ex.setLocation(1000,100);
        });
    }
}