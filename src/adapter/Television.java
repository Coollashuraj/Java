package adapter;

public class Television implements DeviceSpecificMethodsInterface {

	
	String watt;
	
	String size;
	Television()
	{
		this.watt="100W";
		this.size="100*50*10";
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWatt() {
		return watt;
	}

	public void setWatt(String watt) {
		this.watt = watt;
	}

	
	@Override
	public String getelectricityconsumptionforTelevision() {
		// TODO Auto-generated method stub
		
		return watt;
	}

	@Override
	public String getsizeforTelevision() {
		// TODO Auto-generated method stub
		return watt;
	}

	@Override
	public String getelectricityconsumptionforFridge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getsizeforFridge() {
		// TODO Auto-generated method stub
		return null;
	}

}
