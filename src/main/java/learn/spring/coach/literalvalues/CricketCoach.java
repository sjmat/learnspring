package learn.spring.coach.literalvalues;

public class CricketCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	private String emailAddress;
	
	private String teamName;
	
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
