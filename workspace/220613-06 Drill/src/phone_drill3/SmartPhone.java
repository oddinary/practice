package phone_drill3;

public class SmartPhone extends Phone{
	private String osType;
	private	double osVersion;
	private	int memory;
	private boolean	camera;
	private boolean bluetooth;
	
	public SmartPhone(String company, int price, String type, String osType, double osVersion, int memory,
			boolean camera, boolean bluetooth) {
		super(company, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public double getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(double osVersion) {
		this.osVersion = osVersion;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public String toString() {
		return super.toString() + ", 운영체제 타입: "+ osType + ", 운영체제 버전: " + osVersion + ", 메모리 크기: "+ memory + ", 카메라 여부: " + camera + ", 블루투스 여부: " + bluetooth;
	}
}
