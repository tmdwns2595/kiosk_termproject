package action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
public class SideClick extends BonelessChickenClick{
	protected JPanel sidepn[] = new JPanel[9];//메뉴 이미지 버튼을 클릭하면 주문내역 아래에 그 메뉴에 관한 메뉴 이름 가격 개수 합계 금액이 들어갈 sidepn이라는 이름을 가진 JPanel배열 선언
	protected JLabel sidelb1[] = new JLabel[9];//사이드 메뉴 이름을 담을 sidelb1이라는 이름을 가진 JLabel 배열 선언
	protected JLabel sidelb2[] = new JLabel[9];//사이드 메뉴의 가격을 담을 sidelb2라는 이름을 가진 JLabel 배열 선언
	protected JTextField txt3[] = new JTextField[9];//+,-버튼을 누르면 그 개수가 저장 될 txt3이라는 이름을 가진 JTextField 배열 선언
	protected JTextField txt33[] = new JTextField[9];//+,-버튼을 누름에 따라 그 개수만큼 구매시 가격의 합계를 저장 할 txt33이라는 JTextField배열 선언
	protected JButton p3[] = new JButton[9];//+버튼을 생성할 p3이라는 이름을 가진 JButton 배열 선언
	protected JButton m3[] = new JButton[9];//-버튼을 생성할 m3이라는 이름을 가진 JButton 배열 선언
	public int sumprice3[] = new int[9];//개수에 따라 그 가격의 합계를 저장해 줄 sumprice3이라는 배열 선언
	public int count3[] = new int[9];//+,-버튼에 따라 그 개수를 줄이고 늘려줄 count3이라는 배열 선언
	public SideClick() {
		for(int i=0;i<9;i++) {
			sidepn[i] = new JPanel();//각 sidepn배열에 JPanel()을 생성
			sidelb1[i] = new JLabel(SideMenuName[i]);//각 sidelb1배열에 치킨 메뉴 이름을 가진 JLabel()생성
			sidelb2[i] = new JLabel(SideMenuPrice[i] + "원");//각 sidelb2배열에 치킨 메뉴 가격을 가진 JLabel()생성
			txt3[i] = new JTextField("0");//처음에 텍스트필드는 다 0으로 초기화 왜냐하면 아직 메뉴 수량을 +하기 전이기 때문에
			txt33[i] = new JTextField(sumprice3[i] + "원");//합계 금액 또한 아직 아무런 수행도 하기 전이므로 0원이다.
			count3[i] = 0;//count3 배열은 모두 0으로 초기화
			p3[i] = new JButton("+");//+버튼 생성
			m3[i] = new JButton("-");//-버튼 생성
			p3[i].setBackground(Color.BLACK);//+버튼의 배경은 검은색 글자색은 흰색으로 지정
			p3[i].setForeground(Color.WHITE);
			m3[i].setBackground(Color.BLACK);//-버튼의 배경은 검은색 글자색은 흰색으로 지정
			m3[i].setForeground(Color.WHITE);
			sidelb1[i].setHorizontalAlignment(JButton.CENTER);//각 라벨 및 버튼,텍스트 필드의 텍스트들을 가운데로 정렬
			sidelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt33[i].setHorizontalAlignment(JButton.CENTER);
			p3[i].setHorizontalAlignment(JButton.CENTER);
			m3[i].setHorizontalAlignment(JButton.CENTER);
			txt3[i].setHorizontalAlignment(JButton.CENTER);
			myaction(side[i],sidepn[i],sidelb1[i],sidelb2[i],txt33[i],p3[i],m3[i],txt3[i]);//myaction메소드 호출
		}
	}
}
