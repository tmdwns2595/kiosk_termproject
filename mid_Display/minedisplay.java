package mid_Display;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mid_Begin.Beginning;
public class minedisplay extends Beginning{//display클래스를 상속받은 panels클래스 생성
	protected static JPanel ownpanel[] = new JPanel[13]; //JPanel을 배열로 선언을 했다.
	public minedisplay() {//panels 생성자
		for(int i=0;i<13;i++) {
			ownpanel[i] = new JPanel();//각 패널 배열별로 패널을 생성해준다.
		}
		
		c.add(ownpanel[0]);//부모클래스에서 생성한 Container c 컴포넌트에 panel[0]을 추가.
		ownpanel[0].setBounds(0, 0, 1224, 800);
		ownpanel[0].setLayout(null);
		ownpanel[0].setBackground(Color.WHITE);
		ownpanel[0].setBorder(new LineBorder(new Color(0, 0, 0), 4));
		
		ownpanel[1].setBounds(10,10,700,180);ownpanel[2].setBounds(720, 92, 480, 380);ownpanel[3].setBounds(720,690,480,60);//각 패널들의 위치를 지정해주는 부분
		ownpanel[4].setBounds(720,520,480,160);ownpanel[5].setBounds(10, 200, 700, 550);ownpanel[6].setBounds(10, 200, 700, 550);
		ownpanel[7].setBounds(10, 200, 700, 550);ownpanel[8].setBounds(10, 200, 700, 550);ownpanel[9].setBounds(720, 10, 480, 42);
		ownpanel[10].setBounds(720, 52, 480, 40);ownpanel[11].setBounds(720,475,480,40);ownpanel[12].setBounds(10,10,1190,740);
		
		for(int i = 1;i<12;i++)
			ownpanel[i].setVisible(false);
		ownpanel[12].setVisible(true);
		Psetting(ownpanel);
	}
	public static JPanel Visible(JPanel[] panels) {//패널들의 setVisible을 실행해주는 메소드
		for(int i=0;i<6;i++) {
			panels[i].setVisible(true);
		}
		panels[6].setVisible(false);panels[7].setVisible(false);panels[8].setVisible(false);
		panels[9].setVisible(true);panels[10].setVisible(true);panels[11].setVisible(true);
		return null;
	}
	public JPanel Psetting(JPanel[] pan) {//패널들의 레이아웃과 배경색,윤관선을 지정해주는 메소드
		for(int i=1;i<13;i++) {
			pan[0].add(pan[i]);//부모클래스에서 생성한 Container c 컴포넌트에 panel1을 추가.
			pan[i].setLayout(null);//구체적인 위치를 설정하기 위해서 setLayout()의 매개변수로 null값을 전달.
			pan[i].setBackground(Color.WHITE);//각 패널들의 배경을 흰색으로 설정
			pan[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));//각 패널들에 윤곽선을 추가
		}
		return null;
	}
}