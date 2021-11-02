package mid_MpBtn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mpbtn4 extends mpbtn3{
	public mpbtn4() {//음료 메뉴 버튼을 눌렀을 때 주문내역에 들어가는데 그때 +,-버튼을 누르면 합계 금액 변화와 총 합계 금액 변화를 보여주는 클래스.
		m4[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[0] > 0) {
					count4[0] = count4[0] -  1;
					txt4[0].setText(count4[0] + "");
					sumprice4[0] -= Beveragemenuprice4[0];
					txt44[0].setText(sumprice4[0] + "원");
					entiresum -= Beveragemenuprice4[0];
					sum.setText(entiresum + "원");
					p4[0].setEnabled(true);
				}
				else 
					m4[0].setEnabled(false);
			}
		});
		p4[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[0] < 10) {
					count4[0] = count4[0] +1;
					txt4[0].setText(count4[0]+"");
					sumprice4[0] += Beveragemenuprice4[0];
					txt44[0].setText(sumprice4[0] + "원");
					entiresum += Beveragemenuprice4[0];
					sum.setText(entiresum + "원");
					m4[0].setEnabled(true);
				}
				else
					p4[0].setEnabled(false);
			}
		});
		m4[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[1] > 0) {
					count4[1] = count4[1] -  1;
					txt4[1].setText(count4[1] + "");
					sumprice4[1] -= Beveragemenuprice4[1];
					txt44[1].setText(sumprice4[1] + "원");
					entiresum -= Beveragemenuprice4[1];
					sum.setText(entiresum + "원");
					p4[1].setEnabled(true);
				}
				else 
					m4[1].setEnabled(false);
			}
		});
		p4[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[1] < 10) {
					count4[1] = count4[1] +1;
					txt4[1].setText(count4[1]+"");
					sumprice4[1] += Beveragemenuprice4[1];
					txt44[1].setText(sumprice4[1] + "원");
					entiresum += Beveragemenuprice4[1];
					sum.setText(entiresum + "원");
					m4[1].setEnabled(true);
				}
				else
					p4[1].setEnabled(false);
			}
		});
		m4[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[2] > 0) {
					count4[2] = count4[2] -  1;
					txt4[2].setText(count4[2] + "");
					sumprice4[2] -= Beveragemenuprice4[2];
					txt44[2].setText(sumprice4[2] + "원");
					entiresum -= Beveragemenuprice4[2];
					sum.setText(entiresum + "원");
					p4[2].setEnabled(true);
				}
				else 
					m4[2].setEnabled(false);
			}
		});
		p4[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[2] < 10) {
					count4[2] = count4[2] +1;
					txt4[2].setText(count4[2]+"");
					sumprice4[2] += Beveragemenuprice4[2];
					txt44[2].setText(sumprice4[2] + "원");
					entiresum += Beveragemenuprice4[2];
					sum.setText(entiresum + "원");
					m4[2].setEnabled(true);
				}
				else
					p4[2].setEnabled(false);
			}
		});
		m4[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[3] > 0) {
					count4[3] = count4[3] -  1;
					txt4[3].setText(count4[3] + "");
					sumprice4[3] -= Beveragemenuprice4[3];
					txt44[3].setText(sumprice4[3] + "원");
					entiresum -= Beveragemenuprice4[3];
					sum.setText(entiresum + "원");
					p4[3].setEnabled(true);
				}
				else 
					m4[3].setEnabled(false);
			}
		});
		p4[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[3] < 10) {
					count4[3] = count4[3] +1;
					txt4[3].setText(count4[3]+"");
					sumprice4[3] += Beveragemenuprice4[3];
					txt44[3].setText(sumprice4[3] + "원");
					entiresum += Beveragemenuprice4[3];
					sum.setText(entiresum + "원");
					m4[3].setEnabled(true);
				}
				else
					p4[3].setEnabled(false);
			}
		});
		m4[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[4] > 0) {
					count4[4] = count4[4] -  1;
					txt4[4].setText(count4[4] + "");
					sumprice4[4] -= Beveragemenuprice4[4];
					txt44[4].setText(sumprice4[4] + "원");
					entiresum -= Beveragemenuprice4[4];
					sum.setText(entiresum + "원");
					p4[4].setEnabled(true);
				}
				else 
					m4[4].setEnabled(false);
			}
		});
		p4[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[4] < 10) {
					count4[4] = count4[4] +1;
					txt4[4].setText(count4[4]+"");
					sumprice4[4] += Beveragemenuprice4[4];
					txt44[4].setText(sumprice4[4] + "원");
					entiresum += Beveragemenuprice4[4];
					sum.setText(entiresum + "원");
					m4[4].setEnabled(true);
				}
				else
					p4[4].setEnabled(false);
			}
		});
		m4[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[5] > 0) {
					count4[5] = count4[5] -  1;
					txt4[5].setText(count4[5] + "");
					sumprice4[5] -= Beveragemenuprice4[5];
					txt44[5].setText(sumprice4[5] + "원");
					entiresum -= Beveragemenuprice4[5];
					sum.setText(entiresum + "원");
					p4[5].setEnabled(true);
				}
				else 
					m4[5].setEnabled(false);
			}
		});
		p4[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[5] < 10) {
					count4[5] = count4[5] +1;
					txt4[5].setText(count4[5]+"");
					sumprice4[5] += Beveragemenuprice4[5];
					txt44[5].setText(sumprice4[5] + "원");
					entiresum += Beveragemenuprice4[5];
					sum.setText(entiresum + "원");
					m4[5].setEnabled(true);
				}
				else
					p4[5].setEnabled(false);
			}
		});
		m4[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[6] > 0) {
					count4[6] = count4[6] -  1;
					txt4[6].setText(count4[6] + "");
					sumprice4[6] -= Beveragemenuprice4[6];
					txt44[6].setText(sumprice4[6] + "원");
					entiresum -= Beveragemenuprice4[6];
					sum.setText(entiresum + "원");
					p4[6].setEnabled(true);
				}
				else 
					m4[6].setEnabled(false);
			}
		});
		p4[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[6] < 10) {
					count4[6] = count4[6] +1;
					txt4[6].setText(count4[6]+"");
					sumprice4[6] += Beveragemenuprice4[6];
					txt44[6].setText(sumprice4[6] + "원");
					entiresum += Beveragemenuprice4[6];
					sum.setText(entiresum + "원");
					m4[6].setEnabled(true);
				}
				else
					p4[6].setEnabled(false);
			}
		});
		m4[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[7] > 0) {
					count4[7] = count4[7] -  1;
					txt4[7].setText(count4[7] + "");
					sumprice4[7] -= Beveragemenuprice4[7];
					txt44[7].setText(sumprice4[7] + "원");
					entiresum -= Beveragemenuprice4[7];
					sum.setText(entiresum + "원");
					p4[7].setEnabled(true);
				}
				else 
					m4[7].setEnabled(false);
			}
		});
		p4[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[7] < 10) {
					count4[7] = count4[7] +1;
					txt4[7].setText(count4[7]+"");
					sumprice4[7] += Beveragemenuprice4[7];
					txt44[7].setText(sumprice4[7] + "원");
					entiresum += Beveragemenuprice4[7];
					sum.setText(entiresum + "원");
					m4[7].setEnabled(true);
				}
				else
					p4[7].setEnabled(false);
			}
		});
		m4[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[8] > 0) {
					count4[8] = count4[8] -  1;
					txt4[8].setText(count4[8] + "");
					sumprice4[8] -= Beveragemenuprice4[8];
					txt44[8].setText(sumprice4[8] + "원");
					entiresum -= Beveragemenuprice4[8];
					sum.setText(entiresum + "원");
					p4[8].setEnabled(true);
				}
				else 
					m4[8].setEnabled(false);
			}
		});
		p4[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count4[8] < 10) {
					count4[8] = count4[8] +1;
					txt4[8].setText(count4[8]+"");
					sumprice4[8] += Beveragemenuprice4[8];
					txt44[8].setText(sumprice4[8] + "원");
					entiresum += Beveragemenuprice4[8];
					sum.setText(entiresum + "원");
					m4[8].setEnabled(true);
				}
				else
					p4[8].setEnabled(false);
			}
		});
	}
}
