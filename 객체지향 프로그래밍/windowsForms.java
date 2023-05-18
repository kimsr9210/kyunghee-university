package windowProgram;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class windowForm {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    windowForm window = new windowForm();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public windowForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btn = new JButton("입장하기"); // 버튼 생성
        btn.setBounds(170, 184, 100, 30); // 버튼 위치 및 크기 설정
        frame.getContentPane().add(btn); // 버튼을 프레임에 추가

        JLabel lbl = new JLabel("<html>안녕하세요 김소련의 윈도우폼에 오신 것을 환영합니다.<br> ▼ 아래의 [입장하기]를 누르면 '프로게임러 치즈언니의 일상' <br/> 네이버 블로그에 입장할 수 있습니다 *^__^*</html>"); // HTML 태그 사용
        lbl.setBounds(42, 70, 380, 104);
        frame.getContentPane().add(lbl);

        // 입장하기 버튼에 액션 리스너 추가
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 네이버 블로그 주소
                    String url = "https://blog.naver.com/kimsr9210";

                    // 웹 브라우저 열기
                    Desktop.getDesktop().browse(new URI(url));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        // 배경 색 설정
        frame.getContentPane().setBackground(Color.PINK);
    }

}