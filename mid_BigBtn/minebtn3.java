package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn3 extends minebtn2{
	String imgpath3[] = {"src/image/달콤바삭치즈볼.png","src/image/빨간소떡.png","src/image/뿌링감자.png","src/image/뿌링소떡.png","src/image/뿌링치즈볼.png","src/image/뿌링치즈스틱.png",
						 "src/image/뿌링핫도그.png","src/image/케이준프라이.png","src/image/뿌링빅콜팝.png"};//사이드 메뉴 이미지의 경로를 담은 imgpath3라는 배열 선언
	protected JButton side[] = new JButton[imgpath3.length];//사이드 메뉴 이미지 버튼을 만들 side라는 이름을 가진 JButton 배열 선언
	public minebtn3() {
		for(int i=0;i<9;i++) {//사이드 메뉴 이미지 버튼을 생성하고 배경은 흰색,윤곽선까지 지정 후 ownpanel[7]에 추가하는 반복문
			side[i] = new JButton();
			side[i].setIcon(new ImageIcon(imgpath3[i]));
			side[i].setBackground(Color.WHITE);
			side[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[7].add(side[i]);
		}
		side[0].setBounds(60, 30, 170, 100);side[1].setBounds(270, 30, 170, 100);side[2].setBounds(480, 30, 170, 100);
		side[3].setBounds(60, 200, 170, 100);side[4].setBounds(270, 200, 170, 100);side[5].setBounds(480, 200, 170, 100);
		side[6].setBounds(60, 370, 170, 100);side[7].setBounds(270, 370, 170, 100);side[8].setBounds(480, 370, 170, 100);
		//사이드 메뉴 이미지 버튼의 위치를 지정
		side[0].setToolTipText("[재료] : 계란, 찹쌀도너츠가루, 모짜렐라 치즈");
		side[1].setToolTipText("[재료] : 떡, 소세지, 파슬리 가루, 마늘, 고추장, 케쳡, 물엿, 핫소스");
		side[2].setToolTipText("[재료] : 감자, 전분가루, 파슬리 가루, 치즈시즈닝 가루");
		side[3].setToolTipText("[재료] : 떡, 소세지, 파슬리 가루, 마늘, 치즈시즈닝 가루");
		side[4].setToolTipText("[재료] : 계란, 찹쌀도너츠가루, 모짜렐라 치즈, 파슬리 가루, 치즈시즈닝 가루");
		side[5].setToolTipText("[재료] : 계란, 밀가루, 파슬리 가루, 빵가루, 모짜렐라 치즈,");
		side[6].setToolTipText("[재료] : 햄, 빵가루, 치즈시즈닝 가루, 파슬리 가루");
		side[7].setToolTipText("[재료] : 감자, 전분가루, 해바라기유");
		side[8].setToolTipText("[재료] : 닭고기, 치즈맛 시즈닝, 파슬리 가루, 크림치즈, 요거트, 허니머스터드, 생크림, 레몬즙, 밀가루, 우유");
	}
}