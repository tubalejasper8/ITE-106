class Lamp2
{
	boolean isOn;
	
	void turnOn(){
		isOn = true;
		System.out.println("Light on? " + isOn);
	}
	
	void turnOff(){
		isOn = false;
		System.out.println("Light on? " + isOn);
	}
}
