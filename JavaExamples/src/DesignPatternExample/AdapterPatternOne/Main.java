package DesignPatternExample.AdapterPatternOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connectable connCam = new AdapterCameraByObject();
		connCam.connectCamA();
		connCam.connectCamB();
	}

}
