package DesignPatternExample.AdapterPatternOne;


public class AdapterCameraByObject implements Connectable{

	Camera cam = new Camera();
	
	@Override
	public void connectCamA() {
		cam.connectCamA();
	}

	@Override
	public void connectCamB() {
		cam.connectCamA();
	}


}
