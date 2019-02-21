package learn.spring.coach.literalvalues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		ICoach coach1 = new CricketCoach();
		ICoach coach2 = new TennisCoach();
		
		System.out.println(coach1.getMyAdvice());
		System.out.println(coach2.getMyAdvice());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_LV.xml");
		CricketCoach coach3 = context.getBean("coach", CricketCoach.class);
		System.out.println(coach3.getMyAdvice());
		System.out.println(coach3.getDailyFortune());
		System.out.println(coach3.getEmailAddress());
		System.out.println(coach3.getTeamName());
		context.close();
	}

}
