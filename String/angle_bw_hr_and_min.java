
import java.util.*;

public class angle_bw_hr_and_min {

	public static void main(String[] args) {
		try{
			String time = null;
			String timeArray[];
			int hr,min;
			double hrAngle, minAngle,diffAngle;
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the time:");
			time = scan.nextLine();
			
			timeArray = time.split(":");
			hr = Integer.parseInt(timeArray[0]);
			min = Integer.parseInt(timeArray[1]);
			hr = hr % 12;
			hrAngle = hr * 30 + (0.5 * min);
			minAngle = 6*min;
			diffAngle = (hrAngle > minAngle) ? (hrAngle-minAngle):(minAngle-hrAngle);
			System.out.println("The Angle between the hr and the minute hand on a clock at "+time+" is "+ diffAngle+ "degrees");
			}
		catch(Exception e){
			System.out.println("wrong input");
		}
	}
}