package action;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class EtcClick extends BeverageClick{
	public static int takecheck = 0;
	protected ImageIcon Acicon1 = new ImageIcon("src/image/����.gif");
	public EtcClick() {
		select[0].addActionListener(new ActionListener() {//ġŲ ��ư�� Ŭ���� �ϸ� ġŲ �޴��� ����ִ� ownpanel[5]�� Ȱ��ȭ��Ű�� �������� �� ��Ȱ��ȭ
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[0]) {
						ownpanel[5].setVisible(true);
						ownpanel[6].setVisible(false);
						ownpanel[7].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[1].addActionListener(new ActionListener() {//���� ġŲ ��ư�� Ŭ���� �ϸ� ���� ġŲ �޴��� ����ִ� ownpanel[6]�� Ȱ��ȭ��Ű�� �������� �� ��Ȱ��ȭ
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[1]) {
						ownpanel[6].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[7].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[2].addActionListener(new ActionListener() {//���̵�޴� ��ư�� Ŭ���� �ϸ� ���̵� �޴��� ����ִ� ownpanel[7]�� Ȱ��ȭ��Ű�� �������� �� ��Ȱ��ȭ
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[2]) {
						ownpanel[7].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[6].setVisible(false);
						ownpanel[8].setVisible(false);
					}
			}
		});
		select[3].addActionListener(new ActionListener() {//���� ��ư�� Ŭ���� �ϸ� ���� �޴��� ����ִ� ownpanel[8]�� Ȱ��ȭ��Ű�� �������� �� ��Ȱ��ȭ
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == select[3]) {
						ownpanel[8].setVisible(true);
						ownpanel[5].setVisible(false);
						ownpanel[6].setVisible(false);
						ownpanel[7].setVisible(false);
					}
			}
		});
		firstbtn[0].addActionListener(new ActionListener() {//ó�� ����ȭ�鿡�� ����Ļ縦 Ŭ���Ͻø� �߻��ϴ� �̺�Ʈ�� takecheck = 0�� ���� ����Ļ� �մ��̶�� ���� �����Ѵ�. 
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == firstbtn[0]) {
						int confirm1 = JOptionPane.showConfirmDialog(null,"���忡�� �Ļ縦 �ϰ� ���ðڽ��ϱ�?","�Ļ� ��� Ȯ��",JOptionPane.YES_NO_OPTION);
						if(confirm1 == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "���忡�� �Ļ縦 �����ϼ̽��ϴ�!");
							ownpanel[12].setVisible(false);
							Visible(ownpanel);
							takecheck = 0;
						}
						else if(confirm1 == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "�ʱ� ȭ������ ���ư��ڽ��ϴ�!");
						}
					}
			}
		});
		firstbtn[1].addActionListener(new ActionListener() {//ó�� ����ȭ�鿡�� Take Out�� Ŭ���Ͻø� �߻��ϴ� �̺�Ʈ�� takecheck = 1�� ���� Take Out �մ��� �����Ѵ�.
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == firstbtn[1]) {
						int confirm2 = JOptionPane.showConfirmDialog(null,"Take Out�� �Ͻðڽ��ϱ�?","�Ļ� ��� Ȯ��",JOptionPane.YES_NO_OPTION);
						if(confirm2 == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Take Out�� �����ϼ̽��ϴ�!");
							ownpanel[12].setVisible(false);
							Visible(ownpanel);
							takecheck = 1;
						}
						else if(confirm2 == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "�ʱ� ȭ������ ���ư��ڽ��ϴ�!");
						}
					}
			}
		});
		btn[0].addActionListener(new ActionListener() {//���� ��ư�� Ŭ���� �ϸ� "���� ������ �������ּ���"��� �˸� �޽����� �Բ� �� ���� ����� ���ý� �� ���� ������ �����ϰڴٴ� �˸�â���� �ߵ����ϴ� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == btn[0]) {
						String []count = {"ī�� ����","���� ���"};
						String []qoption1 = {"��","�ƴϿ�"};
						int selected = JOptionPane.showOptionDialog(null, "���� ������ �������ּ���.", "Count",JOptionPane.YES_NO_OPTION, 
																	JOptionPane.QUESTION_MESSAGE, null, count, count[0]);
						if(selected == JOptionPane.CLOSED_OPTION)
						 JOptionPane.showMessageDialog(null, "������ ����ϰڽ��ϴ�.");
						else if(selected == 0){//���� ī�� ������ �����ٸ�
							if(takecheck == 0) {//�׸��� ����Ļ� �մ��̶�� �� ���ݿ� �״�� ����
								int option1 = JOptionPane.showOptionDialog(null, entiresum + "���� ���� �����Ͻðڽ��ϱ�?", "Count",JOptionPane.YES_NO_OPTION, 
											JOptionPane.QUESTION_MESSAGE, null, qoption1, qoption1[0]);
								if(option1 == 0) {
									JOptionPane.showMessageDialog(null,"","Card Payment",JOptionPane.INFORMATION_MESSAGE,Acicon1);
								 /**JOptionPane.showMessageDialog(null,entiresum + "���� " + count[selected]+"�ϰڽ��ϴ�.");**/
								Resetfn();
								}
							}
							else if(takecheck == 1) {//�ξ� Take Out�մ��̶�� 10%�� ���ι��� ���ݿ� ī�� ���� ����
								int option1 = JOptionPane.showOptionDialog(null, "\t           10% ������ ����\n" + (entiresum - (entiresum/10)) + "���� ���� �����Ͻðڽ��ϱ�?", "Count",JOptionPane.YES_NO_OPTION, 
										JOptionPane.QUESTION_MESSAGE, null, qoption1, qoption1[0]);
								if(option1 == 0) {
									JOptionPane.showMessageDialog(null,"","Card Payment",JOptionPane.INFORMATION_MESSAGE,Acicon1);
								 /**JOptionPane.showMessageDialog(null,entiresum + "���� " + count[selected]+"�ϰڽ��ϴ�.");**/
								Resetfn();
							}
							else
								JOptionPane.showMessageDialog(null, "���� â���� ���ư��ڽ��ϴ�.");
						}
							}
						else if(selected == 1) {//���� ��Ҹ� �����ø� "���� â���� ���ư��ڽ��ϴ�."��� �޽����� �Բ� ���ư���.
							JOptionPane.showMessageDialog(null,"���� â���� ���ư��ڽ��ϴ�.");
						}
					}
			} 
		});
		btn[1].addActionListener(new ActionListener() {//�ֹ� ��� ��ư�� ������ "������ ��� �ֹ��� ����Ͻðڽ��ϱ�?��� �˸�â�� �Բ� YES�� Ŭ���� "�ֹ��� ����ϰڽ��ϴ�"��� 
			public void actionPerformed(ActionEvent e) {//�޼����� �Բ� �ֹ� ����� �� ����� NO�� Ŭ�� �� "���� â���� ���ư��ڽ��ϴ�"��� �޽����� �Բ� ����ȴ�.
					if(e.getSource() == btn[1]) {
						int result = JOptionPane.showConfirmDialog(null,"������ ��� �ֹ��� ����Ͻðڽ��ϱ�?","Confirm",JOptionPane.YES_NO_OPTION);
						if(result == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "�ֹ��� ����ϰڽ��ϴ�.");
						Resetfn();
						}
						else {
							JOptionPane.showMessageDialog(null, "���� â���� ���ư��ڽ��ϴ�.");
						}
					}
			} 
		});
	}
	public void Resetfn() {//������ �ֹ���� �ÿ� �ֹ������� �ִ� ������Ʈ���� ��� ����� �� �޴���� �� �հ� �ݾ׿� ���� ������ �ʱ�ȭ. 
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
			txt11[y].setText(sumprice1[y] + "��");
			txt22[y].setText(sumprice2[y] + "��");
			txt33[y].setText(sumprice3[y] + "��");
			txt44[y].setText(sumprice4[y] + "��");
			bonechicken[y].setEnabled(true);
			bonelesschicken[y].setEnabled(true);
			side[y].setEnabled(true);
			bside[y].setEnabled(true);
			ownpanel[2].setBounds(720, 92, 480, 380);
			ownpanel[2].repaint();
			ownpanel[2].revalidate();
			ownpanel[2].setVisible(true);
			entiresum = 0;
			sum.setText(entiresum + "��");
			sum.setVisible(true);
			a = 0;
		}
	}
}