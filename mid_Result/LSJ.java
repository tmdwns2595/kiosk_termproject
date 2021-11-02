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
public class LSJ extends mpbtn4{//마지막 메인 클래스로 처음 시작화면에 나오는 현재 시간을 알려주는 텍스트 필드와 광고를 보여주는 라벨을 설정해주는 클래스이다.
	protected JTextField currentTime = new JTextField();
	protected String adv[] = {"src/image/bhc광고1.jpg","src/image/bhc광고2.jpg"};
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
			
			
			Calendar t = Calendar.getInstance();//현재 날짜를 출력해주기 위해서 값들을 받아오는 부분
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
			switch(day) {//day를 인자로 받아서 case문을 통해 요일을 설정해 주는 부분
				case 1:
					DOW = "일";
					break;
				case 2:
					DOW = "월";
					break;
				case 3:
					DOW = "화";
					break;
				case 4:
					DOW = "수";
					break;
				case 5:
					DOW = "목";
					break;
				case 6:
					DOW = "금";
					break;
				case 7:
					DOW = "토";
					break;
			}
			String cal = year + "년 " + month + "월 " + date + "일 "+ ampm + " " + hour + "시 " + min + "분 " + sec + "초 " + DOW+"요일입니다.";
			JTextField currentTime = new JTextField(cal);
			currentTime.setHorizontalAlignment(JTextField.CENTER);
			currentTime.setFont(new Font("굴림", Font.BOLD, 15));
			currentTime.setBorder(new LineBorder(Color.WHITE, 4));
			ownpanel[12].add(currentTime);
			currentTime.setBounds(10,40,390,30);
			try {
					Thread.sleep(1000);//1초마다 시간을 repaint()해주는 부분
					this.repaint();
			}catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new LSJ();//main객체 생성
	}
}