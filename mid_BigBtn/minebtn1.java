package mid_BigBtn;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ToolTipManager;
import javax.swing.border.LineBorder;

import mid_BigLab.minelb4;
public class minebtn1 extends minelb4{
	String btnname[] = {"��    ��","�� �� �� ��"};//������ �ֹ���Ҹ� ���� btnname�̶�� �迭 ����
	protected JButton btn[] = new JButton[btnname.length]; //������ �ֹ���Ҹ� ���� btn�̶�� �̸��� ���� JButton�迭 ����
	String mainmenu[] = {"ġ Ų","�� �� ġ Ų","�� �� �� �� ��","�� ��"};//ġŲ,����ġŲ,���̵�޴�,������ �ؽ�Ʈ�� ���� mainmenu�迭 ����
	protected JButton select[] = new JButton[mainmenu.length];//ġŲ,����ġŲ,���̵�޴�,���Ḧ ���� select��� �̸��� ���� JButton �迭 ����
	String imgpath1[] = {"src/image/����ĭ.png","src/image/����ŷ.png","src/image/�ʽ���.png","src/image/���ø��� ġŲ.png","src/image/�Ѹ�Ŭ.png","src/image/ġ�Ͽ�.png",
						"src/image/Ŀ����.png","src/image/�عٶ�� �Ķ��̵� ġŲ.png","src/image/���񷹿�.png"};//ġŲ�� �̹����ּҸ� ���� imgpath1�̶�� �迭 ����
	protected JButton bonechicken[] = new JButton[imgpath1.length];//ġŲ �̹��� ��ư�� ���� bonechicken�̶�� �̸��� ���� JButton �迭 ����
	String eatORpacking[] = {"���� �Ļ�","�� ��"};
	String takeout[] = {"src/image/���� �Ļ�.png","src/image/����.png"};
	protected JButton firstbtn[] = new JButton[eatORpacking.length];
	public minebtn1() {
		for(int i=0;i<2;i++) {//����Ļ�� Take Out ��ư�� ����
			firstbtn[i] = new JButton();
			firstbtn[i].setIcon(new ImageIcon(takeout[i]));
			firstbtn[i].setBackground(Color.WHITE);
			firstbtn[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			firstbtn[i].setFont(new Font("����", Font.BOLD, 20));
			ownpanel[12].add(firstbtn[i]);
		}
		firstbtn[0].setBounds(150, 400, 400, 300);firstbtn[1].setBounds(650, 400, 400, 300);
		for(int i=0;i<2;i++) {//����,�ֹ���� ��ư�� �����ϰ� ����� ������ ���ڻ��� ��� �׸��� �۲��� "����"ü ����ũ��� 20���� ������ �� �� �� ��ư���� ownpanel[3]�� �߰��ϴ� �ݺ����̴�.
			btn[i] = new JButton(btnname[i]);
			btn[i].setBackground(Color.BLACK);
			btn[i].setForeground(Color.WHITE);
			btn[i].setFont(new Font("����", Font.BOLD, 20));
			ownpanel[3].add(btn[i]);
		}
		btn[0].setBounds(240, 0, 240, 60);btn[1].setBounds(0, 0, 240, 60);//����,�ֹ���� ��ư ownpanel[3]������ ��ġ ����
		for(int i=0;i<4;i++) {//ġŲ,����ġŲ,���̵�޴�,���� ��ư��  �����ϰ� ����� ������ ���ڻ��� ������� ������ �� �� ownpanel[1]�� �߰��ؼ� ownpanel[1]������ �� ��ư ��ġ�����ϴ� �ݺ���
			select[i] = new JButton(mainmenu[i]);
			select[i].setBackground(Color.black);
			select[i].setForeground(Color.WHITE);
			ownpanel[1].add(select[i]);
			select[i].setBounds(30 + 170*i,130,140,30);
		}
		for(int i=0;i<9;i++) {//ġŲ �̹��� ��ư�� �����ϰ� ����� ������� ������ ���������� ������ ���� �Ŀ� panel[5]�� �߰��ϴ� �ݺ����̴�.
			bonechicken[i] = new JButton();
			bonechicken[i].setIcon(new ImageIcon(imgpath1[i]));
			bonechicken[i].setBackground(Color.WHITE);
			bonechicken[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[5].add(bonechicken[i]);
		}
		ToolTipManager m = ToolTipManager.sharedInstance();//ToolTipManager�� �����Ͽ� ��ư�� �÷������� �ٷ� ���� ������ ��µǰ� 10�ʵ��� ���ӵǵ��� ������ ���Ҵ�.
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		bonechicken[0].setToolTipText("[���] : �߰��, ��, ���� ����, ����, ĳ����, �ǽ���, �а���, ����");
		bonechicken[1].setToolTipText("[���] : �߰��, ��, ����, ��, ����, ������, �а���, ����");
		bonechicken[2].setToolTipText("[���] : �߰��, û��, ����޸�����, ���尡��, ����, ������, �а���, ����, ����, �丶�� �ɫ�, ������, ����");
		bonechicken[3].setToolTipText("[���] : �߰��, ������ �ø��� ����, �߻�� ����, Ʈ���� ����(�۷ι���), ������, ����, �а���, ����");
		bonechicken[4].setToolTipText("[���] : �߰��, ġ��� �����, �Ľ��� ����, ũ��ġ��, ���Ʈ, ��ϸӽ��͵�, ��ũ��, ������, �а���, ����");
		bonechicken[5].setToolTipText("[���] : �߰��, �����ҽ�, �����, ����Ƣ��, ����, û��, ����, �а���, ����");
		bonechicken[6].setToolTipText("[���] : �߰��, ����Ŀ�� �����, �丶�� ���̽� Ŀ���� �ҽ�, ����, �а���, ����");
		bonechicken[7].setToolTipText("[���] : �߰��, �а���, ����, �ø�����, ����");
		bonechicken[8].setToolTipText("[���] : �߰��, �а���, ����, ���尡��, �հ���ҽ�, ����, ����, ĥ�������");
		bonechicken[0].setBounds(60, 30, 170, 100);bonechicken[1].setBounds(270, 30, 170, 100);bonechicken[2].setBounds(480, 30, 170, 100);
		bonechicken[3].setBounds(60, 200, 170, 100);bonechicken[4].setBounds(270, 200, 170, 100);bonechicken[5].setBounds(480, 200, 170, 100);
		bonechicken[6].setBounds(60, 370, 170, 100);bonechicken[7].setBounds(270, 370, 170, 100);bonechicken[8].setBounds(480, 370, 170, 100);
		//ġŲ �̹��� ��ư���� ��ġ�� ����
	}
}