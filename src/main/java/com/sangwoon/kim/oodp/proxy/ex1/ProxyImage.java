package com.sangwoon.kim.oodp.proxy.ex1;

public class ProxyImage implements Image {

	private RealImage target;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (target == null) {
			target = new RealImage(fileName);
		}
		target.display();
	}

	@Override
	public String getFileName() {
		return fileName;
	}

	public String getFileExtension() {
		int lastIndex = fileName.lastIndexOf('.');
		if (lastIndex == -1) {
			return "";
		}

		return fileName.substring(lastIndex + 1);
	}

}
