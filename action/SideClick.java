package action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
public class SideClick extends BonelessChickenClick{
	protected JPanel sidepn[] = new JPanel[9];//�޴� �̹��� ��ư�� Ŭ���ϸ� �ֹ����� �Ʒ��� �� �޴��� ���� �޴� �̸� ���� ���� �հ� �ݾ��� �� sidepn�̶�� �̸��� ���� JPanel�迭 ����
	protected JLabel sidelb1[] = new JLabel[9];//���̵� �޴� �̸��� ���� sidelb1�̶�� �̸��� ���� JLabel �迭 ����
	protected JLabel sidelb2[] = new JLabel[9];//���̵� �޴��� ������ ���� sidelb2��� �̸��� ���� JLabel �迭 ����
	protected JTextField txt3[] = new JTextField[9];//+,-��ư�� ������ �� ������ ���� �� txt3�̶�� �̸��� ���� JTextField �迭 ����
	protected JTextField txt33[] = new JTextField[9];//+,-��ư�� ������ ���� �� ������ŭ ���Ž� ������ �հ踦 ���� �� txt33�̶�� JTextField�迭 ����
	protected JButton p3[] = new JButton[9];//+��ư�� ������ p3�̶�� �̸��� ���� JButton �迭 ����
	protected JButton m3[] = new JButton[9];//-��ư�� ������ m3�̶�� �̸��� ���� JButton �迭 ����
	public int sumprice3[] = new int[9];//������ ���� �� ������ �հ踦 ������ �� sumprice3�̶�� �迭 ����
	public int count3[] = new int[9];//+,-��ư�� ���� �� ������ ���̰� �÷��� count3�̶�� �迭 ����
	public SideClick() {
		for(int i=0;i<9;i++) {
			sidepn[i] = new JPanel();//�� sidepn�迭�� JPanel()�� ����
			sidelb1[i] = new JLabel(SideMenuName[i]);//�� sidelb1�迭�� ġŲ �޴� �̸��� ���� JLabel()����
			sidelb2[i] = new JLabel(SideMenuPrice[i] + "��");//�� sidelb2�迭�� ġŲ �޴� ������ ���� JLabel()����
			txt3[i] = new JTextField("0");//ó���� �ؽ�Ʈ�ʵ�� �� 0���� �ʱ�ȭ �ֳ��ϸ� ���� �޴� ������ +�ϱ� ���̱� ������
			txt33[i] = new JTextField(sumprice3[i] + "��");//�հ� �ݾ� ���� ���� �ƹ��� ���൵ �ϱ� ���̹Ƿ� 0���̴�.
			count3[i] = 0;//count3 �迭�� ��� 0���� �ʱ�ȭ
			p3[i] = new JButton("+");//+��ư ����
			m3[i] = new JButton("-");//-��ư ����
			p3[i].setBackground(Color.BLACK);//+��ư�� ����� ������ ���ڻ��� ������� ����
			p3[i].setForeground(Color.WHITE);
			m3[i].setBackground(Color.BLACK);//-��ư�� ����� ������ ���ڻ��� ������� ����
			m3[i].setForeground(Color.WHITE);
			sidelb1[i].setHorizontalAlignment(JButton.CENTER);//�� �� �� ��ư,�ؽ�Ʈ �ʵ��� �ؽ�Ʈ���� ����� ����
			sidelb2[i].setHorizontalAlignment(JButton.CENTER);
			txt33[i].setHorizontalAlignment(JButton.CENTER);
			p3[i].setHorizontalAlignment(JButton.CENTER);
			m3[i].setHorizontalAlignment(JButton.CENTER);
			txt3[i].setHorizontalAlignment(JButton.CENTER);
			myaction(side[i],sidepn[i],sidelb1[i],sidelb2[i],txt33[i],p3[i],m3[i],txt3[i]);//myaction�޼ҵ� ȣ��
		}
	}
}
