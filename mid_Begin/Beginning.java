package mid_Begin;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Beginning extends JFrame{//JFrame Ŭ������ ��ӹ��� Beginning Ŭ���� ����
	protected Container c = getContentPane();//������Ʈ���� �� Container c ������Ʈ ����(���� �����ڴ� �ٸ� ��Ű���� �־ ��ӹ��� Ŭ�������� ����� �ϱ����� protected�� ����)
	public Beginning(){//display ������
		setSize(1224, 800);
		setBounds(0, 0, 1224, 800);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT_ON_CLOSE�� ������ ���� ������ ������������ �ݾҴµ��� JFrame��ü�� ��� ��Ƽ� ������ �Ǳ� ������ ���������� ���Ḧ �ϱ� ���ؼ� ������ �Ѵ�.
		setTitle("BHC Ű����ũ");
		setPreferredSize(new Dimension(1024,800));//���̾ƿ� �����ڰ� �ִ� ��� �� �޼ҵ带 ����ؼ� â�� ũ�⸦ �����Ѵ�.
		setLocationRelativeTo(null);//â�� ��ġ�� ȭ���� ����� ���� ���ؼ� �Ű������� null�� ���� setLocationRelativeTo(null) �޼ҵ� ����
		setVisible(true);
	}
}