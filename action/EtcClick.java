package action;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class EtcClick extends BeverageClick{
	public static int takecheck = 0;
	protected ImageIcon Acicon1 = new ImageIcon("src/image/결제.gif");
	public EtcClick() {
		select[0].addActionListener(new ActionListener() {//치킨 버튼을 클릭을 하면 치킨 메뉴가 들어있는 ownpanel[5]만 활성화시키고 나머지는 다 비활성화
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[0]) {
						ownpanel[5].setVisible(true);
						ownpanel[6].setVisible(false);
						ownpanel[7].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[1].addActionListener(new ActionListener() {//순살 치킨 버튼을 클릭을 하면 순살 치킨 메뉴가 들어있는 ownpanel[6]만 활성화시키고 나머지는 다 비활성화
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[1]) {
						ownpanel[6].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[7].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[2].addActionListener(new ActionListener() {//사이드메뉴 버튼을 클릭을 하면 사이드 메뉴가 들어있는 ownpanel[7]만 활성화시키고 나머지는 다 비활성화
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[2]) {
						ownpanel[7].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[6].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[3].addActionListener(new ActionListener() {//음료 버튼을 클릭을 하면 음료 메뉴가 들어있는 ownpanel[8]만 활성화시키고 나머지는 다 비활성화
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[3]) {
						ownpanel[8].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[6].setVisible(false);
						ownpanel[7].setVisible(false);
					}
			}
		});
		firstbtn[0].addActionListener(new ActionListener() {//처음 실행화면에서 매장식사를 클릭하시면 발생하는 이벤트로 takecheck = 0을 통해 매장식사 손님이라는 것을 구분한다. 
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == firstbtn[0]) {
						int confirm1 = JOptionPane.showConfirmDialog(null,"매장에서 식사를 하고 가시겠습니까?","식사 장소 확인",JOptionPane.YES_NO_OPTION);
						if(confirm1 == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "매장에서 식사를 선택하셨습니다!");
							ownpanel[12].setVisible(false);
							Visible(ownpanel);
							takecheck = 0;
						}
						else if(confirm1 == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "초기 화면으로 돌아가겠습니다!");
						}
					}
			}
		});
		firstbtn[1].addActionListener(new ActionListener() {//처음 실행화면에서 Take Out을 클릭하시면 발생하는 이벤트로 takecheck = 1을 통해 Take Out 손님을 구분한다.
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == firstbtn[1]) {
						int confirm2 = JOptionPane.showConfirmDialog(null,"Take Out을 하시겠습니까?","식사 장소 확인",JOptionPane.YES_NO_OPTION);
						if(confirm2 == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Take Out을 선택하셨습니다!");
							ownpanel[12].setVisible(false);
							Visible(ownpanel);
							takecheck = 1;
						}
						else if(confirm2 == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "초기 화면으로 돌아가겠습니다!");
						}
					}
			}
		});
		btn[0].addActionListener(new ActionListener() {//결제 버튼을 클릭을 하면 "결제 수단을 선택해주세요"라는 알림 메시지와 함께 각 수단 방법을 선택시 그 결제 수단을 진행하겠다는 알림창까지 뜨도록하는 이벤트
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btn[0]) {
						String []count = {"카드 결제","결제 취소"};
						String []qoption1 = {"예","아니요"};
						int selected = JOptionPane.showOptionDialog(null, "결제 수단을 선택해주세요.", "Count",JOptionPane.YES_NO_OPTION, 
																	JOptionPane.QUESTION_MESSAGE, null, count, count[0]);
						if(selected == JOptionPane.CLOSED_OPTION)
						 JOptionPane.showMessageDialog(null, "결제를 취소하겠습니다.");
						else if(selected == 0){//만약 카드 결제를 눌렀다면
							if(takecheck == 0) {//그리고 매장식사 손님이라면 원 가격에 그대로 결제
								int option1 = JOptionPane.showOptionDialog(null, entiresum + "원을 결제 진행하시겠습니까?", "Count",JOptionPane.YES_NO_OPTION, 
											JOptionPane.QUESTION_MESSAGE, null, qoption1, qoption1[0]);
								if(option1 == 0) {
									JOptionPane.showMessageDialog(null,"","Card Payment",JOptionPane.INFORMATION_MESSAGE,Acicon1);
								 /**JOptionPane.showMessageDialog(null,entiresum + "원을 " + count[selected]+"하겠습니다.");**/
								Resetfn();
								}
							}
							else if(takecheck == 1) {//민약 Take Out손님이라면 10%를 할인받은 가격에 카드 결제 진행
								int option1 = JOptionPane.showOptionDialog(null, "\t           10% 할인을 받은\n" + (entiresum - (entiresum/10)) + "원에 결제 진행하시겠습니까?", "Count",JOptionPane.YES_NO_OPTION, 
										JOptionPane.QUESTION_MESSAGE, null, qoption1, qoption1[0]);
								if(option1 == 0) {
									JOptionPane.showMessageDialog(null,"","Card Payment",JOptionPane.INFORMATION_MESSAGE,Acicon1);
								 /**JOptionPane.showMessageDialog(null,entiresum + "원을 " + count[selected]+"하겠습니다.");**/
								Resetfn();
							}
							else
								JOptionPane.showMessageDialog(null, "이전 창으로 돌아가겠습니다.");
						}
							}
						else if(selected == 1) {//결제 취소를 누르시면 "이전 창으로 돌아가겠습니다."라는 메시지와 함께 돌아간다.
							JOptionPane.showMessageDialog(null,"이전 창으로 돌아가겠습니다.");
						}
					}
			} 
		});
		btn[1].addActionListener(new ActionListener() {//주문 취소 버튼을 누르면 "정말로 모든 주문을 취소하시겠습니까?라는 알림창과 함께 YES를 클릭시 "주문을 취소하겠습니다"라는 
			public void actionPerformed(ActionEvent e) {//메세지와 함께 주문 목록을 다 지우고 NO를 클릭 시 "이전 창으로 돌아가겠습니다"라는 메시지와 함께 종료된다.
					if(e.getSource() == btn[1]) {
						int result = JOptionPane.showConfirmDialog(null,"정말로 모든 주문을 취소하시겠습니까?","Confirm",JOptionPane.YES_NO_OPTION);
						if(result == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "주문을 취소하겠습니다.");
						Resetfn();
						}
						else {
							JOptionPane.showMessageDialog(null, "이전 창으로 돌아가겠습니다.");
						}
					}
			} 
		});
	}
	public void Resetfn() {//결제나 주문취소 시에 주문내역에 있는 컴포넌트들을 모두 지우고 각 메뉴들과 총 합계 금액에 대한 변수들 초기화. 
		for(int y=0;y<10;y++) {
			ownpanel[2].removeAll();
			sumprice1[y] = 0;
			sumprice2[y] = 0;
			sumprice3[y] = 0;
			sumprice4[y] = 0;
			ChickenMenuPrice[y] = 0;
			BonelessChickenPrice[y] = 0;
			SideMenuPrice[y] = 0;
			Beveragemenuprice4[y] = 0;
			count1[y] = 0;
			count2[y] = 0;
			count3[y] = 0;
			count4[y] = 0;
			txt1[y].setText(count1[y] + "");
			txt2[y].setText(count2[y] + "");
			txt3[y].setText(count3[y] + "");
			txt4[y].setText(count4[y] + "");
			txt11[y].setText(sumprice1[y] + "원");
			txt22[y].setText(sumprice2[y] + "원");
			txt33[y].setText(sumprice3[y] + "원");
			txt44[y].setText(sumprice4[y] + "원");
			bonechicken[y].setEnabled(true);
			bonelesschicken[y].setEnabled(true);
			side[y].setEnabled(true);
			bside[y].setEnabled(true);
			ownpanel[2].setBounds(720, 92, 480, 380);
			ownpanel[2].repaint();
			ownpanel[2].revalidate();
			ownpanel[2].setVisible(true);
			entiresum = 0;
			sum.setText(entiresum + "원");
			sum.setVisible(true);
			a = 0;
		}
	}
}