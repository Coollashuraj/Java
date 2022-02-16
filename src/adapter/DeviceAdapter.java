package adapter;

public class DeviceAdapter implements Device {

	DeviceSpecificMethodsInterface d;

	DeviceAdapter(DeviceType deviceType) {
		if (deviceType == DeviceType.FRIDGE) {
			d = new Fridge();

		} else if (deviceType == DeviceType.TELEVISION) {
			d = new Television();
		}
	}

	@Override
	public String getelectricityconsumption(DeviceType deviceType) {

		if (deviceType == DeviceType.FRIDGE) {
			return d.getelectricityconsumptionforFridge();

		}

		else {
			return d.getelectricityconsumptionforTelevision();

		}
	}

	@Override
	public String getsize(DeviceType deviceType) {
		// TODO Auto-generated method stub
		if (deviceType == DeviceType.FRIDGE) {
			return d.getsizeforFridge();

		}

		else if (deviceType == DeviceType.TELEVISION) {
			return d.getsizeforTelevision();

		} else {
			return "";
		}
	}

}
