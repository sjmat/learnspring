package learn.spring.coach.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		ICoach coach1 = new CricketCoach();
		ICoach coach2 = new TennisCoach();
		
		System.out.println(coach1.getMyAdvice());
		System.out.println(coach2.getMyAdvice());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_SI.xml");
		ICoach coach3 = context.getBean("coach", ICoach.class);
		System.out.println(coach3.getMyAdvice());
		System.out.println(coach3.getDailyFortune());
		context.close();
	}

}
