package mid_MpBtn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import action.EtcClick;
public class mpbtn1 extends EtcClick{
		public mpbtn1() {//치킨 메뉴 버튼을 눌렀을 때 주문내역에 들어가는데 그때 +,-버튼을 누르면 합계 금액 변화와 총 합계 금액 변화를 보여주는 클래스.
			m1[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[0] > 0) {
						count1[0] = count1[0] -  1;
						txt1[0].setText(count1[0] + "");
						sumprice1[0] -= ChickenMenuPrice[0];
						txt11[0].setText(sumprice1[0] + "원");
						entiresum -= ChickenMenuPrice[0];
						sum.setText(entiresum + "원");
						p1[0].setEnabled(true);
					}
					else 
						m1[0].setEnabled(false);
				}
			});
			p1[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[0] < 10) {
						count1[0] = count1[0] +1;
						txt1[0].setText(count1[0]+"");
						sumprice1[0] += ChickenMenuPrice[0];
						txt11[0].setText(sumprice1[0] + "원");
						entiresum += ChickenMenuPrice[0];
						sum.setText(entiresum + "원");
						m1[0].setEnabled(true);
					}
					else
						p1[0].setEnabled(false);
				}
			});
			m1[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[1] > 0) {
						count1[1] = count1[1] -  1;
						txt1[1].setText(count1[1] + "");
						sumprice1[1] -= ChickenMenuPrice[1];
						txt11[1].setText(sumprice1[1] + "원");
						entiresum -= ChickenMenuPrice[1];
						sum.setText(entiresum + "원");
						p1[1].setEnabled(true);
					}
					else 
						m1[1].setEnabled(false);
				}
			});
			p1[1].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[1] < 10) {
						count1[1] = count1[1] +1;
						txt1[1].setText(count1[1]+"");
						sumprice1[1] += ChickenMenuPrice[1];
						txt11[1].setText(sumprice1[1] + "원");
						entiresum += ChickenMenuPrice[1];
						sum.setText(entiresum + "원");
						m1[1].setEnabled(true);
					}
					else
						p1[1].setEnabled(false);
				}
			});
			m1[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[2] > 0) {
						count1[2] = count1[2] -  1;
						txt1[2].setText(count1[2] + "");
						sumprice1[2] -= ChickenMenuPrice[2];
						txt11[2].setText(sumprice1[2] + "원");
						entiresum -= ChickenMenuPrice[2];
						sum.setText(entiresum + "원");
						p1[2].setEnabled(true);
					}
					else 
						m1[2].setEnabled(false);
				}
			});
			p1[2].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[2] < 10) {
						count1[2] = count1[2] +1;
						txt1[2].setText(count1[2]+"");
						sumprice1[2] += ChickenMenuPrice[2];
						txt11[2].setText(sumprice1[2] + "원");
						entiresum += ChickenMenuPrice[2];
						sum.setText(entiresum + "원");
						m1[2].setEnabled(true);
					}
					else
						p1[2].setEnabled(false);
				}
			});
			m1[3].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[3] > 0) {
						count1[3] = count1[3] -  1;
						txt1[3].setText(count1[3] + "");
						sumprice1[3] -= ChickenMenuPrice[3];
						txt11[3].setText(sumprice1[3] + "원");
						entiresum -= ChickenMenuPrice[3];
						sum.setText(entiresum + "원");
						p1[3].setEnabled(true);
					}
					else 
						m1[3].setEnabled(false);
				}
			});
			p1[3].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[3] < 10) {
						count1[3] = count1[3] +1;
						txt1[3].setText(count1[3]+"");
						sumprice1[3] += ChickenMenuPrice[3];
						txt11[3].setText(sumprice1[3] + "원");
						entiresum += ChickenMenuPrice[3];
						sum.setText(entiresum + "원");
						m1[3].setEnabled(true);
					}
					else
						p1[3].setEnabled(false);
				}
			});
			m1[4].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[4] > 0) {
						count1[4] = count1[4] -  1;
						txt1[4].setText(count1[4] + "");
						sumprice1[4] -= ChickenMenuPrice[4];
						txt11[4].setText(sumprice1[4] + "원");
						entiresum -= ChickenMenuPrice[4];
						sum.setText(entiresum + "원");
						p1[4].setEnabled(true);
					}
					else 
						m1[4].setEnabled(false);
				}
			});
			p1[4].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[4] < 10) {
						count1[4] = count1[4] +1;
						txt1[4].setText(count1[4]+"");
						sumprice1[4] += ChickenMenuPrice[4];
						txt11[4].setText(sumprice1[4] + "원");
						entiresum += ChickenMenuPrice[4];
						sum.setText(entiresum + "원");
						m1[4].setEnabled(true);
					}
					else
						p1[4].setEnabled(false);
				}
			});
			m1[5].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[5] > 0) {
						count1[5] = count1[5] -  1;
						txt1[5].setText(count1[5] + "");
						sumprice1[5] -= ChickenMenuPrice[5];
						txt11[5].setText(sumprice1[5] + "원");
						entiresum -= ChickenMenuPrice[5];
						sum.setText(entiresum + "원");
						p1[5].setEnabled(true);
					}
					else 
						m1[5].setEnabled(false);
				}
			});
			p1[5].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[5] < 10) {
						count1[5] = count1[5] +1;
						txt1[5].setText(count1[5]+"");
						sumprice1[5] += ChickenMenuPrice[5];
						txt11[5].setText(sumprice1[5] + "원");
						entiresum += ChickenMenuPrice[5];
						sum.setText(entiresum + "원");
						m1[5].setEnabled(true);
					}
					else
						p1[5].setEnabled(false);
				}
			});
			m1[6].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[6] > 0) {
						count1[6] = count1[6] -  1;
						txt1[6].setText(count1[6] + "");
						sumprice1[6] -= ChickenMenuPrice[6];
						txt11[6].setText(sumprice1[6] + "원");
						entiresum -= ChickenMenuPrice[6];
						sum.setText(entiresum + "원");
						p1[6].setEnabled(true);
					}
					else 
						m1[6].setEnabled(false);
				}
			});
			p1[6].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[6] < 10) {
						count1[6] = count1[6] +1;
						txt1[6].setText(count1[6]+"");
						sumprice1[6] += ChickenMenuPrice[6];
						txt11[6].setText(sumprice1[6] + "원");
						entiresum += ChickenMenuPrice[6];
						sum.setText(entiresum + "원");
						m1[6].setEnabled(true);
					}
					else
						p1[6].setEnabled(false);
				}
			});
			m1[7].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[7] > 0) {
						count1[7] = count1[7] -  1;
						txt1[7].setText(count1[7] + "");
						sumprice1[7] -= ChickenMenuPrice[7];
						txt11[7].setText(sumprice1[7] + "원");
						entiresum -= ChickenMenuPrice[7];
						sum.setText(entiresum + "원");
						p1[7].setEnabled(true);
					}
					else 
						m1[7].setEnabled(false);
				}
			});
			p1[7].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[7] < 10) {
						count1[7] = count1[7] +1;
						txt1[7].setText(count1[7]+"");
						sumprice1[7] += ChickenMenuPrice[7];
						txt11[7].setText(sumprice1[7] + "원");
						entiresum += ChickenMenuPrice[7];
						sum.setText(entiresum + "원");
						m1[7].setEnabled(true);
					}
					else
						p1[7].setEnabled(false);
				}
			});
			m1[8].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[8] > 0) {
						count1[8] = count1[8] -  1;
						txt1[8].setText(count1[8] + "");
						sumprice1[8] -= ChickenMenuPrice[8];
						txt11[8].setText(sumprice1[8] + "원");
						entiresum -= ChickenMenuPrice[8];
						sum.setText(entiresum + "원");
						p1[8].setEnabled(true);
					}
					else 
						m1[8].setEnabled(false);
				}
			});
			p1[8].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(count1[8] < 10) {
						count1[8] = count1[8] +1;
						txt1[8].setText(count1[8]+"");
						sumprice1[8] += ChickenMenuPrice[8];
						txt11[8].setText(sumprice1[8] + "원");
						entiresum += ChickenMenuPrice[8];
						sum.setText(entiresum + "원");
						m1[8].setEnabled(true);
					}
					else
						p1[8].setEnabled(false);
				}
			});
		}
}
