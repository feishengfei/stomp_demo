package com.frank.pojo;

public class HeartBeat {
	private String bootloaderVersion;
	private String deviceId;
	private String model;
	private String osVersion;
	long uptime;
	public String getBootloaderVersion() {
		return bootloaderVersion;
	}
	public void setBootloaderVersion(String bootloaderVersion) {
		this.bootloaderVersion = bootloaderVersion;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public long getUptime() {
		return uptime;
	}
	public void setUptime(long uptime) {
		this.uptime = uptime;
	}
	
	public String toString() {
		String ret = "bootloaderVersion:" + bootloaderVersion + "\r\n";
		ret += "deviceId:" + deviceId + "\r\n";
		ret += "model:" + model + "\r\n";
		ret += "osVersion:" + osVersion + "\r\n";
		ret += "uptime:" + uptime + "\r\n";
		return ret;
	}
}
