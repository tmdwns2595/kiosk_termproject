package mid_MpBtn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mpbtn2 extends mpbtn1{
	public mpbtn2() {//���� ġŲ �޴� ��ư�� ������ �� �ֹ������� ���µ� �׶� +,-��ư�� ������ �հ� �ݾ� ��ȭ�� �� �հ� �ݾ� ��ȭ�� �����ִ� Ŭ����.
		m2[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[0] > 0) {
					count2[0] = count2[0] -  1;
					txt2[0].setText(count2[0] + "");
					sumprice2[0] -= BonelessChickenPrice[0];
					txt22[0].setText(sumprice2[0] + "��");
					entiresum -= BonelessChickenPrice[0];
					sum.setText(entiresum + "��");
					p2[0].setEnabled(true);
				}
				else 
					m2[0].setEnabled(false);
			}
		});
		p2[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[0] < 10) {
					count2[0] = count2[0] +1;
					txt2[0].setText(count2[0]+"");
					sumprice2[0] += BonelessChickenPrice[0];
					txt22[0].setText(sumprice2[0] + "��");
					entiresum += BonelessChickenPrice[0];
					sum.setText(entiresum + "��");
					m2[0].setEnabled(true);
				}
				else
					p2[0].setEnabled(false);
			}
		});
		m2[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[1] > 0) {
					count2[1] = count2[1] -  1;
					txt2[1].setText(count2[1] + "");
					sumprice2[1] -= BonelessChickenPrice[1];
					txt22[1].setText(sumprice2[1] + "��");
					entiresum -= BonelessChickenPrice[1];
					sum.setText(entiresum + "��");
					p2[1].setEnabled(true);
				}
				else 
					m2[1].setEnabled(false);
			}
		});
		p2[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[1] < 10) {
					count2[1] = count2[1] +1;
					txt2[1].setText(count2[1]+"");
					sumprice2[1] += BonelessChickenPrice[1];
					txt22[1].setText(sumprice2[1] + "��");
					entiresum += BonelessChickenPrice[1];
					sum.setText(entiresum + "��");
					m2[1].setEnabled(true);
				}
				else
					p2[1].setEnabled(false);
			}
		});
		m2[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[2] > 0) {
					count2[2] = count2[2] -  1;
					txt2[2].setText(count2[2] + "");
					sumprice2[2] -= BonelessChickenPrice[2];
					txt22[2].setText(sumprice2[2] + "��");
					entiresum -= BonelessChickenPrice[2];
					sum.setText(entiresum + "��");
					p2[2].setEnabled(true);
				}
				else 
					m2[2].setEnabled(false);
			}
		});
		p2[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[2] < 10) {
					count2[2] = count2[2] +1;
					txt2[2].setText(count2[2]+"");
					sumprice2[2] += BonelessChickenPrice[2];
					txt22[2].setText(sumprice2[2] + "��");
					entiresum += BonelessChickenPrice[2];
					sum.setText(entiresum + "��");
					m2[2].setEnabled(true);
				}
				else
					p2[2].setEnabled(false);
			}
		});
		m2[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[3] > 0) {
					count2[3] = count2[3] -  1;
					txt2[3].setText(count2[3] + "");
					sumprice2[3] -= BonelessChickenPrice[3];
					txt22[3].setText(sumprice2[3] + "��");
					entiresum -= BonelessChickenPrice[3];
					sum.setText(entiresum + "��");
					p2[3].setEnabled(true);
				}
				else 
					m2[3].setEnabled(false);
			}
		});
		p2[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[3] < 10) {
					count2[3] = count2[3] +1;
					txt2[3].setText(count2[3]+"");
					sumprice2[3] += BonelessChickenPrice[3];
					txt22[3].setText(sumprice2[3] + "��");
					entiresum += BonelessChickenPrice[3];
					sum.setText(entiresum + "��");
					m2[3].setEnabled(true);
				}
				else
					p2[3].setEnabled(false);
			}
		});
		m2[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[4] > 0) {
					count2[4] = count2[4] -  1;
					txt2[4].setText(count2[4] + "");
					sumprice2[4] -= BonelessChickenPrice[4];
					txt22[4].setText(sumprice2[4] + "��");
					entiresum -= BonelessChickenPrice[4];
					sum.setText(entiresum + "��");
					p2[4].setEnabled(true);
				}
				else 
					m2[4].setEnabled(false);
			}
		});
		p2[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[4] < 10) {
					count2[4] = count2[4] +1;
					txt2[4].setText(count2[4]+"");
					sumprice2[4] += BonelessChickenPrice[4];
					txt22[4].setText(sumprice2[4] + "��");
					entiresum += BonelessChickenPrice[4];
					sum.setText(entiresum + "��");
					m2[4].setEnabled(true);
				}
				else
					p2[4].setEnabled(false);
			}
		});
		m2[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[5] > 0) {
					count2[5] = count2[5] -  1;
					txt2[5].setText(count2[5] + "");
					sumprice2[5] -= BonelessChickenPrice[5];
					txt22[5].setText(sumprice2[5] + "��");
					entiresum -= BonelessChickenPrice[5];
					sum.setText(entiresum + "��");
					p2[5].setEnabled(true);
				}
				else 
					m2[5].setEnabled(false);
			}
		});
		p2[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[5] < 10) {
					count2[5] = count2[5] +1;
					txt2[5].setText(count2[5]+"");
					sumprice2[5] += BonelessChickenPrice[5];
					txt22[5].setText(sumprice2[5] + "��");
					entiresum += BonelessChickenPrice[5];
					sum.setText(entiresum + "��");
					m2[5].setEnabled(true);
				}
				else
					p2[5].setEnabled(false);
			}
		});
		m2[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[6] > 0) {
					count2[6] = count2[6] -  1;
					txt2[6].setText(count2[6] + "");
					sumprice2[6] -= BonelessChickenPrice[6];
					txt22[6].setText(sumprice2[6] + "��");
					entiresum -= BonelessChickenPrice[6];
					sum.setText(entiresum + "��");
					p2[6].setEnabled(true);
				}
				else 
					m2[6].setEnabled(false);
			}
		});
		p2[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[6] < 10) {
					count2[6] = count2[6] +1;
					txt2[6].setText(count2[6]+"");
					sumprice2[6] += BonelessChickenPrice[6];
					txt22[6].setText(sumprice2[6] + "��");
					entiresum += BonelessChickenPrice[6];
					sum.setText(entiresum + "��");
					m2[6].setEnabled(true);
				}
				else
					p2[6].setEnabled(false);
			}
		});
		m2[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[7] > 0) {
					count2[7] = count2[7] -  1;
					txt2[7].setText(count2[7] + "");
					sumprice2[7] -= BonelessChickenPrice[7];
					txt22[7].setText(sumprice2[7] + "��");
					entiresum -= BonelessChickenPrice[7];
					sum.setText(entiresum + "��");
					p2[7].setEnabled(true);
				}
				else 
					m2[7].setEnabled(false);
			}
		});
		p2[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[7] < 10) {
					count2[7] = count2[7] +1;
					txt2[7].setText(count2[7]+"");
					sumprice2[7] += BonelessChickenPrice[7];
					txt22[7].setText(sumprice2[7] + "��");
					entiresum += BonelessChickenPrice[7];
					sum.setText(entiresum + "��");
					m2[7].setEnabled(true);
				}
				else
					p2[7].setEnabled(false);
			}
		});
		m2[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[8] > 0) {
					count2[8] = count2[8] -  1;
					txt2[8].setText(count2[8] + "");
					sumprice2[8] -= BonelessChickenPrice[8];
					txt22[8].setText(sumprice2[8] + "��");
					entiresum -= BonelessChickenPrice[8];
					sum.setText(entiresum + "��");
					p2[8].setEnabled(true);
				}
				else 
					m2[8].setEnabled(false);
			}
		});
		p2[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count2[8] < 10) {
					count2[8] = count2[8] +1;
					txt2[8].setText(count2[8]+"");
					sumprice2[8] += BonelessChickenPrice[8];
					txt22[8].setText(sumprice2[8] + "��");
					entiresum += BonelessChickenPrice[8];
					sum.setText(entiresum + "��");
					m2[8].setEnabled(true);
				}
				else
					p2[8].setEnabled(false);
			}
		});
	}
}
