package adapter;

public class DeviceMetrics implements Device {

	DeviceAdapter dsm;
	@Override
	public String getelectricityconsumption(DeviceType deviceType) {
		// TODO Auto-generated method stub
		if (deviceType == DeviceType.FRIDGE|| deviceType == DeviceType.TELEVISION) {
			return dsm.getelectricityconsumption(deviceType);
		}
		else {
			return null;
		}
		
	}

	@Override
	public String getsize(DeviceType deviceType) {
		// TODO Auto-generated method stub
		if (deviceType == DeviceType.FRIDGE|| deviceType == DeviceType.TELEVISION) {
			return dsm.getsize(deviceType);
		}
		else {
			return null;
		}
	}

}
