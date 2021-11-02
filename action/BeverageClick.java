package action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
public class BeverageClick extends SideClick{
	protected JPanel beveragepn[] = new JPanel[9];//�޴� �̹��� ��ư�� Ŭ���ϸ� �ֹ����� �Ʒ��� �� �޴��� ���� �޴� �̸� ���� ���� �հ� �ݾ��� �� beveragepn�̶�� �̸��� ���� JPanel�迭 ����
	protected JLabel beveragelb1[] = new JLabel[9];//���� �̸��� ���� beveragelb1�̶�� �̸��� ���� JLabel �迭 ����
	protected JLabel beveragelb2[] = new JLabel[9];//���� ������ ���� beveragelb2�̶�� �̸��� ���� JLabel �迭 ����
	protected JTextField txt4[] = new JTextField[9];//+,-��ư�� ������ �� ������ ���� �� txt4�̶�� �̸��� ���� JTextField �迭 ����
	protected JTextField txt44[] = new JTextField[9];//+,-��ư�� ������ ���� �� ������ŭ ���Ž� ������ �հ踦 ���� �� txt44�̶�� JTextField�迭 ����
	protected JButton p4[] = new JButton[9];//+��ư�� ������ p3�̶�� �̸��� ���� JButton �迭 ����
	protected JButton m4[] = new JButton[9];//-��ư�� ������ m3�̶�� �̸��� ���� JButton �迭 ����
	public int sumprice4[] = new int[9];//������ ���� �� ������ �հ踦 ������ �� sumprice4�̶�� �迭 ����
	public int count4[] = new int[9];//+,-��ư�� ���� �� ������ ���̰� �÷��� count4�̶�� �迭 ����
	public BeverageClick() {
		for(int i=0;i<9;i++) {
			beveragepn[i] = new JPanel();//�� beveragepn�迭�� JPanel()�� ����
			beveragelb1[i] = new JLabel(BeverageMenuName[i]);//�� beveragelb1�迭�� ġŲ �޴� �̸��� ���� JLabel()����
			beveragelb2[i] = new JLabel(Beveragemenuprice4[i] + "��");//�� beveragelb2�迭�� ġŲ �޴� ������ ���� JLabel()����
			txt4[i] = new JTextField("0");//ó���� �ؽ�Ʈ�ʵ�� �� 0���� �ʱ�ȭ �ֳ��ϸ� ���� �޴� ������ +�ϱ� ���̱� ������
			txt44[i] = new JTextField(sumprice4[i] + "��");//�հ� �ݾ� ���� ���� �ƹ��� ���൵ �ϱ� ���̹Ƿ� 0���̴�.
			count4[i] = 0;//count4 �迭�� ��� 0���� �ʱ�ȭ
			p4[i] = new JButton("+");//+��ư ����
			m4[i] = new JButton("-");//-��ư ����
			p4[i].setBackground(Color.BLACK);//+��ư�� ����� ���������� ���ڻ��� ������� ����
			p4[i].setForeground(Color.WHITE);
			m4[i].setBackground(Color.BLACK);//-��ư�� ����� ���������� ���ڻ��� ������� ����
			m4[i].setForeground(Color.WHITE);
			beveragelb1[i].setHorizontalAlignment(JButton.CENTER);//�� �� �� ��ư,�ؽ�Ʈ �ʵ��� �ؽ�Ʈ���� ����� ����
			beveragelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt44[i].setHorizontalAlignment(JButton.CENTER);
			p4[i].setHorizontalAlignment(JButton.CENTER);
			m4[i].setHorizontalAlignment(JButton.CENTER);
			txt4[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bside[i],beveragepn[i],beveragelb1[i],beveragelb2[i],txt44[i],p4[i],m4[i],txt4[i]);//myaction�޼ҵ� ȣ��
		}
	}
}
