package mid_BigLab;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class minelb2 extends minelb1{
		protected String BonelessChickenName[] = {"����ĭ ����","����ŷ ����","�ʽ��� ����","���ø��� ����","�Ѹ�Ŭ ����","�Ҷ� ����","ġ�Ͽ� ����","Ŀ���� ����","���� ���̹ٺ�ť"};//����ġŲ �޴� �̸��� ������ BonelessChickenName�迭 ����
		protected int BonelessChickenPrice[] = {19900,19000,19900,19000,19000,19000,19000,19000,19000};//����ġŲ ������ ������ BonelessChickenPrice�迭 ����
		protected JLabel name2[] = new JLabel[BonelessChickenName.length];//���� ġŲ �޴� �̸��� ���� name2��� �̸��� ���� JLabel �迭 ����
		protected JLabel price2[] = new JLabel[BonelessChickenName.length];//���� ġŲ �޴� ������ ���� price2��� �̸��� ���� JLabel �迭 ����
		public minelb2() {
			for(int i=0;i<BonelessChickenName.length;i++) {//���� ġŲ �޴� ��ư�� Ŭ���ϸ� �� �̹�����ư �Ʒ��� ���� ġŲ �޴� �̸��� �� �޴��� ������ ǥ�����ִ� �󺧵��� �������ִ� �ݺ����̴�.
				name2[i] = new JLabel(BonelessChickenName[i]);
				price2[i] = new JLabel(BonelessChickenPrice[i] + "��");
			}
			name2[0].setBounds(60,130,170,20);name2[1].setBounds(270,130,170,20);name2[2].setBounds(480,130,170,20);//���� ġŲ �޴� �̸��� ������ ǥ�����ִ� �󺧵� ��ġ ����
			name2[3].setBounds(60,300,170,20);name2[4].setBounds(270,300,170,20);name2[5].setBounds(480,300,170,20);
			name2[6].setBounds(60,470,170,20);name2[7].setBounds(270,470,170,20);name2[8].setBounds(480,470,170,20);
			price2[0].setBounds(60,150,170,20);price2[1].setBounds(270,150,170,20);price2[2].setBounds(480,150,170,20);
			price2[3].setBounds(60,320,170,20);price2[4].setBounds(270,320,170,20);price2[5].setBounds(480,320,170,20);
			price2[6].setBounds(60,490,170,20);price2[7].setBounds(270,490,170,20);price2[8].setBounds(480,490,170,20);
			Lsetting1(name2,ownpanel[6]);Lsetting1(price2,ownpanel[6]);
		}
}