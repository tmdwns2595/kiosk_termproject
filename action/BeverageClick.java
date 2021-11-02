package action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
public class BeverageClick extends SideClick{
	protected JPanel beveragepn[] = new JPanel[9];//메뉴 이미지 버튼을 클릭하면 주문내역 아래에 그 메뉴에 관한 메뉴 이름 가격 개수 합계 금액이 들어갈 beveragepn이라는 이름을 가진 JPanel배열 선언
	protected JLabel beveragelb1[] = new JLabel[9];//음료 이름을 담을 beveragelb1이라는 이름을 가진 JLabel 배열 선언
	protected JLabel beveragelb2[] = new JLabel[9];//음료 가격을 담을 beveragelb2이라는 이름을 가진 JLabel 배열 선언
	protected JTextField txt4[] = new JTextField[9];//+,-버튼을 누르면 그 개수가 저장 될 txt4이라는 이름을 가진 JTextField 배열 선언
	protected JTextField txt44[] = new JTextField[9];//+,-버튼을 누름에 따라 그 개수만큼 구매시 가격의 합계를 저장 할 txt44이라는 JTextField배열 선언
	protected JButton p4[] = new JButton[9];//+버튼을 생성할 p3이라는 이름을 가진 JButton 배열 선언
	protected JButton m4[] = new JButton[9];//-버튼을 생성할 m3이라는 이름을 가진 JButton 배열 선언
	public int sumprice4[] = new int[9];//개수에 따라 그 가격의 합계를 저장해 줄 sumprice4이라는 배열 선언
	public int count4[] = new int[9];//+,-버튼에 따라 그 개수를 줄이고 늘려줄 count4이라는 배열 선언
	public BeverageClick() {
		for(int i=0;i<9;i++) {
			beveragepn[i] = new JPanel();//각 beveragepn배열에 JPanel()을 생성
			beveragelb1[i] = new JLabel(BeverageMenuName[i]);//각 beveragelb1배열에 치킨 메뉴 이름을 가진 JLabel()생성
			beveragelb2[i] = new JLabel(Beveragemenuprice4[i] + "원");//각 beveragelb2배열에 치킨 메뉴 가격을 가진 JLabel()생성
			txt4[i] = new JTextField("0");//처음에 텍스트필드는 다 0으로 초기화 왜냐하면 아직 메뉴 수량을 +하기 전이기 때문에
			txt44[i] = new JTextField(sumprice4[i] + "원");//합계 금액 또한 아직 아무런 수행도 하기 전이므로 0원이다.
			count4[i] = 0;//count4 배열은 모두 0으로 초기화
			p4[i] = new JButton("+");//+버튼 생성
			m4[i] = new JButton("-");//-버튼 생성
			p4[i].setBackground(Color.BLACK);//+버튼의 배경은 검은색으로 글자색은 흰색으로 지정
			p4[i].setForeground(Color.WHITE);
			m4[i].setBackground(Color.BLACK);//-버튼의 배경은 검은색으로 글자색은 흰색으로 지정
			m4[i].setForeground(Color.WHITE);
			beveragelb1[i].setHorizontalAlignment(JButton.CENTER);//각 라벨 및 버튼,텍스트 필드의 텍스트들을 가운데로 정렬
			beveragelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt44[i].setHorizontalAlignment(JButton.CENTER);
			p4[i].setHorizontalAlignment(JButton.CENTER);
			m4[i].setHorizontalAlignment(JButton.CENTER);
			txt4[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bside[i],beveragepn[i],beveragelb1[i],beveragelb2[i],txt44[i],p4[i],m4[i],txt4[i]);//myaction메소드 호출
		}
	}
}
