package learn.spring.coach.constructorinjection;

public class TennisCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	

	public TennisCoach() {
		super();
	}
	
	

	public TennisCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}



	public String getMyAdvice() {
		return "Serve 100 volleys";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune()+" You'll serve good today";
	}

}
