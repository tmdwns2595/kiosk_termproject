package mid_BigLab;
import java.awt.Font;
import javax.swing.JLabel;
public class minelb4 extends minelb3{
	protected String BeverageMenuName[] = {"ĥ�� ���̴�","��������Ʈ","��ī �ݶ�","��� �ݶ�","ȯŸ","������","���̽�","���� ����","����"};//���� �̸��� ������ menu3�迭 ����
	protected int Beveragemenuprice4[] = {2000,2000,2000,2000,2000,4000,5000,5000,5000};//������ ������ ������ Beveragemenuprice4 �迭 ����
	protected JLabel name4[] = new JLabel[BeverageMenuName.length];//���� �̸��� ���� name4��� �̸��� ���� JLabel �迭 ����
	protected JLabel price4[] = new JLabel[BeverageMenuName.length];//���� ������ ���� price4��� �̸��� ���� JLabel �迭 ����
	public minelb4() {
		for(int i=0;i<BeverageMenuName.length;i++) {//���� �޴� ��ư�� Ŭ���ϸ� �� �̹�����ư �Ʒ��� ���� �޴� �̸��� �� �޴��� ������ ǥ�����ִ� �󺧵��� �������ִ� �ݺ����̴�.
			name4[i] = new JLabel(BeverageMenuName[i]);
			price4[i] = new JLabel(Beveragemenuprice4[i] + "��");
		}
		name4[0].setBounds(60,130,170,20);name4[1].setBounds(270,130,170,20);name4[2].setBounds(480,130,170,20);//���� �޴� �̸��� ������ ǥ������ ���� ��ġ ����
		name4[3].setBounds(60,300,170,20);name4[4].setBounds(270,300,170,20);name4[5].setBounds(480,300,170,20);
		name4[6].setBounds(60,470,170,20);name4[7].setBounds(270,470,170,20);name4[8].setBounds(480,470,170,20);
		price4[0].setBounds(60,150,170,20);price4[1].setBounds(270,150,170,20);price4[2].setBounds(480,150,170,20);
		price4[3].setBounds(60,320,170,20);price4[4].setBounds(270,320,170,20);price4[5].setBounds(480,320,170,20);
		price4[6].setBounds(60,490,170,20);price4[7].setBounds(270,490,170,20);price4[8].setBounds(480,490,170,20);
		Lsetting1(name4,ownpanel[8]);Lsetting1(price4,ownpanel[8]);
	}
}