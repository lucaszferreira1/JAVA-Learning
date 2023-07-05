package controllers;

import java.util.ArrayList;

import Beans.Camera;

public class CameraContr {
	private ArrayList<Object> cameras = new ArrayList<>();
	
	public void add(Camera c) {
		this.cameras.add(c);
	}
	
	public Object get(int index) {
		return this.cameras.get(index);
	}
	
	public ArrayList<Object> getCameras() {
		return this.cameras;
	}
	
	public void remove(int index) {
		this.cameras.remove(index);
	}
	
	public void remove(Object o) {
		this.cameras.remove(o);
	}
}
