package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn4 extends minebtn3{
	String imgpath4[] = {"src/image/ĥ�����̴�.jpg","src/image/��������Ʈ.jpg","src/image/��ī�ݶ�.jpg","src/image/����ݶ�.jpg","src/image/ȯŸ.jpg","src/image/������.jpg",
						 "src/image/���̽�.jpg","src/image/��������.png","src/image/����.jpg"};//���� ������ �̹��� ��θ� ���� imgpath4��� �迭 ����
	protected JButton bside[] = new JButton[imgpath4.length];//���� �̹��� ��ư�� ���� bside��� �̸��� ���� JButton �迭 ����
	public minebtn4() {
		for(int i=0;i<9;i++) {//���� �̹��� ��ư�� �����ϰ� ����� ���,���������� ���� �� ownpanel[8]�� �߰��ϴ� �ݺ���
			bside[i] = new JButton();
			bside[i].setIcon(new ImageIcon(imgpath4[i]));
			bside[i].setBackground(Color.WHITE);
			bside[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[8].add(bside[i]);
		}
		bside[0].setBounds(60, 30, 170, 100);bside[1].setBounds(270, 30, 170, 100);bside[2].setBounds(480, 30, 170, 100);
		bside[3].setBounds(60, 200, 170, 100);bside[4].setBounds(270, 200, 170, 100);bside[5].setBounds(480, 200, 170, 100);
		bside[6].setBounds(60, 370, 170, 100);bside[7].setBounds(270, 370, 170, 100);bside[8].setBounds(480, 370, 170, 100);
	}
}