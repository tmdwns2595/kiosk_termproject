package mid_Display;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mid_Begin.Beginning;
public class minedisplay extends Beginning{//displayŬ������ ��ӹ��� panelsŬ���� ����
	protected static JPanel ownpanel[] = new JPanel[13]; //JPanel�� �迭�� ������ �ߴ�.
	public minedisplay() {//panels ������
		for(int i=0;i<13;i++) {
			ownpanel[i] = new JPanel();//�� �г� �迭���� �г��� �������ش�.
		}
		
		c.add(ownpanel[0]);//�θ�Ŭ�������� ������ Container c ������Ʈ�� panel[0]�� �߰�.
		ownpanel[0].setBounds(0, 0, 1224, 800);
		ownpanel[0].setLayout(null);
		ownpanel[0].setBackground(Color.WHITE);
		ownpanel[0].setBorder(new LineBorder(new Color(0, 0, 0), 4));
		
		ownpanel[1].setBounds(10,10,700,180);ownpanel[2].setBounds(720, 92, 480, 380);ownpanel[3].setBounds(720,690,480,60);//�� �гε��� ��ġ�� �������ִ� �κ�
		ownpanel[4].setBounds(720,520,480,160);ownpanel[5].setBounds(10, 200, 700, 550);ownpanel[6].setBounds(10, 200, 700, 550);
		ownpanel[7].setBounds(10, 200, 700, 550);ownpanel[8].setBounds(10, 200, 700, 550);ownpanel[9].setBounds(720, 10, 480, 42);
		ownpanel[10].setBounds(720, 52, 480, 40);ownpanel[11].setBounds(720,475,480,40);ownpanel[12].setBounds(10,10,1190,740);
		
		for(int i = 1;i<12;i++)
			ownpanel[i].setVisible(false);
		ownpanel[12].setVisible(true);
		Psetting(ownpanel);
	}
	public static JPanel Visible(JPanel[] panels) {//�гε��� setVisible�� �������ִ� �޼ҵ�
		for(int i=0;i<6;i++) {
			panels[i].setVisible(true);
		}
		panels[6].setVisible(false);panels[7].setVisible(false);panels[8].setVisible(false);
		panels[9].setVisible(true);panels[10].setVisible(true);panels[11].setVisible(true);
		return null;
	}
	public JPanel Psetting(JPanel[] pan) {//�гε��� ���̾ƿ��� ����,�������� �������ִ� �޼ҵ�
		for(int i=1;i<13;i++) {
			pan[0].add(pan[i]);//�θ�Ŭ�������� ������ Container c ������Ʈ�� panel1�� �߰�.
			pan[i].setLayout(null);//��ü���� ��ġ�� �����ϱ� ���ؼ� setLayout()�� �Ű������� null���� ����.
			pan[i].setBackground(Color.WHITE);//�� �гε��� ����� ������� ����
			pan[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));//�� �гε鿡 �������� �߰�
		}
		return null;
	}
}