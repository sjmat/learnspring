package learn.spring.coach.constructorinjection;

public class CricketCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	
	public CricketCoach() {
		super();
	}

	public CricketCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	public String getMyAdvice() {
		return "Run 5 rounds in the ground";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
