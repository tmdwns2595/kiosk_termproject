package mid_Result;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import mid_MpBtn.mpbtn4;
public class LSJ extends mpbtn4{//������ ���� Ŭ������ ó�� ����ȭ�鿡 ������ ���� �ð��� �˷��ִ� �ؽ�Ʈ �ʵ�� ���� �����ִ� ���� �������ִ� Ŭ�����̴�.
	protected JTextField currentTime = new JTextField();
	protected String adv[] = {"src/image/bhc����1.jpg","src/image/bhc����2.jpg"};
	public int locvar = 0;
	public LSJ() {
		while(true) {
			TimerTask tsk = new TimerTask() {
				public void run() {
					if(locvar < 2) {
						slideshow.setIcon(new ImageIcon(adv[locvar]));
						locvar++;
					}
					else {
						locvar = 0;
						slideshow.setIcon(new ImageIcon(adv[locvar]));
						locvar++;
					}
				}
			};
			Timer timer = new Timer();
			long delay = 0;
			int intervalPeriod = 10000;
			timer.scheduleAtFixedRate(tsk,delay,intervalPeriod);
			
			
			Calendar t = Calendar.getInstance();//���� ��¥�� ������ֱ� ���ؼ� ������ �޾ƿ��� �κ�
			int year = t.get(Calendar.YEAR);
			int month = t.get(Calendar.MONTH) + 1; 
			int date = t.get(Calendar.DATE);
			int amPm = t.get(Calendar.AM_PM);
			int hour = t.get(Calendar.HOUR);
			int min = t.get(Calendar.MINUTE);
			int sec = t.get(Calendar.SECOND);
			int msec = t.get(Calendar.MILLISECOND);
			int day = t.get(Calendar.DAY_OF_WEEK);
			String ampm = amPm==Calendar.AM? "AM":"PM";
			String DOW = null;
			switch(day) {//day�� ���ڷ� �޾Ƽ� case���� ���� ������ ������ �ִ� �κ�
				case 1:
					DOW = "��";
					break;
				case 2:
					DOW = "��";
					break;
				case 3:
					DOW = "ȭ";
					break;
				case 4:
					DOW = "��";
					break;
				case 5:
					DOW = "��";
					break;
				case 6:
					DOW = "��";
					break;
				case 7:
					DOW = "��";
					break;
			}
			String cal = year + "�� " + month + "�� " + date + "�� "+ ampm + " " + hour + "�� " + min + "�� " + sec + "�� " + DOW+"�����Դϴ�.";
			JTextField currentTime = new JTextField(cal);
			currentTime.setHorizontalAlignment(JTextField.CENTER);
			currentTime.setFont(new Font("����", Font.BOLD, 15));
			currentTime.setBorder(new LineBorder(Color.WHITE, 4));
			ownpanel[12].add(currentTime);
			currentTime.setBounds(10,40,390,30);
			try {
					Thread.sleep(1000);//1�ʸ��� �ð��� repaint()���ִ� �κ�
					this.repaint();
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new LSJ();//main��ü ����
	}
}