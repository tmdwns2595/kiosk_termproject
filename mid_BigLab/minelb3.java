package mid_BigLab;
import java.awt.Font;
import javax.swing.JLabel;
public class minelb3 extends minelb2{
	protected String SideMenuName[] = {"���� �ٻ�ġ�","���� �Ҷ�","�Ѹ� ����","�Ѹ� �Ҷ�","�Ѹ� ġ�","�Ѹ� ġ�ƽ","�Ѹ� �ֵ���","������ ������","�Ѹ� ������"};//���̵� �޴� �̸��� ������ SideMenuName�迭 ����
	protected int SideMenuPrice[] = {5000,3000,4000,3000,5500,4000,5000,3000,13000};//���̵� �޴� ������ ������ SideMenuPrice �迭 ����
	protected JLabel name3[] = new JLabel[SideMenuName.length];//���̵� �޴� �̸��� ���� name3��� �̸��� ���� JLabel �迭 ����
	protected JLabel price3[] = new JLabel[SideMenuName.length];//���̵� �޴� ������ ���� price3��� �̸��� ���� JLabel �迭 ����
	public minelb3() {
		for(int i=0;i<SideMenuName.length;i++) {//���̵� �޴� ��ư�� Ŭ���ϸ� �� �̹�����ư �Ʒ��� ���̵� �޴� �̸��� �� �޴��� ������ ǥ�����ִ� �󺧵��� �������ִ� �ݺ����̴�.
			name3[i] = new JLabel(SideMenuName[i]);
			price3[i] = new JLabel(SideMenuPrice[i] + "��");
		}
		name3[0].setBounds(60,130,170,20);name3[1].setBounds(270,130,170,20);name3[2].setBounds(480,130,170,20);//���̵� �޴� �̸��� ������ ǥ�����ִ� �󺧵� ��ġ ����
		name3[3].setBounds(60,300,170,20);name3[4].setBounds(270,300,170,20);name3[5].setBounds(480,300,170,20);
		name3[6].setBounds(60,470,170,20);name3[7].setBounds(270,470,170,20);name3[8].setBounds(480,470,170,20);
		price3[0].setBounds(60,150,170,20);price3[1].setBounds(270,150,170,20);price3[2].setBounds(480,150,170,20);
		price3[3].setBounds(60,320,170,20);price3[4].setBounds(270,320,170,20);price3[5].setBounds(480,320,170,20);
		price3[6].setBounds(60,490,170,20);price3[7].setBounds(270,490,170,20);price3[8].setBounds(480,490,170,20);
		Lsetting1(name3,ownpanel[7]);Lsetting1(price3,ownpanel[7]);
	}
}