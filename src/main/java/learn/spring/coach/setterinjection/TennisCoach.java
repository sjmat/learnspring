package learn.spring.coach.setterinjection;

public class TennisCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	public IFortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getMyAdvice() {
		return "Serve 100 volleys";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune()+" You'll serve good today";
	}

}
