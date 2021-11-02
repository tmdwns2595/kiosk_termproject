package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn4 extends minebtn3{
	String imgpath4[] = {"src/image/칠성사이다.jpg","src/image/스프라이트.jpg","src/image/코카콜라.jpg","src/image/펩시콜라.jpg","src/image/환타.jpg","src/image/생맥주.jpg",
						 "src/image/참이슬.jpg","src/image/좋은데이.png","src/image/진로.jpg"};//음료 사진의 이미지 경로를 담은 imgpath4라는 배열 선언
	protected JButton bside[] = new JButton[imgpath4.length];//음료 이미지 버튼을 만들 bside라는 이름을 가진 JButton 배열 선언
	public minebtn4() {
		for(int i=0;i<9;i++) {//음료 이미지 버튼을 생성하고 배경은 흰색,윤곽선까지 지정 후 ownpanel[8]에 추가하는 반복문
			bside[i] = new JButton();
			bside[i].setIcon(new ImageIcon(imgpath4[i]));
			bside[i].setBackground(Color.WHITE);
			bside[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[8].add(bside[i]);
		}
		bside[0].setBounds(60, 30, 170, 100);bside[1].setBounds(270, 30, 170, 100);bside[2].setBounds(480, 30, 170, 100);
		bside[3].setBounds(60, 200, 170, 100);bside[4].setBounds(270, 200, 170, 100);bside[5].setBounds(480, 200, 170, 100);
		bside[6].setBounds(60, 370, 170, 100);bside[7].setBounds(270, 370, 170, 100);bside[8].setBounds(480, 370, 170, 100);
	}
}