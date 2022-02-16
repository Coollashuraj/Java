package adapter;

public class DeviceInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeviceMetrics dm = new DeviceMetrics();
		
		dm.getelectricityconsumption(DeviceType.FRIDGE);
		dm.getelectricityconsumption(DeviceType.TELEVISION);
		dm.getsize(DeviceType.FRIDGE);
		dm.getsize(DeviceType.TELEVISION);
	}

}
