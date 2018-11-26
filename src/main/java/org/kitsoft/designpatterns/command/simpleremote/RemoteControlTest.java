package org.kitsoft.designpatterns.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
		GarageDoorDownCommand garageDown =
				new GarageDoorDownCommand(garageDoor);
 
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageOpen, garageDown);

		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(1);

		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(1);

    }
	
}
