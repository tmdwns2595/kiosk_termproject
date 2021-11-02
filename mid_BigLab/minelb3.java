package mid_BigLab;
import java.awt.Font;
import javax.swing.JLabel;
public class minelb3 extends minelb2{
	protected String SideMenuName[] = {"달콤 바삭치즈볼","빨간 소떡","뿌링 감자","뿌링 소떡","뿌링 치즈볼","뿌링 치즈스틱","뿌링 핫도그","케이준 프라이","뿌링 빅콜팝"};//사이드 메뉴 이름을 저장한 SideMenuName배열 선언
	protected int SideMenuPrice[] = {5000,3000,4000,3000,5500,4000,5000,3000,13000};//사이드 메뉴 가격을 저장한 SideMenuPrice 배열 선언
	protected JLabel name3[] = new JLabel[SideMenuName.length];//사이드 메뉴 이름을 담을 name3라는 이름을 가진 JLabel 배열 선언
	protected JLabel price3[] = new JLabel[SideMenuName.length];//사이드 메뉴 가격을 담을 price3라는 이름을 가진 JLabel 배열 선언
	public minelb3() {
		for(int i=0;i<SideMenuName.length;i++) {//사이드 메뉴 버튼을 클릭하면 각 이미지버튼 아래에 사이드 메뉴 이름과 각 메뉴의 가격을 표시해주는 라벨들을 선언해주는 반복문이다.
			name3[i] = new JLabel(SideMenuName[i]);
			price3[i] = new JLabel(SideMenuPrice[i] + "원");
		}
		name3[0].setBounds(60,130,170,20);name3[1].setBounds(270,130,170,20);name3[2].setBounds(480,130,170,20);//사이드 메뉴 이름과 가격을 표시해주는 라벨들 위치 지정
		name3[3].setBounds(60,300,170,20);name3[4].setBounds(270,300,170,20);name3[5].setBounds(480,300,170,20);
		name3[6].setBounds(60,470,170,20);name3[7].setBounds(270,470,170,20);name3[8].setBounds(480,470,170,20);
		price3[0].setBounds(60,150,170,20);price3[1].setBounds(270,150,170,20);price3[2].setBounds(480,150,170,20);
		price3[3].setBounds(60,320,170,20);price3[4].setBounds(270,320,170,20);price3[5].setBounds(480,320,170,20);
		price3[6].setBounds(60,490,170,20);price3[7].setBounds(270,490,170,20);price3[8].setBounds(480,490,170,20);
		Lsetting1(name3,ownpanel[7]);Lsetting1(price3,ownpanel[7]);
	}
}