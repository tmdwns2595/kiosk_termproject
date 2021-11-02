package action;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class BonelessChickenClick extends ChickenClick{
	protected JPanel bonelesspn[] = new JPanel[9];//메뉴 이미지 버튼을 클릭하면 주문내역 아래에 그 메뉴에 관한 메뉴 이름 가격 개수 합계 금액이 들어갈 bonelesspn이라는 이름을 가진 JPanel배열 선언
	protected JLabel bonelesslb1[] = new JLabel[9];//순살 치킨 메뉴 이름을 담을 bonelesslb1이라는 이름을 가진 JLabel 배열 선언
	protected JLabel bonelesslb2[] = new JLabel[9];//순살 치킨 메뉴의 가격을 담을 bonelesslb2라는 이름을 가진 JLabel 배열 선언
	protected JTextField txt2[] = new JTextField[9];//+,-버튼을 누르면 그 개수가 저장 될 txt2이라는 이름을 가진 JTextField 배열 선언
	protected JTextField txt22[] = new JTextField[9];//+,-버튼을 누름에 따라 그 개수만큼 구매시 가격의 합계를 저장 할 txt22이라는 JTextField배열 선언
	protected JButton p2[] = new JButton[9];//+버튼을 생성할 p2이라는 이름을 가진 JButton 배열 선언
	protected JButton m2[] = new JButton[9];//-버튼을 생성할 m2이라는 이름을 가진 JButton 배열 선언
	public int sumprice2[] = new int[9];//개수에 따라 그 가격의 합계를 저장해 줄 sumprice2이라는 배열 선언
	public int count2[] = new int[9];//+,-버튼에 따라 그 개수를 줄이고 늘려줄 count2이라는 배열 선언
	public BonelessChickenClick() {
		for(int i=0;i<9;i++) {
			bonelesspn[i] = new JPanel();//각 bonelesspn배열에 JPanel()을 생성
			bonelesslb1[i] = new JLabel(BonelessChickenName[i]);//각 bonelesslb1배열에 치킨 메뉴 이름을 가진 JLabel()생성
			bonelesslb2[i] = new JLabel(BonelessChickenPrice[i] + "원");//각 bonelesslb2배열에 치킨 메뉴 가격을 가진 JLabel()생성
			txt2[i] = new JTextField("0");//처음에 텍스트필드는 다 0으로 초기화 왜냐하면 아직 메뉴 수량을 +하기 전이기 때문에
			txt22[i] = new JTextField(sumprice2[i] + "원");//합계 금액 또한 아직 아무런 수행도 하기 전이므로 0원이다.
			count2[i] = 0;//count2배열은 모두 0으로 초기화
			p2[i] = new JButton("+");//+버튼 생성
			m2[i] = new JButton("-");//-버튼 생성
			p2[i].setBackground(Color.BLACK);//+버튼의 배경은 검은색 글자색은 흰색으로 지정
			p2[i].setForeground(Color.WHITE);
			m2[i].setBackground(Color.BLACK);//-버튼의 배경은 검은색 글자색은 흰색으로 지정
			m2[i].setForeground(Color.WHITE);
			bonelesslb1[i].setHorizontalAlignment(JButton.CENTER);//각 라벨 및 버튼,텍스트 필드의 텍스트들을 가운데로 정렬
			bonelesslb2[i].setHorizontalAlignment(JButton.CENTER);
			txt22[i].setHorizontalAlignment(JButton.CENTER);
			p2[i].setHorizontalAlignment(JButton.CENTER);
			m2[i].setHorizontalAlignment(JButton.CENTER);
			txt2[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bonelesschicken[i],bonelesspn[i],bonelesslb1[i],bonelesslb2[i],txt22[i],p2[i],m2[i],txt2[i]);//myaction메소드 호출
		}
	}
}
