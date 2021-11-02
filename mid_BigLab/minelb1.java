package mid_BigLab;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mid_Display.minedisplay;
public class minelb1 extends minedisplay{//치킨 메뉴 이름,가격 그리고 주문안내,주문내역,매장식사,takeout 마지막으로 장바구니에 들어갈 제품명,가격,개수,합계 금액을 나타낼 라벨을 생성하는 클래스이다.
	protected String ChickenMenuName[] = {"마라칸","맛쵸킹","맵스터","블랙올리브","뿌링클","치하오","커리퀸","후라이드","갈비레오"};
	protected int ChickenMenuPrice[] = {18000,17000,18000,17000,17000,18000,17000,15000,18000};
	protected JLabel name1[] = new JLabel[ChickenMenuName.length];
	protected JLabel price1[] = new JLabel[ChickenMenuName.length];
	protected JLabel logo1 = new JLabel();
	protected JLabel logo2 = new JLabel();
	protected JLabel OrderHistory = new JLabel("주 문 내 역");
	protected JLabel OrderGuide = new JLabel("주 문 안 내");
	protected JLabel OrderGuideline = new JLabel("<html>주문 내역에 있는 상품들을 결제하기 원하지 않으시면 왼쪽 하단에 주문 취소 버튼을 클릭! </br>주문 내역에 있는 상품을 결제하기 원하시면 오른쪽 하단에 있는 결제 버튼을 클릭하여 </br>결제 수단을 선택!");
	//주문안내의 내용을 담기위해서 OrderGuideline라는 이름을 가진 JLabel을 선언을 하였고 <html>을 이용하여 </br>을 사용해 줄바꿈을 해주었다.
	protected JLabel TotalAmount = new JLabel("총 주문 금액");
	protected JLabel tk1 = new JLabel("매 장 에 서 식 사");
	protected JLabel tk2 = new JLabel("Take Out");
	protected JLabel advertising = new JLabel();
	protected String buys[] = {"제 품 명", "가 격","개 수","합 계"};
	protected JLabel account[] = new JLabel[buys.length];
	protected JLabel slideshow = new JLabel();
	protected JLabel selloc = new JLabel("<html><br><pre>	식사하실 장소를 선택해 주세요.</pre></br>(TakeOut 시  총 주문 금액의 10%를 할인해드립니다.)");
	protected JLabel TD = new JLabel("현재 시간은");
	public minelb1() {//치킨 메뉴 이름,가격 그리고 주문안내,주문내역,매장식사,takeout 마지막으로 장바구니에 들어갈 제품명,가격,개수,합계 금액을 나타낼 라벨을 생성하는 생성자이다.
		selloc.setFont(new Font("굴림", Font.BOLD, 30));//처음 실행시 나오는 화면에 식사 장소 여부를 물어보는 라벨.
		selloc.setHorizontalAlignment(JLabel.CENTER);
		selloc.setBackground(Color.WHITE);
		selloc.setOpaque(true);
		ownpanel[12].add(selloc);
		selloc.setBounds(150,200,900,130);
		
		TD.setFont(new Font("굴림", Font.BOLD, 15));//현재 시간을 나타내는 라벨
		TD.setHorizontalAlignment(JLabel.CENTER);
		TD.setBackground(Color.WHITE);
		TD.setOpaque(true);
		ownpanel[12].add(TD);
		TD.setBounds(10,10,390,30);
		
		slideshow.setHorizontalAlignment(JLabel.CENTER);//광고판을 나타낼 라벨
		slideshow.setBackground(Color.WHITE);
		slideshow.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		slideshow.setOpaque(true);
		ownpanel[12].add(slideshow);
		slideshow.setBounds(788,0,400,200);
		
		tk1.setHorizontalAlignment(JLabel.CENTER);//매장에서 식사를 나타내 줄 라벨
		tk1.setFont(new Font("굴림", Font.BOLD, 40));
		tk1.setOpaque(true); 
		tk1.setBackground(Color.BLACK);
		tk1.setForeground(Color.WHITE);
		ownpanel[12].add(tk1);
		tk1.setBounds(150, 350, 400, 50);

		tk2.setHorizontalAlignment(JLabel.CENTER);//Take Out을 나타내 줄 라벨
		tk2.setFont(new Font("굴림", Font.BOLD, 40));
		tk2.setOpaque(true); 
		tk2.setBackground(Color.BLACK);
		tk2.setForeground(Color.WHITE);
		ownpanel[12].add(tk2);
		tk2.setBounds(650, 350, 400, 50);
		
		logo2.setIcon(new ImageIcon("src/image/logo.png"));//처음 실행할 때 회사 로고를 나타내 줄 이미지 라벨
		ownpanel[12].add(logo2);
		logo2.setBounds(530, 10, 170, 90);
		
		logo1.setIcon(new ImageIcon("src/image/logo.png"));//식사 여부 선택 후 메뉴 선택 패널이 나올 때 회사 로고를 나타내 줄 이미지 라벨
		ownpanel[1].add(logo1);
		logo1.setBounds(259, 10, 170, 90);
		
		
		OrderHistory.setHorizontalAlignment(JLabel.CENTER);//주문 내역을 나타낼 라벨
		OrderHistory.setFont(new Font("굴림", Font.BOLD, 20));
		OrderHistory.setOpaque(true); 
		OrderHistory.setBackground(Color.BLACK);
		OrderHistory.setForeground(Color.WHITE);
		ownpanel[9].add(OrderHistory);
		OrderHistory.setBounds(0, 0, 480, 42);
		
		OrderGuide.setHorizontalAlignment(JLabel.CENTER);//주문 안내를 나타내는 라벨
		OrderGuide.setFont(new Font("굴림", Font.BOLD, 20));
		OrderGuide.setOpaque(true); 
		OrderGuide.setBackground(Color.BLACK);
		OrderGuide.setForeground(Color.WHITE);
		ownpanel[4].add(OrderGuide);
		OrderGuide.setBounds(0, 0, 480, 42);
		
		OrderGuideline.setHorizontalAlignment(JLabel.CENTER);//주문 안내글을 나타내 줄 라벨
		OrderGuideline.setFont(new Font("굴림", Font.BOLD, 17));
		OrderGuideline.setOpaque(true); 
		OrderGuideline.setBackground(Color.WHITE);
		OrderGuideline.setForeground(Color.BLACK);
		ownpanel[4].add(OrderGuideline);
		OrderGuideline.setBounds(5, 60, 470, 80);
		
		TotalAmount.setHorizontalAlignment(JLabel.CENTER);//총 주문 금액을 나타내 줄 라벨
		TotalAmount.setFont(new Font("굴림", Font.BOLD, 17));
		TotalAmount.setOpaque(true); 
		TotalAmount.setBackground(Color.BLACK);
		TotalAmount.setForeground(Color.WHITE);
		ownpanel[11].add(TotalAmount);
		TotalAmount.setBounds(0, 0, 240, 40);
		
		
		for(int i=0;i<buys.length;i++) {//주문내역에 제품명,제품가격,개수,합계금액을 표시해줄 라벨을 설정하는 반복문이다.
			account[i] = new JLabel(buys[i]);
			account[i].setHorizontalAlignment(JLabel.CENTER);
			account[i].setFont(new Font("굴림", Font.BOLD, 15));
			account[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[10].add(account[i]);
			account[i].setBounds(0 + i*120,0,120,40);
		}
		for(int i=0;i<ChickenMenuName.length;i++) {//치킨 메뉴 버튼을 클릭하면 각 이미지버튼 아래에 치킨 메뉴 이름과 각 메뉴의 가격을 표시해주는 라벨들을 선언해주는 반복문이다.
			name1[i] = new JLabel(ChickenMenuName[i]);
			price1[i] = new JLabel(ChickenMenuPrice[i] + "원");
		}
		name1[0].setBounds(60,130,170,20);name1[1].setBounds(270,130,170,20);name1[2].setBounds(480,130,170,20);//치킨 메뉴 이름과 가격 위치 지정
		name1[3].setBounds(60,300,170,20);name1[4].setBounds(270,300,170,20);name1[5].setBounds(480,300,170,20);
		name1[6].setBounds(60,470,170,20);name1[7].setBounds(270,470,170,20);name1[8].setBounds(480,470,170,20);
		price1[0].setBounds(60,150,170,20);price1[1].setBounds(270,150,170,20);price1[2].setBounds(480,150,170,20);
		price1[3].setBounds(60,320,170,20);price1[4].setBounds(270,320,170,20);price1[5].setBounds(480,320,170,20);
		price1[6].setBounds(60,490,170,20);price1[7].setBounds(270,490,170,20);price1[8].setBounds(480,490,170,20);
		Lsetting1(name1,ownpanel[5]);//Lsetting 메소드 실행
		Lsetting1(price1,ownpanel[5]);//Lsetting 메소드 실행
	}
		
	public void Lsetting1(JLabel[] lab,JPanel p) {//라벨 배열을 인자로 받아서 그 라벨들의 텍스트가 중간에 오게 설정하고 글꼴은 "굴림"체로 크기는 15로 지정한 후 panel[5]에 추가하는 메소드이다
		for(int i=0;i<9;i++) {
			p.add(lab[i]);
			lab[i].setHorizontalAlignment(JLabel.CENTER);
			lab[i].setFont(new Font("굴림", Font.BOLD, 15));
		}
		return;
	}
}