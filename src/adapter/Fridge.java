package adapter;

public class Fridge implements DeviceSpecificMethodsInterface {

	String watt;
	String size;

	public String getWatt() {
		return watt;
	}

	public void setWatt(String watt) {
		this.watt = watt;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	Fridge() {
		this.watt = "50W";
		this.size = "10*10*5";
	}

	@Override
	public String getelectricityconsumptionforFridge() {
		// TODO Auto-generated method stub
		return this.watt;

	}

	@Override
	public String getsizeforFridge() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public String getelectricityconsumptionforTelevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getsizeforTelevision() {
		// TODO Auto-generated method stub
		return null;
	}

}
