package action;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mid_BigBtn.minebtn4;
public class ChickenClick extends minebtn4{
	public int a = 0;//�޴����� �̹��� ��ư�� Ŭ���� ���� �� �ֹ������� �� �޴��� �� �� ��ġ�� �Ȱ�ġ�� �߰������ֱ� ���� ����� a��� ���� ����
	public int entiresum = 0;//���� ���õ� �޴����� ��ü ������ �հ踦 ��Ÿ�� �� entiresum ����
	public JPanel bonepn[] = new JPanel[9];//�޴� �̹��� ��ư�� Ŭ���ϸ� �ֹ����� �Ʒ��� �� �޴��� ���� �޴� �̸� ���� ���� �հ� �ݾ��� �� bonepn�̶�� �̸��� ���� JPanel�迭 ����
	protected JLabel bonelb1[] = new JLabel[9];//ġŲ �޴� �̸��� ���� bonelb1�̶�� �̸��� ���� JLabel �迭 ����
	protected JLabel bonelb2[] = new JLabel[9];//ġŲ �޴��� ������ ���� bonelb2��� �̸��� ���� JLabel �迭 ����
	protected JTextField txt1[] = new JTextField[9];//+,-��ư�� ������ �� ������ ���� �� txt1�̶�� �̸��� ���� JTextField �迭 ����
	protected JTextField txt11[] = new JTextField[9];//+,-��ư�� ������ ���� �� ������ŭ ���Ž� ������ �հ踦 ���� �� txt11�̶�� JTextField�迭 ����
	protected JTextField sum = new JTextField("0 ��");
	protected JButton p1[] = new JButton[9];//+��ư�� ������ p1�̶�� �̸��� ���� JButton �迭 ����
	protected JButton m1[] = new JButton[9];//-��ư�� ������ m1�̶�� �̸��� ���� JButton �迭 ����
	protected int sumprice1[] = new int[9];//������ ���� �� ������ �հ踦 ������ �� sumprice1�̶�� �迭 ����
	protected int count1[] = new int[9];//+,-��ư�� ���� �� ������ ���̰� �÷��� count1�̶�� �迭 ����
	public ChickenClick() {
		ownpanel[11].add(sum);
		sum.setHorizontalAlignment(JButton.CENTER);
		sum.setFont(new Font("����", Font.BOLD, 20));
		sum.setBounds(240,0,240,40);
		for(int i=0;i<9;i++) {
			bonepn[i] = new JPanel();//�� bonepn�迭�� JPanel()�� ����
			bonelb1[i] = new JLabel(ChickenMenuName[i]);//�� bonelb1�迭�� ġŲ �޴� �̸��� ���� JLabel()����
			bonelb2[i] = new JLabel(ChickenMenuPrice[i] + "��");//�� bonelb2�迭�� ġŲ �޴� ������ ���� JLabel()����
			count1[i] = 0;//count1�迭�� ��� 0���� �ʱ�ȭ
			txt1[i] = new JTextField("0");//ó���� �ؽ�Ʈ�ʵ�� �� 0���� �ʱ�ȭ �ֳ��ϸ� ���� �޴� ������ +�ϱ� ���̱� ������
			txt11[i] = new JTextField(sumprice1[i] + "��");//�հ� �ݾ� ���� ���� �ƹ��� ���൵ �ϱ� ���̹Ƿ� 0���̴�.
			p1[i] = new JButton("+");//+��ư ����
			m1[i] = new JButton("-");//-��ư ����
			p1[i].setBackground(Color.BLACK);//+��ư�� ����� ���������� ���ڻ��� ������� ����
			p1[i].setForeground(Color.WHITE);
			m1[i].setBackground(Color.BLACK);//-��ư�� ����� ���������� ���ڻ��� ������� ����
			m1[i].setForeground(Color.WHITE);
			bonelb1[i].setHorizontalAlignment(JButton.CENTER);//���� �ؽ�Ʈ���� ����� ����
			bonelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt11[i].setHorizontalAlignment(JButton.CENTER);
			p1[i].setHorizontalAlignment(JButton.CENTER);
			m1[i].setHorizontalAlignment(JButton.CENTER);
			txt1[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bonechicken[i],bonepn[i],bonelb1[i],bonelb2[i],txt11[i],p1[i],m1[i],txt1[i]);//myaction�޼ҵ� ȣ��
		}
	}
	//�Ʒ��� myaction�޼ҵ�� �޴� �̹��� ��ư�� ������ �� �޴��� �̸� ���� ���� �հ� �ݾ��� �ֹ������� ������ �ϴ� �޼ҵ��̴�.
	public void myaction(JButton tbutton,JPanel tpanel,JLabel tlabel1,JLabel tlabel2,JTextField ttxt2,JButton tplus,JButton tminus,JTextField ttxt) {
		tbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(e.getSource() == tbutton) {
						tpanel.setLayout(null);
						tpanel.setBackground(Color.WHITE);
						tpanel.add(tlabel1);
						tpanel.add(tlabel2);
						tpanel.add(ttxt2);
						tpanel.add(tplus);
						tpanel.add(tminus);
						tpanel.add(ttxt);
						ownpanel[2].add(tpanel); 
						tlabel1.setBounds(0,0,116,30);
						tlabel2.setBounds(116,0,116,30);
						ttxt2.setBounds(360,0,120,30);
						tminus.setBounds(240,0,40,30);
						ttxt.setBounds(280,0,40,30);
						tplus.setBounds(320,0,40,30);
						tlabel1.setFont(new Font("����", Font.BOLD, 15));
						tlabel2.setFont(new Font("����", Font.BOLD, 15));
						tplus.setFont(new Font("����", Font.BOLD, 10));
						tminus.setFont(new Font("����", Font.BOLD, 10));
						ttxt.setFont(new Font("����", Font.BOLD, 15));
						ttxt2.setFont(new Font("����", Font.BOLD, 15));
						tpanel.setBounds(4,a,480,40);
						tpanel.setVisible(true);
						a += 40;
						tbutton.setEnabled(false);
					}
			} 
		});
	}
}