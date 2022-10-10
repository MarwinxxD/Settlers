package application;

public class InteractionsPunkt {
	boolean village;
	boolean city;
	int AP1;
	int AP2;
	int AP3;
	String SP1;
	String SP2;
	String SP3;
	String R1;
	String R2;
	String R3;
	
	
	public InteractionsPunkt()
	{
		village = false;
		city = false;
	}
	
	public int getAP1()
	{
		return AP1;
	}
	
	public int getAP2()
	{
		return AP2;
	}
	
	public int getAP3()
	{
		return AP3;
	}
	
	public void setAP1(int zahl)
	{
		AP1 = zahl;
	}
	
	public void setAP2(int zahl)
	{
		AP2 = zahl;
	}
	
	public void setAP3(int zahl)
	{
		AP3 = zahl;
	}
	
	
	
	public String getSP1()
	{
		return SP1;
	}
	
	public String getSP2()
	{
		return SP2;
	}
	
	public String getSP3()
	{
		return SP3;
	}
	
	public void setSP1(String _String)
	{
		SP1 = _String;
	}
	
	public void setSP2(String _String)
	{
		SP2 = _String;
	}
	
	public void setSP3(String _String)
	{
		SP3 = _String;
	}
	
	
	
	public String getR1()
	{
		return R1;
	}
	
	public String getR2()
	{
		return R2;
	}
	
	public String getR3()
	{
		return R3;
	}
	
	public void setR1(String _String)
	{
		R1 = _String;
	}
	
	public void setR2(String _String)
	{
		R2 = _String;
	}
	
	public void setR3(String _String)
	{
		R3 = _String;
	}

	
	
	public boolean getVillage()
	{
		return village;
	}
	
	public boolean getCity()
	{
		return city;
	}
	
	public void setVillage(boolean _village)
	{
		village = _village;
	}
	
	public void setCity(boolean _city)
	{
		city = _city;
	}
}