import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

//        setSize(500, 200);
        setSize(300,200);       // 반응형으로 창 크기가 달라지면 아이템들의 배치도 달라진다
//        setResizable(false);                 // 창 크기를 조절하지 못하게 막음
        setLocationRelativeTo(null);         // 디스플레이 기준 정중앙에 창을 띄운다
        setVisible(true);
    }

    static void main(String[] args) {
        FlatLightLaf.setup();
        SwingUtilities.invokeLater(FlowLayoutEx::new);
    }
}