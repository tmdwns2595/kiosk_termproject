package mid_BigBtn;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
public class minebtn2 extends minebtn1{
	String imgpath2[] = {"src/image/����ĭ����.png","src/image/����ŷ����.png","src/image/�ʽ��ͼ���.png","src/image/���ø������.png","src/image/�Ѹ�Ŭ����.png",
						 "src/image/�Ҷ�����.png","src/image/ġ�Ͽ�����.png","src/image/Ŀ��������.png","src/image/�عٶ���Ķ��̵����.png"};//����ġŲ �̹��� ��θ� ���� imgpath2��� �迭 ����
	protected JButton bonelesschicken[] = new JButton[imgpath2.length];//����ġŲ �̹�����ư�� ���� bonelesschicken�̶�� �̸��� ���� JButton�迭 ����
	public minebtn2() {
		for(int i=0;i<9;i++) {//���� ġŲ �̹��� ��ư�� ������ �� ����� ���,���������� ���� �� ownpanel[6]�� �߰��ϴ� �ݺ����̴�.
			bonelesschicken[i] = new JButton();
			bonelesschicken[i].setIcon(new ImageIcon(imgpath2[i]));
			bonelesschicken[i].setBackground(Color.WHITE);
			bonelesschicken[i].setBorder(new LineBorder(new Color(0, 0, 0), 4));
			ownpanel[6].add(bonelesschicken[i]);
		}
		bonelesschicken[0].setBounds(60, 30, 170, 100);bonelesschicken[1].setBounds(270, 30, 170, 100);bonelesschicken[2].setBounds(480, 30, 170, 100);
		bonelesschicken[3].setBounds(60, 200, 170, 100);bonelesschicken[4].setBounds(270, 200, 170, 100);bonelesschicken[5].setBounds(480, 200, 170, 100);
		bonelesschicken[6].setBounds(60, 370, 170, 100);bonelesschicken[7].setBounds(270, 370, 170, 100);bonelesschicken[8].setBounds(480, 370, 170, 100);
		//���� ġŲ �̹��� ��ư���� ��ġ�� ����
		bonelesschicken[0].setToolTipText("[���] : �߰��, ��, ���� ����, ����, ĳ����, �ǽ���, �а���, ����");
		bonelesschicken[1].setToolTipText("[���] : �߰��, ��, ����, ��, ����, ������, �а���, ����");
		bonelesschicken[2].setToolTipText("[���] : �߰��, û��, ����޸�����, ���尡��, ����, ������, �а���, ����, ����, �丶�� �ɫ�, ������, ����");
		bonelesschicken[3].setToolTipText("[���] : �߰��, ������ �ø��� ����, �߻�� ����, Ʈ���� ����(�۷ι���), ������, ����, �а���, ����");
		bonelesschicken[4].setToolTipText("[���] : �߰��, ġ��� �����, �Ľ��� ����, ũ��ġ��, ���Ʈ, ��ϸӽ��͵�, ��ũ��, ������, �а���, ����");
		bonelesschicken[5].setToolTipText("[���] : �߰��, ��û �ҽ�, �ɫ�, ����, ����, ������, ��, �Ҽ���, �а���, ����");
		bonelesschicken[6].setToolTipText("[���] : �߰��, �����ҽ�, �����, ����Ƣ��, ����, û��, ����, �а���, ����");
		bonelesschicken[7].setToolTipText("[���] : �߰��, ����Ŀ�� �����, �丶�� ���̽� Ŀ���� �ҽ�, ����, �а���, ����");
		bonelesschicken[8].setToolTipText("[���] : �߰��, �а���, ����, �ø�����, ����");
	}
}