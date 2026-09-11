import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        // JFrame이 가지고 있는 메소드들
        setTitle("500*500 스윙 프레임 만들기");
        setSize(500, 500);         // 프레임 크기 (폭, 높이)
        setVisible(true);                       // 프레임 출력
    }

    public static void main(String[] args) {

        // new MyFrame();
        // -> MyFrame myFrame = new MyFrame();
        // 단, 이 코드는 메인 스레드에서 직접 GUI 객체를 생성하는 방식이라
        // Swing이 권장하는 스레드 분리(아래 EDT 설명 참고)가 되어 있지 않은 상태

        SwingUtilities.invokeLater(MyFrame::new);
        // -> GUI 생성을 메인 스레드가 아닌 EDT(Event Dispatch Thread)에게 맡기는 코드
        //    MyFrame::new 는 "() -> new MyFrame()" 과 동일한 의미의 메소드 참조(Method Reference)

        // EDT (Event Dispatch Thread)
        // : Swing에서 화면 그리기, 이벤트 처리(버튼 클릭 등)를 전담하는 스레드
        // GUI 관련 작업은 반드시 EDT 안에서 실행해야 스레드 충돌 없이 안정적으로 동작함
        // (메인 스레드에서 직접 GUI를 생성/조작하면 멀티스레드 환경에서 예기치 않은 오류가 발생할 수 있음)

        /* 람다식(Lambda Expression)으로 표현한 동일한 코드
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
        */
    }
}