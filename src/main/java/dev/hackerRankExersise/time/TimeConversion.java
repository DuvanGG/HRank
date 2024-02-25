package dev.hackerRankExersise.time;

public class TimeConversion {

	public static void main(String[] args) {
//		String s = "12:01:00PM"; // 12:01:00
//		String s = "01:01:00PM"; // 13:01:00
		String s = "01:01:00AM"; // 00:01:0025
		timeConversion(s);
		System.out.println(timeConversion(s));
	}

	public static String timeConversion(String s) {

		if (s.contains("AM")) {
			if (s.contains("12")) {
//				System.out.println(s);
				s = s.replace("12", "00");
				String hm = s.replace("AM", "");
				s = hm;
//				System.out.println(hm);
			}else {
				s = s.replace("AM", "");
//				System.out.println(s);
			}

		}
		
		if (s.contains("PM")) {
			if (s.contains("12")) {
//				System.out.println(s);
				String hm = s.replace("PM", "");
//				System.out.println(hm);
				s = hm;
			}else {
				s = s.replace("PM", "");
				
				String h = s.substring(0, 2);
				
				Integer h2 = Integer.parseInt(h);
			
				Integer h3 = h2 + 12;
//				System.out.println(h2 + 12);
				
				String.valueOf(h3);
				
				String hmc = s.substring(2);
//				System.out.println(h3 + hmc);
				
				s = h3 + hmc;
//				System.out.println(s);
			}

		}

		return s;

	}

}
