package action;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mid_BigBtn.minebtn4;
public class ChickenClick extends minebtn4{
	public int a = 0;//메뉴들의 이미지 버튼을 클릭을 했을 때 주문내역에 그 메뉴가 들어갈 때 위치를 안겹치게 추가시켜주기 위해 사용할 a라는 변수 선언
	public int entiresum = 0;//현재 선택된 메뉴들의 전체 가격의 합계를 나타내 줄 entiresum 변수
	public JPanel bonepn[] = new JPanel[9];//메뉴 이미지 버튼을 클릭하면 주문내역 아래에 그 메뉴에 관한 메뉴 이름 가격 개수 합계 금액이 들어갈 bonepn이라는 이름을 가진 JPanel배열 선언
	protected JLabel bonelb1[] = new JLabel[9];//치킨 메뉴 이름을 담을 bonelb1이라는 이름을 가진 JLabel 배열 선언
	protected JLabel bonelb2[] = new JLabel[9];//치킨 메뉴의 가격을 담을 bonelb2라는 이름을 가진 JLabel 배열 선언
	protected JTextField txt1[] = new JTextField[9];//+,-버튼을 누르면 그 개수가 저장 될 txt1이라는 이름을 가진 JTextField 배열 선언
	protected JTextField txt11[] = new JTextField[9];//+,-버튼을 누름에 따라 그 개수만큼 구매시 가격의 합계를 저장 할 txt11이라는 JTextField배열 선언
	protected JTextField sum = new JTextField("0 원");
	protected JButton p1[] = new JButton[9];//+버튼을 생성할 p1이라는 이름을 가진 JButton 배열 선언
	protected JButton m1[] = new JButton[9];//-버튼을 생성할 m1이라는 이름을 가진 JButton 배열 선언
	protected int sumprice1[] = new int[9];//개수에 따라 그 가격의 합계를 저장해 줄 sumprice1이라는 배열 선언
	protected int count1[] = new int[9];//+,-버튼에 따라 그 개수를 줄이고 늘려줄 count1이라는 배열 선언
	public ChickenClick() {
		ownpanel[11].add(sum);
		sum.setHorizontalAlignment(JButton.CENTER);
		sum.setFont(new Font("굴림", Font.BOLD, 20));
		sum.setBounds(240,0,240,40);
		for(int i=0;i<9;i++) {
			bonepn[i] = new JPanel();//각 bonepn배열에 JPanel()을 생성
			bonelb1[i] = new JLabel(ChickenMenuName[i]);//각 bonelb1배열에 치킨 메뉴 이름을 가진 JLabel()생성
			bonelb2[i] = new JLabel(ChickenMenuPrice[i] + "원");//각 bonelb2배열에 치킨 메뉴 가격을 가진 JLabel()생성
			count1[i] = 0;//count1배열은 모두 0으로 초기화
			txt1[i] = new JTextField("0");//처음에 텍스트필드는 다 0으로 초기화 왜냐하면 아직 메뉴 수량을 +하기 전이기 때문에
			txt11[i] = new JTextField(sumprice1[i] + "원");//합계 금액 또한 아직 아무런 수행도 하기 전이므로 0원이다.
			p1[i] = new JButton("+");//+버튼 생성
			m1[i] = new JButton("-");//-버튼 생성
			p1[i].setBackground(Color.BLACK);//+버튼의 배경은 검은색으로 글자색은 흰색으로 설정
			p1[i].setForeground(Color.WHITE);
			m1[i].setBackground(Color.BLACK);//-버튼의 배경은 검은색으로 글자색은 흰색으로 설정
			m1[i].setForeground(Color.WHITE);
			bonelb1[i].setHorizontalAlignment(JButton.CENTER);//라벨의 텍스트들을 가운데로 정렬
			bonelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt11[i].setHorizontalAlignment(JButton.CENTER);
			p1[i].setHorizontalAlignment(JButton.CENTER);
			m1[i].setHorizontalAlignment(JButton.CENTER);
			txt1[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bonechicken[i],bonepn[i],bonelb1[i],bonelb2[i],txt11[i],p1[i],m1[i],txt1[i]);//myaction메소드 호출
		}
	}
	//아래의 myaction메소드는 메뉴 이미지 버튼을 누르면 그 메뉴의 이름 가격 개수 합계 금액이 주문내역에 들어가도록 하는 메소드이다.
	public void myaction(JButton tbutton,JPanel tpanel,JLabel tlabel1,JLabel tlabel2,JTextField ttxt2,JButton tplus,JButton tminus,JTextField ttxt) {
		tbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == tbutton) {
						tpanel.setLayout(null);
						tpanel.setBackground(Color.WHITE);
						tpanel.add(tlabel1);
						tpanel.add(tlabel2);
						tpanel.add(ttxt2);
						tpanel.add(tplus);
						tpanel.add(tminus);
						tpanel.add(ttxt);
						ownpanel[2].add(tpanel); 
						tlabel1.setBounds(0,0,116,30);
						tlabel2.setBounds(116,0,116,30);
						ttxt2.setBounds(360,0,120,30);
						tminus.setBounds(240,0,40,30);
						ttxt.setBounds(280,0,40,30);
						tplus.setBounds(320,0,40,30);
						tlabel1.setFont(new Font("굴림", Font.BOLD, 15));
						tlabel2.setFont(new Font("굴림", Font.BOLD, 15));
						tplus.setFont(new Font("굴림", Font.BOLD, 10));
						tminus.setFont(new Font("굴림", Font.BOLD, 10));
						ttxt.setFont(new Font("굴림", Font.BOLD, 15));
						ttxt2.setFont(new Font("굴림", Font.BOLD, 15));
						tpanel.setBounds(4,a,480,40);
						tpanel.setVisible(true);
						a += 40;
						tbutton.setEnabled(false);
					}
			} 
		});
	}
}