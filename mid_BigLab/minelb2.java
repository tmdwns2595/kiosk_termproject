package mid_BigLab;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class minelb2 extends minelb1{
		protected String BonelessChickenName[] = {"마라칸 순살","맛쵸킹 순살","맵스터 순살","블랙올리브 순살","뿌링클 순살","소떡 강정","치하오 순살","커리퀸 순살","순살 소이바베큐"};//순살치킨 메뉴 이름을 저장한 BonelessChickenName배열 선언
		protected int BonelessChickenPrice[] = {19900,19000,19900,19000,19000,19000,19000,19000,19000};//순살치킨 가격을 저장한 BonelessChickenPrice배열 선언
		protected JLabel name2[] = new JLabel[BonelessChickenName.length];//순살 치킨 메뉴 이름을 담을 name2라는 이름을 가진 JLabel 배열 선언
		protected JLabel price2[] = new JLabel[BonelessChickenName.length];//순살 치킨 메뉴 가격을 담을 price2라는 이름을 가진 JLabel 배열 선언
		public minelb2() {
			for(int i=0;i<BonelessChickenName.length;i++) {//순살 치킨 메뉴 버튼을 클릭하면 각 이미지버튼 아래에 순살 치킨 메뉴 이름과 각 메뉴의 가격을 표시해주는 라벨들을 선언해주는 반복문이다.
				name2[i] = new JLabel(BonelessChickenName[i]);
				price2[i] = new JLabel(BonelessChickenPrice[i] + "원");
			}
			name2[0].setBounds(60,130,170,20);name2[1].setBounds(270,130,170,20);name2[2].setBounds(480,130,170,20);//순살 치킨 메뉴 이름과 가격을 표시해주는 라벨들 위치 지정
			name2[3].setBounds(60,300,170,20);name2[4].setBounds(270,300,170,20);name2[5].setBounds(480,300,170,20);
			name2[6].setBounds(60,470,170,20);name2[7].setBounds(270,470,170,20);name2[8].setBounds(480,470,170,20);
			price2[0].setBounds(60,150,170,20);price2[1].setBounds(270,150,170,20);price2[2].setBounds(480,150,170,20);
			price2[3].setBounds(60,320,170,20);price2[4].setBounds(270,320,170,20);price2[5].setBounds(480,320,170,20);
			price2[6].setBounds(60,490,170,20);price2[7].setBounds(270,490,170,20);price2[8].setBounds(480,490,170,20);
			Lsetting1(name2,ownpanel[6]);Lsetting1(price2,ownpanel[6]);
		}
}