package mid_BigLab;
import java.awt.Font;
import javax.swing.JLabel;
public class minelb4 extends minelb3{
	protected String BeverageMenuName[] = {"칠성 사이다","스프라이트","코카 콜라","펩시 콜라","환타","생맥주","참이슬","좋은 데이","진로"};//음료 이름을 저장한 menu3배열 선언
	protected int Beveragemenuprice4[] = {2000,2000,2000,2000,2000,4000,5000,5000,5000};//음료의 가격을 저장한 Beveragemenuprice4 배열 선언
	protected JLabel name4[] = new JLabel[BeverageMenuName.length];//음료 이름을 담을 name4라는 이름을 가진 JLabel 배열 선언
	protected JLabel price4[] = new JLabel[BeverageMenuName.length];//음료 가격을 담을 price4라는 이름을 가진 JLabel 배열 선언
	public minelb4() {
		for(int i=0;i<BeverageMenuName.length;i++) {//음료 메뉴 버튼을 클릭하면 각 이미지버튼 아래에 음료 메뉴 이름과 각 메뉴의 가격을 표시해주는 라벨들을 선언해주는 반복문이다.
			name4[i] = new JLabel(BeverageMenuName[i]);
			price4[i] = new JLabel(Beveragemenuprice4[i] + "원");
		}
		name4[0].setBounds(60,130,170,20);name4[1].setBounds(270,130,170,20);name4[2].setBounds(480,130,170,20);//음료 메뉴 이름과 가격을 표시해줄 라벨의 위치 지정
		name4[3].setBounds(60,300,170,20);name4[4].setBounds(270,300,170,20);name4[5].setBounds(480,300,170,20);
		name4[6].setBounds(60,470,170,20);name4[7].setBounds(270,470,170,20);name4[8].setBounds(480,470,170,20);
		price4[0].setBounds(60,150,170,20);price4[1].setBounds(270,150,170,20);price4[2].setBounds(480,150,170,20);
		price4[3].setBounds(60,320,170,20);price4[4].setBounds(270,320,170,20);price4[5].setBounds(480,320,170,20);
		price4[6].setBounds(60,490,170,20);price4[7].setBounds(270,490,170,20);price4[8].setBounds(480,490,170,20);
		Lsetting1(name4,ownpanel[8]);Lsetting1(price4,ownpanel[8]);
	}
}