package learn.java;

import java.util.Arrays;

public class Warehouse {

	int wareHouseID;
	float totalArea;
	String location;
	String[] workers;

	// alt + shift + s + r

	@Override
	public String toString() {
		return "Warehouse [wareHouseID=" + wareHouseID + ", totalArea=" + totalArea + ", location=" + location
				+ ", workers=" + Arrays.toString(workers) + "]";
	}

	public int getWareHouseID() {
		return wareHouseID;
	}

	public void setWareHouseID(int wareHouseID) {
		this.wareHouseID = wareHouseID;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(float d) {
		this.totalArea = d;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getWorkers() {
		return workers;
	}

	public void setWorkers(String[] workers) {
		this.workers = workers;
	}

}
