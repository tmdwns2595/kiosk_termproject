package mid_BigLab;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mid_Display.minedisplay;
public class minelb1 extends minedisplay{//ġŲ �޴� �̸�,���� �׸��� �ֹ��ȳ�,�ֹ�����,����Ļ�,takeout ���������� ��ٱ��Ͽ� �� ��ǰ��,����,����,�հ� �ݾ��� ��Ÿ�� ���� �����ϴ� Ŭ�����̴�.
	protected String ChickenMenuName[] = {"����ĭ","����ŷ","�ʽ���","���ø���","�Ѹ�Ŭ","ġ�Ͽ�","Ŀ����","�Ķ��̵�","���񷹿�"};
	protected int ChickenMenuPrice[] = {18000,17000,18000,17000,17000,18000,17000,15000,18000};
	protected JLabel name1[] = new JLabel[ChickenMenuName.length];
	protected JLabel price1[] = new JLabel[ChickenMenuName.length];
	protected JLabel logo1 = new JLabel();
	protected JLabel logo2 = new JLabel();
	protected JLabel OrderHistory = new JLabel("�� �� �� ��");
	protected JLabel OrderGuide = new JLabel("�� �� �� ��");
	protected JLabel OrderGuideline = new JLabel("<html>�ֹ� ������ �ִ� ��ǰ���� �����ϱ� ������ �����ø� ���� �ϴܿ� �ֹ� ��� ��ư�� Ŭ��! </br>�ֹ� ������ �ִ� ��ǰ�� �����ϱ� ���Ͻø� ������ �ϴܿ� �ִ� ���� ��ư�� Ŭ���Ͽ� </br>���� ������ ����!");
	//�ֹ��ȳ��� ������ ������ؼ� OrderGuideline��� �̸��� ���� JLabel�� ������ �Ͽ��� <html>�� �̿��Ͽ� </br>�� ����� �ٹٲ��� ���־���.
	protected JLabel TotalAmount = new JLabel("�� �ֹ� �ݾ�");
	protected JLabel tk1 = new JLabel("�� �� �� �� �� ��");
	protected JLabel tk2 = new JLabel("Take Out");
	protected JLabel advertising = new JLabel();
	protected String buys[] = {"�� ǰ ��", "�� ��","�� ��","�� ��"};
	protected JLabel account[] = new JLabel[buys.length];
	protected JLabel slideshow = new JLabel();
	protected JLabel selloc = new JLabel("<html><br><pre>	�Ļ��Ͻ� ��Ҹ� ������ �ּ���.</pre></br>(TakeOut ��  �� �ֹ� �ݾ��� 10%�� �����ص帳�ϴ�.)");
	protected JLabel TD = new JLabel("���� �ð���");
	public minelb1() {//ġŲ �޴� �̸�,���� �׸��� �ֹ��ȳ�,�ֹ�����,����Ļ�,takeout ���������� ��ٱ��Ͽ� �� ��ǰ��,����,����,�հ� �ݾ��� ��Ÿ�� ���� �����ϴ� �������̴�.
		selloc.setFont(new Font("����", Font.BOLD, 30));//ó�� ����� ������ ȭ�鿡 �Ļ� ��� ���θ� ����� ��.
		selloc.setHorizontalAlignment(JLabel.CENTER);
		selloc.setBackground(Color.WHITE);
		selloc.setOpaque(true);
		ownpanel[12].add(selloc);
		selloc.setBounds(150,200,900,130);
		
		TD.setFont(new Font("����", Font.BOLD, 15));//���� �ð��� ��Ÿ���� ��
		TD.setHorizontalAlignment(JLabel.CENTER);
		TD.setBackground(Color.WHITE);
		TD.setOpaque(true);
		ownpanel[12].add(TD);
		TD.setBounds(10,10,390,30);
		
		slideshow.setHorizontalAlignment(JLabel.CENTER);//�������� ��Ÿ�� ��
		slideshow.setBackground(Color.WHITE);
		slideshow.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		slideshow.setOpaque(true);
		ownpanel[12].add(slideshow);
		slideshow.setBounds(788,0,400,200);
		
		tk1.setHorizontalAlignment(JLabel.CENTER);//���忡�� �Ļ縦 ��Ÿ�� �� ��
		tk1.setFont(new Font("����", Font.BOLD, 40));
		tk1.setOpaque(true); 
		tk1.setBackground(Color.BLACK);
		tk1.setForeground(Color.WHITE);
		ownpanel[12].add(tk1);
		tk1.setBounds(150, 350, 400, 50);

		tk2.setHorizontalAlignment(JLabel.CENTER);//Take Out�� ��Ÿ�� �� ��
		tk2.setFont(new Font("����", Font.BOLD, 40));
		tk2.setOpaque(true); 
		tk2.setBackground(Color.BLACK);
		tk2.setForeground(Color.WHITE);
		ownpanel[12].add(tk2);
		tk2.setBounds(650, 350, 400, 50);
		
		logo2.setIcon(new ImageIcon("src/image/logo.png"));//ó�� ������ �� ȸ�� �ΰ� ��Ÿ�� �� �̹��� ��
		ownpanel[12].add(logo2);
		logo2.setBounds(530, 10, 170, 90);
		
		logo1.setIcon(new ImageIcon("src/image/logo.png"));//�Ļ� ���� ���� �� �޴� ���� �г��� ���� �� ȸ�� �ΰ� ��Ÿ�� �� �̹��� ��
		ownpanel[1].add(logo1);
		logo1.setBounds(259, 10, 170, 90);
		
		
		OrderHistory.setHorizontalAlignment(JLabel.CENTER);//�ֹ� ������ ��Ÿ�� ��
		OrderHistory.setFont(new Font("����", Font.BOLD, 20));
		OrderHistory.setOpaque(true); 
		OrderHistory.setBackground(Color.BLACK);
		OrderHistory.setForeground(Color.WHITE);
		ownpanel[9].add(OrderHistory);
		OrderHistory.setBounds(0, 0, 480, 42);
		
		OrderGuide.setHorizontalAlignment(JLabel.CENTER);//�ֹ� �ȳ��� ��Ÿ���� ��
		OrderGuide.setFont(new Font("����", Font.BOLD, 20));
		OrderGuide.setOpaque(true); 
		OrderGuide.setBackground(Color.BLACK);
		OrderGuide.setForeground(Color.WHITE);
		ownpanel[4].add(OrderGuide);
		OrderGuide.setBounds(0, 0, 480, 42);
		
		OrderGuideline.setHorizontalAlignment(JLabel.CENTER);//�ֹ� �ȳ����� ��Ÿ�� �� ��
		OrderGuideline.setFont(new Font("����", Font.BOLD, 17));
		OrderGuideline.setOpaque(true); 
		OrderGuideline.setBackground(Color.WHITE);
		OrderGuideline.setForeground(Color.BLACK);
		ownpanel[4].add(OrderGuideline);
		OrderGuideline.setBounds(5, 60, 470, 80);
		
		TotalAmount.setHorizontalAlignment(JLabel.CENTER);//�� �ֹ� �ݾ��� ��Ÿ�� �� ��
		TotalAmount.setFont(new Font("����", Font.BOLD, 17));
		TotalAmount.setOpaque(true); 
		TotalAmount.setBackground(Color.BLACK);
		TotalAmount.setForeground(Color.WHITE);
		ownpanel[11].add(TotalAmount);
		TotalAmount.setBounds(0, 0, 240, 40);
		
		
		for(int i=0;i<buys.length;i++) {//�ֹ������� ��ǰ��,��ǰ����,����,�հ�ݾ��� ǥ������ ���� �����ϴ� �ݺ����̴�.
			account[i] = new JLabel(buys[i]);
			account[i].setHorizontalAlignment(JLabel.CENTER);
			account[i].setFont(new Font("����", Font.BOLD, 15));
			account[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[10].add(account[i]);
			account[i].setBounds(0 + i*120,0,120,40);
		}
		for(int i=0;i<ChickenMenuName.length;i++) {//ġŲ �޴� ��ư�� Ŭ���ϸ� �� �̹�����ư �Ʒ��� ġŲ �޴� �̸��� �� �޴��� ������ ǥ�����ִ� �󺧵��� �������ִ� �ݺ����̴�.
			name1[i] = new JLabel(ChickenMenuName[i]);
			price1[i] = new JLabel(ChickenMenuPrice[i] + "��");
		}
		name1[0].setBounds(60,130,170,20);name1[1].setBounds(270,130,170,20);name1[2].setBounds(480,130,170,20);//ġŲ �޴� �̸��� ���� ��ġ ����
		name1[3].setBounds(60,300,170,20);name1[4].setBounds(270,300,170,20);name1[5].setBounds(480,300,170,20);
		name1[6].setBounds(60,470,170,20);name1[7].setBounds(270,470,170,20);name1[8].setBounds(480,470,170,20);
		price1[0].setBounds(60,150,170,20);price1[1].setBounds(270,150,170,20);price1[2].setBounds(480,150,170,20);
		price1[3].setBounds(60,320,170,20);price1[4].setBounds(270,320,170,20);price1[5].setBounds(480,320,170,20);
		price1[6].setBounds(60,490,170,20);price1[7].setBounds(270,490,170,20);price1[8].setBounds(480,490,170,20);
		Lsetting1(name1,ownpanel[5]);//Lsetting �޼ҵ� ����
		Lsetting1(price1,ownpanel[5]);//Lsetting �޼ҵ� ����
	}
		
	public void Lsetting1(JLabel[] lab,JPanel p) {//�� �迭�� ���ڷ� �޾Ƽ� �� �󺧵��� �ؽ�Ʈ�� �߰��� ���� �����ϰ� �۲��� "����"ü�� ũ��� 15�� ������ �� panel[5]�� �߰��ϴ� �޼ҵ��̴�
		for(int i=0;i<9;i++) {
			p.add(lab[i]);
			lab[i].setHorizontalAlignment(JLabel.CENTER);
			lab[i].setFont(new Font("����", Font.BOLD, 15));
		}
		return;
	}
}