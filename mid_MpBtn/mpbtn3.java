package mid_MpBtn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mpbtn3 extends mpbtn2{
	public mpbtn3() {//���̵� �޴� ��ư�� ������ �� �ֹ������� ���µ� �׶� +,-��ư�� ������ �հ� �ݾ� ��ȭ�� �� �հ� �ݾ� ��ȭ�� �����ִ� Ŭ����.
		m3[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[0] > 0) {
					count3[0] = count3[0] -  1;
					txt3[0].setText(count3[0] + "");
					sumprice3[0] -= SideMenuPrice[0];
					txt33[0].setText(sumprice3[0] + "��");
					entiresum -= SideMenuPrice[0];
					sum.setText(entiresum + "��");
					p3[0].setEnabled(true);
				}
				else 
					m3[0].setEnabled(false);
			}
		});
		p3[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[0] < 10) {
					count3[0] = count3[0] +1;
					txt3[0].setText(count3[0]+"");
					sumprice3[0] += SideMenuPrice[0];
					txt33[0].setText(sumprice3[0] + "��");
					entiresum += SideMenuPrice[0];
					sum.setText(entiresum + "��");
					m3[0].setEnabled(true);
				}
				else
					p3[0].setEnabled(false);
			}
		});
		m3[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[1] > 0) {
					count3[1] = count3[1] -  1;
					txt3[1].setText(count3[1] + "");
					sumprice3[1] -= SideMenuPrice[1];
					txt33[1].setText(sumprice3[1] + "��");
					entiresum -= SideMenuPrice[1];
					sum.setText(entiresum + "��");
					p3[1].setEnabled(true);
				}
				else 
					m3[1].setEnabled(false);
			}
		});
		p3[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[1] < 10) {
					count3[1] = count3[1] +1;
					txt3[1].setText(count3[1]+"");
					sumprice3[1] += SideMenuPrice[1];
					txt33[1].setText(sumprice3[1] + "��");
					entiresum += SideMenuPrice[1];
					sum.setText(entiresum + "��");
					m3[1].setEnabled(true);
				}
				else
					p3[1].setEnabled(false);
			}
		});
		m3[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[2] > 0) {
					count3[2] = count3[2] -  1;
					txt3[2].setText(count3[2] + "");
					sumprice3[2] -= SideMenuPrice[2];
					txt33[2].setText(sumprice3[2] + "��");
					entiresum -= SideMenuPrice[2];
					sum.setText(entiresum + "��");
					p3[2].setEnabled(true);
				}
				else 
					m3[2].setEnabled(false);
			}
		});
		p3[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[2] < 10) {
					count3[2] = count3[2] +1;
					txt3[2].setText(count3[2]+"");
					sumprice3[2] += SideMenuPrice[2];
					txt33[2].setText(sumprice3[2] + "��");
					entiresum += SideMenuPrice[2];
					sum.setText(entiresum + "��");
					m3[2].setEnabled(true);
				}
				else
					p3[2].setEnabled(false);
			}
		});
		m3[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[3] > 0) {
					count3[3] = count3[3] -  1;
					txt3[3].setText(count3[3] + "");
					sumprice3[3] -= SideMenuPrice[3];
					txt33[3].setText(sumprice3[3] + "��");
					entiresum -= SideMenuPrice[3];
					sum.setText(entiresum + "��");
					p3[3].setEnabled(true);
				}
				else 
					m3[3].setEnabled(false);
			}
		});
		p3[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[3] < 10) {
					count3[3] = count3[3] +1;
					txt3[3].setText(count3[3]+"");
					sumprice3[3] += SideMenuPrice[3];
					txt33[3].setText(sumprice3[3] + "��");
					entiresum += SideMenuPrice[3];
					sum.setText(entiresum + "��");
					m3[3].setEnabled(true);
				}
				else
					p3[3].setEnabled(false);
			}
		});
		m3[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[4] > 0) {
					count3[4] = count3[4] -  1;
					txt3[4].setText(count3[4] + "");
					sumprice3[4] -= SideMenuPrice[4];
					txt33[4].setText(sumprice3[4] + "��");
					entiresum -= SideMenuPrice[4];
					sum.setText(entiresum + "��");
					p3[4].setEnabled(true);
				}
				else 
					m3[4].setEnabled(false);
			}
		});
		p3[4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[4] < 10) {
					count3[4] = count3[4] +1;
					txt3[4].setText(count3[4]+"");
					sumprice3[4] += SideMenuPrice[4];
					txt33[4].setText(sumprice3[4] + "��");
					entiresum += SideMenuPrice[4];
					sum.setText(entiresum + "��");
					m3[4].setEnabled(true);
				}
				else
					p3[4].setEnabled(false);
			}
		});
		m3[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[5] > 0) {
					count3[5] = count3[5] -  1;
					txt3[5].setText(count3[5] + "");
					sumprice3[5] -= SideMenuPrice[5];
					txt33[5].setText(sumprice3[5] + "��");
					entiresum -= SideMenuPrice[5];
					sum.setText(entiresum + "��");
					p3[5].setEnabled(true);
				}
				else 
					m3[5].setEnabled(false);
			}
		});
		p3[5].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[5] < 10) {
					count3[5] = count3[5] +1;
					txt3[5].setText(count3[5]+"");
					sumprice3[5] += SideMenuPrice[5];
					txt33[5].setText(sumprice3[5] + "��");
					entiresum += SideMenuPrice[5];
					sum.setText(entiresum + "��");
					m3[5].setEnabled(true);
				}
				else
					p3[5].setEnabled(false);
			}
		});
		m3[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[6] > 0) {
					count3[6] = count3[6] -  1;
					txt3[6].setText(count3[6] + "");
					sumprice3[6] -= SideMenuPrice[6];
					txt33[6].setText(sumprice3[6] + "��");
					entiresum -= SideMenuPrice[6];
					sum.setText(entiresum + "��");
					p3[6].setEnabled(true);
				}
				else 
					m3[6].setEnabled(false);
			}
		});
		p3[6].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[6] < 10) {
					count3[6] = count3[6] +1;
					txt3[6].setText(count3[6]+"");
					sumprice3[6] += SideMenuPrice[6];
					txt33[6].setText(sumprice3[6] + "��");
					entiresum += SideMenuPrice[6];
					sum.setText(entiresum + "��");
					m3[6].setEnabled(true);
				}
				else
					p3[6].setEnabled(false);
			}
		});
		m3[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[7] > 0) {
					count3[7] = count3[7] -  1;
					txt3[7].setText(count3[7] + "");
					sumprice3[7] -= SideMenuPrice[7];
					txt33[7].setText(sumprice3[7] + "��");
					entiresum -= SideMenuPrice[7];
					sum.setText(entiresum + "��");
					p3[7].setEnabled(true);
				}
				else 
					m3[7].setEnabled(false);
			}
		});
		p3[7].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[7] < 10) {
					count3[7] = count3[7] +1;
					txt3[7].setText(count3[7]+"");
					sumprice3[7] += SideMenuPrice[7];
					txt33[7].setText(sumprice3[7] + "��");
					entiresum += SideMenuPrice[7];
					sum.setText(entiresum + "��");
					m3[7].setEnabled(true);
				}
				else
					p3[7].setEnabled(false);
			}
		});
		m3[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[8] > 0) {
					count3[8] = count3[8] -  1;
					txt3[8].setText(count3[8] + "");
					sumprice3[8] -= SideMenuPrice[8];
					txt33[8].setText(sumprice3[8] + "��");
					entiresum -= SideMenuPrice[8];
					sum.setText(entiresum + "��");
					p3[8].setEnabled(true);
				}
				else 
					m3[8].setEnabled(false);
			}
		});
		p3[8].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count3[8] < 10) {
					count3[8] = count3[8] +1;
					txt3[8].setText(count3[8]+"");
					sumprice3[8] += SideMenuPrice[8];
					txt33[8].setText(sumprice3[8] + "��");
					entiresum += SideMenuPrice[8];
					sum.setText(entiresum + "��");
					m3[8].setEnabled(true);
				}
				else
					p3[8].setEnabled(false);
			}
		});
	}
}
