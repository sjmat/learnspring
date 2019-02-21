package learn.spring.coach.setterinjection;

public class CricketCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getMyAdvice() {
		return "Run 5 rounds in the ground";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
