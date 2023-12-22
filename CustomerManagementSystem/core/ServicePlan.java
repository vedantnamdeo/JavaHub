package CustomerManagementSystem.core;

public enum ServicePlan 
{
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double subscription_Amount;
	private ServicePlan(double subscription_Amount)
	{
		this.subscription_Amount=subscription_Amount;
		
	}
	public double getPlanCost()
	{
		return subscription_Amount;
	}
	
	public String toString()
	{
		return "Plan:"+name()+" Subscription Amount:$"+subscription_Amount;
	}
}
