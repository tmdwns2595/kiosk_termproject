package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn3 extends minebtn2{
	String imgpath3[] = {"src/image/���޹ٻ�ġ�.png","src/image/�����Ҷ�.png","src/image/�Ѹ�����.png","src/image/�Ѹ��Ҷ�.png","src/image/�Ѹ�ġ�.png","src/image/�Ѹ�ġ�ƽ.png",
						 "src/image/�Ѹ��ֵ���.png","src/image/������������.png","src/image/�Ѹ�������.png"};//���̵� �޴� �̹����� ��θ� ���� imgpath3��� �迭 ����
	protected JButton side[] = new JButton[imgpath3.length];//���̵� �޴� �̹��� ��ư�� ���� side��� �̸��� ���� JButton �迭 ����
	public minebtn3() {
		for(int i=0;i<9;i++) {//���̵� �޴� �̹��� ��ư�� �����ϰ� ����� ���,���������� ���� �� ownpanel[7]�� �߰��ϴ� �ݺ���
			side[i] = new JButton();
			side[i].setIcon(new ImageIcon(imgpath3[i]));
			side[i].setBackground(Color.WHITE);
			side[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[7].add(side[i]);
		}
		side[0].setBounds(60, 30, 170, 100);side[1].setBounds(270, 30, 170, 100);side[2].setBounds(480, 30, 170, 100);
		side[3].setBounds(60, 200, 170, 100);side[4].setBounds(270, 200, 170, 100);side[5].setBounds(480, 200, 170, 100);
		side[6].setBounds(60, 370, 170, 100);side[7].setBounds(270, 370, 170, 100);side[8].setBounds(480, 370, 170, 100);
		//���̵� �޴� �̹��� ��ư�� ��ġ�� ����
		side[0].setToolTipText("[���] : ���, ���ҵ���������, ��¥���� ġ��");
		side[1].setToolTipText("[���] : ��, �Ҽ���, �Ľ��� ����, ����, ������, �ɫ�, ����, �ּҽ�");
		side[2].setToolTipText("[���] : ����, ���а���, �Ľ��� ����, ġ������ ����");
		side[3].setToolTipText("[���] : ��, �Ҽ���, �Ľ��� ����, ����, ġ������ ����");
		side[4].setToolTipText("[���] : ���, ���ҵ���������, ��¥���� ġ��, �Ľ��� ����, ġ������ ����");
		side[5].setToolTipText("[���] : ���, �а���, �Ľ��� ����, ������, ��¥���� ġ��,");
		side[6].setToolTipText("[���] : ��, ������, ġ������ ����, �Ľ��� ����");
		side[7].setToolTipText("[���] : ����, ���а���, �عٶ����");
		side[8].setToolTipText("[���] : �߰��, ġ��� �����, �Ľ��� ����, ũ��ġ��, ���Ʈ, ��ϸӽ��͵�, ��ũ��, ������, �а���, ����");
	}
}