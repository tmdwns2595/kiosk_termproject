package mid_BigBtn;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ToolTipManager;
import javax.swing.border.LineBorder;

import mid_BigLab.minelb4;
public class minebtn1 extends minelb4{
	String btnname[] = {"결    제","주 문 취 소"};//결제와 주문취소를 담은 btnname이라는 배열 선언
	protected JButton btn[] = new JButton[btnname.length]; //결제와 주문취소를 담을 btn이라는 이름을 가진 JButton배열 선언
	String mainmenu[] = {"치 킨","순 살 치 킨","사 이 드 메 뉴","음 료"};//치킨,순살치킨,사이드메뉴,음료라는 텍스트를 담은 mainmenu배열 선언
	protected JButton select[] = new JButton[mainmenu.length];//치킨,순살치킨,사이드메뉴,음료를 담을 select라는 이름을 가진 JButton 배열 선언
	String imgpath1[] = {"src/image/마라칸.png","src/image/맛쵸킹.png","src/image/맵스터.png","src/image/블랙올리브 치킨.png","src/image/뿌링클.png","src/image/치하오.png",
						"src/image/커리퀸.png","src/image/해바라기 후라이드 치킨.png","src/image/갈비레오.png"};//치킨의 이미지주소를 담은 imgpath1이라는 배열 선언
	protected JButton bonechicken[] = new JButton[imgpath1.length];//치킨 이미지 버튼을 만들 bonechicken이라는 이름을 가진 JButton 배열 선언
	String eatORpacking[] = {"매장 식사","포 장"};
	String takeout[] = {"src/image/매장 식사.png","src/image/포장.png"};
	protected JButton firstbtn[] = new JButton[eatORpacking.length];
	public minebtn1() {
		for(int i=0;i<2;i++) {//매장식사와 Take Out 버튼을 생성
			firstbtn[i] = new JButton();
			firstbtn[i].setIcon(new ImageIcon(takeout[i]));
			firstbtn[i].setBackground(Color.WHITE);
			firstbtn[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			firstbtn[i].setFont(new Font("굴림", Font.BOLD, 20));
			ownpanel[12].add(firstbtn[i]);
		}
		firstbtn[0].setBounds(150, 400, 400, 300);firstbtn[1].setBounds(650, 400, 400, 300);
		for(int i=0;i<2;i++) {//결제,주문취소 버튼을 생성하고 배경은 검은색 글자색은 흰색 그리고 글꼴은 "굴림"체 글자크기는 20으로 설정을 한 후 그 버튼들을 ownpanel[3]에 추가하는 반복문이다.
			btn[i] = new JButton(btnname[i]);
			btn[i].setBackground(Color.BLACK);
			btn[i].setForeground(Color.WHITE);
			btn[i].setFont(new Font("굴림", Font.BOLD, 20));
			ownpanel[3].add(btn[i]);
		}
		btn[0].setBounds(240, 0, 240, 60);btn[1].setBounds(0, 0, 240, 60);//결제,주문취소 버튼 ownpanel[3]에서의 위치 지정
		for(int i=0;i<4;i++) {//치킨,순살치킨,사이드메뉴,음료 버튼을  생성하고 배경은 검은색 글자새은 흰색으로 설정을 한 후 ownpanel[1]에 추가해서 ownpanel[1]에서의 각 버튼 위치지정하는 반복문
			select[i] = new JButton(mainmenu[i]);
			select[i].setBackground(Color.black);
			select[i].setForeground(Color.WHITE);
			ownpanel[1].add(select[i]);
			select[i].setBounds(30 + 170*i,130,140,30);
		}
		for(int i=0;i<9;i++) {//치킨 이미지 버튼을 생성하고 배경은 흰색으로 지정후 윤곽선까지 지정을 해준 후에 panel[5]에 추가하는 반복문이다.
			bonechicken[i] = new JButton();
			bonechicken[i].setIcon(new ImageIcon(imgpath1[i]));
			bonechicken[i].setBackground(Color.WHITE);
			bonechicken[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[5].add(bonechicken[i]);
		}
		ToolTipManager m = ToolTipManager.sharedInstance();//ToolTipManager를 생성하여 버튼에 올려놓으면 바로 툴팁 내용이 출력되고 10초동안 지속되도록 설정해 놓았다.
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		bonechicken[0].setToolTipText("[재료] : 닭고기, 파, 붉은 고추, 산초, 캐슈넛, 피쉬볼, 밀가루, 우유");
		bonechicken[1].setToolTipText("[재료] : 닭고기, 파, 고추, 꿀, 마늘, 흑임자, 밀가루, 우유");
		bonechicken[2].setToolTipText("[재료] : 닭고기, 청주, 로즈메리가루, 후춧가루, 참깨, 검은깨, 밀가루, 마늘, 고추, 토마토 케쳡, 고추장, 우유");
		bonechicken[3].setToolTipText("[재료] : 닭고기, 숙성된 올리브 열매, 발사믹 식초, 트러플 오일(송로버섯), 검은깨, 마늘, 밀가루, 우유");
		bonechicken[4].setToolTipText("[재료] : 닭고기, 치즈맛 시즈닝, 파슬리 가루, 크림치즈, 요거트, 허니머스터드, 생크림, 레몬즙, 밀가루, 우유");
		bonechicken[5].setToolTipText("[재료] : 닭고기, 라유소스, 흑식초, 고추튀김, 땅콩, 청주, 대파, 밀가루, 우유");
		bonechicken[6].setToolTipText("[재료] : 닭고기, 갈릭커리 시즈닝, 토마토 베이스 커리딥 소스, 마늘, 밀가루, 우유");
		bonechicken[7].setToolTipText("[재료] : 닭고기, 밀가루, 우유, 올리브유, 우유");
		bonechicken[8].setToolTipText("[재료] : 닭고기, 밀가루, 우유, 후춧가루, 왕갈비소스, 양파, 마늘, 칠리시즈닝");
		bonechicken[0].setBounds(60, 30, 170, 100);bonechicken[1].setBounds(270, 30, 170, 100);bonechicken[2].setBounds(480, 30, 170, 100);
		bonechicken[3].setBounds(60, 200, 170, 100);bonechicken[4].setBounds(270, 200, 170, 100);bonechicken[5].setBounds(480, 200, 170, 100);
		bonechicken[6].setBounds(60, 370, 170, 100);bonechicken[7].setBounds(270, 370, 170, 100);bonechicken[8].setBounds(480, 370, 170, 100);
		//치킨 이미지 버튼들의 위치를 지정
	}
}