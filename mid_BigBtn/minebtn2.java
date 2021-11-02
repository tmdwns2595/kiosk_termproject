package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn2 extends minebtn1{
	String imgpath2[] = {"src/image/마라칸순살.png","src/image/맛쵸킹순살.png","src/image/맵스터순살.png","src/image/블랙올리브순살.png","src/image/뿌링클순살.png",
						 "src/image/소떡강정.png","src/image/치하오순살.png","src/image/커리퀸순살.png","src/image/해바라기후라이드순살.png"};//순살치킨 이미지 경로를 담은 imgpath2라는 배열 선언
	protected JButton bonelesschicken[] = new JButton[imgpath2.length];//순살치킨 이미지버튼을 만들 bonelesschicken이라는 이름을 가진 JButton배열 선언
	public minebtn2() {
		for(int i=0;i<9;i++) {//순살 치킨 이미지 버튼을 생성한 후 배경은 흰색,윤곽선까지 지정 후 ownpanel[6]에 추가하는 반복문이다.
			bonelesschicken[i] = new JButton();
			bonelesschicken[i].setIcon(new ImageIcon(imgpath2[i]));
			bonelesschicken[i].setBackground(Color.WHITE);
			bonelesschicken[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[6].add(bonelesschicken[i]);
		}
		bonelesschicken[0].setBounds(60, 30, 170, 100);bonelesschicken[1].setBounds(270, 30, 170, 100);bonelesschicken[2].setBounds(480, 30, 170, 100);
		bonelesschicken[3].setBounds(60, 200, 170, 100);bonelesschicken[4].setBounds(270, 200, 170, 100);bonelesschicken[5].setBounds(480, 200, 170, 100);
		bonelesschicken[6].setBounds(60, 370, 170, 100);bonelesschicken[7].setBounds(270, 370, 170, 100);bonelesschicken[8].setBounds(480, 370, 170, 100);
		//순살 치킨 이미지 버튼들의 위치를 지정
		bonelesschicken[0].setToolTipText("[재료] : 닭고기, 파, 붉은 고추, 산초, 캐슈넛, 피쉬볼, 밀가루, 우유");
		bonelesschicken[1].setToolTipText("[재료] : 닭고기, 파, 고추, 꿀, 마늘, 흑임자, 밀가루, 우유");
		bonelesschicken[2].setToolTipText("[재료] : 닭고기, 청주, 로즈메리가루, 후춧가루, 참깨, 검은깨, 밀가루, 마늘, 고추, 토마토 케쳡, 고추장, 우유");
		bonelesschicken[3].setToolTipText("[재료] : 닭고기, 숙성된 올리브 열매, 발사믹 식초, 트러플 오일(송로버섯), 검은깨, 마늘, 밀가루, 우유");
		bonelesschicken[4].setToolTipText("[재료] : 닭고기, 치즈맛 시즈닝, 파슬리 가루, 크림치즈, 요거트, 허니머스터드, 생크림, 레몬즙, 밀가루, 우유");
		bonelesschicken[5].setToolTipText("[재료] : 닭고기, 조청 소스, 케쳡, 마늘, 맛술, 고추장, 떡, 소세지, 밀가루, 우유");
		bonelesschicken[6].setToolTipText("[재료] : 닭고기, 라유소스, 흑식초, 고추튀김, 땅콩, 청주, 대파, 밀가루, 우유");
		bonelesschicken[7].setToolTipText("[재료] : 닭고기, 갈릭커리 시즈닝, 토마토 베이스 커리딥 소스, 마늘, 밀가루, 우유");
		bonelesschicken[8].setToolTipText("[재료] : 닭고기, 밀가루, 우유, 올리브유, 우유");
	}
}