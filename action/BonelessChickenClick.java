package action;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class BonelessChickenClick extends ChickenClick{
	protected JPanel bonelesspn[] = new JPanel[9];//�޴� �̹��� ��ư�� Ŭ���ϸ� �ֹ����� �Ʒ��� �� �޴��� ���� �޴� �̸� ���� ���� �հ� �ݾ��� �� bonelesspn�̶�� �̸��� ���� JPanel�迭 ����
	protected JLabel bonelesslb1[] = new JLabel[9];//���� ġŲ �޴� �̸��� ���� bonelesslb1�̶�� �̸��� ���� JLabel �迭 ����
	protected JLabel bonelesslb2[] = new JLabel[9];//���� ġŲ �޴��� ������ ���� bonelesslb2��� �̸��� ���� JLabel �迭 ����
	protected JTextField txt2[] = new JTextField[9];//+,-��ư�� ������ �� ������ ���� �� txt2�̶�� �̸��� ���� JTextField �迭 ����
	protected JTextField txt22[] = new JTextField[9];//+,-��ư�� ������ ���� �� ������ŭ ���Ž� ������ �հ踦 ���� �� txt22�̶�� JTextField�迭 ����
	protected JButton p2[] = new JButton[9];//+��ư�� ������ p2�̶�� �̸��� ���� JButton �迭 ����
	protected JButton m2[] = new JButton[9];//-��ư�� ������ m2�̶�� �̸��� ���� JButton �迭 ����
	public int sumprice2[] = new int[9];//������ ���� �� ������ �հ踦 ������ �� sumprice2�̶�� �迭 ����
	public int count2[] = new int[9];//+,-��ư�� ���� �� ������ ���̰� �÷��� count2�̶�� �迭 ����
	public BonelessChickenClick() {
		for(int i=0;i<9;i++) {
			bonelesspn[i] = new JPanel();//�� bonelesspn�迭�� JPanel()�� ����
			bonelesslb1[i] = new JLabel(BonelessChickenName[i]);//�� bonelesslb1�迭�� ġŲ �޴� �̸��� ���� JLabel()����
			bonelesslb2[i] = new JLabel(BonelessChickenPrice[i] + "��");//�� bonelesslb2�迭�� ġŲ �޴� ������ ���� JLabel()����
			txt2[i] = new JTextField("0");//ó���� �ؽ�Ʈ�ʵ�� �� 0���� �ʱ�ȭ �ֳ��ϸ� ���� �޴� ������ +�ϱ� ���̱� ������
			txt22[i] = new JTextField(sumprice2[i] + "��");//�հ� �ݾ� ���� ���� �ƹ��� ���൵ �ϱ� ���̹Ƿ� 0���̴�.
			count2[i] = 0;//count2�迭�� ��� 0���� �ʱ�ȭ
			p2[i] = new JButton("+");//+��ư ����
			m2[i] = new JButton("-");//-��ư ����
			p2[i].setBackground(Color.BLACK);//+��ư�� ����� ������ ���ڻ��� ������� ����
			p2[i].setForeground(Color.WHITE);
			m2[i].setBackground(Color.BLACK);//-��ư�� ����� ������ ���ڻ��� ������� ����
			m2[i].setForeground(Color.WHITE);
			bonelesslb1[i].setHorizontalAlignment(JButton.CENTER);//�� �� �� ��ư,�ؽ�Ʈ �ʵ��� �ؽ�Ʈ���� ����� ����
			bonelesslb2[i].setHorizontalAlignment(JButton.CENTER);
			txt22[i].setHorizontalAlignment(JButton.CENTER);
			p2[i].setHorizontalAlignment(JButton.CENTER);
			m2[i].setHorizontalAlignment(JButton.CENTER);
			txt2[i].setHorizontalAlignment(JButton.CENTER);
			myaction(bonelesschicken[i],bonelesspn[i],bonelesslb1[i],bonelesslb2[i],txt22[i],p2[i],m2[i],txt2[i]);//myaction�޼ҵ� ȣ��
		}
	}
}
