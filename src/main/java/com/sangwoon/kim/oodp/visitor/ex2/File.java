package com.sangwoon.kim.oodp.visitor.ex2;

public class File implements FileSystemElement {

	private String name;
	private long size;

	public File(String name, long size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public long getSize() {
		return size;
	}
}
