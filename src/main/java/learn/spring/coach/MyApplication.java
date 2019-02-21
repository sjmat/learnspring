package learn.spring.coach;

public class MyApplication {

	public static void main(String[] args) {
		ICoach coach1 = new CricketCoach();
		ICoach coach2 = new TennisCoach();
		
		System.out.println(coach1.getMyAdvice());
		System.out.println(coach2.getMyAdvice());
	}

}
