package mid_Begin;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Beginning extends JFrame{//JFrame 클래스를 상속받은 Beginning 클래스 생성
	protected Container c = getContentPane();//컴포넌트들이 들어갈 Container c 컴포넌트 생성(접근 지정자는 다른 패키지에 있어도 상속받은 클래스에서 사용을 하기위해 protected로 설정)
	public Beginning(){//display 생성자
		setSize(1224, 800);
		setBounds(0, 0, 1224, 800);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT_ON_CLOSE을 지정을 하지 않으면 메인프레임을 닫았는데도 JFrame객체는 계속 살아서 실행이 되기 때문에 안정적으로 종료를 하기 위해서 선언을 한다.
		setTitle("BHC 키오스크");
		setPreferredSize(new Dimension(1024,800));//레이아웃 관리자가 있는 경우 이 메소드를 사용해서 창의 크기를 설정한다.
		setLocationRelativeTo(null);//창의 위치를 화면의 가운데에 띄우기 위해서 매개변수로 null을 가진 setLocationRelativeTo(null) 메소드 선언
		setVisible(true);
	}
}