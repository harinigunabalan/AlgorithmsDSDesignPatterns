import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.Math.toIntExact;

public class unixtimestamp {

	public static void main(String[] args) {

		try {
			String timestamp = "2016-03-01T20:15:25";
			StringBuilder TS = new StringBuilder(timestamp);
			TS.setCharAt(10, ' ');
			String dateString = TS.toString();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date = dateFormat.parse(dateString );
			long unixTime = (long) date.getTime()/1000;
			int time = toIntExact(unixTime);
			System.out.println(unixTime );//<- prints 1352504418
			System.out.println(time );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}