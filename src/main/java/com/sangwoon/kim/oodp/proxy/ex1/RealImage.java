package com.sangwoon.kim.oodp.proxy.ex1;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	@Override
	public String getFileName() {
		return fileName;
	}
}
