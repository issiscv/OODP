package com.sangwoon.kim.oodp.visitor.ex2;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {

	private String name;
	private List<FileSystemElement> elements;

	public Directory(String name) {
		this.name = name;
		elements = new ArrayList<>();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void addElement(FileSystemElement element) {
		elements.add(element);
	}

	public String getName() {
		return name;
	}

	public List<FileSystemElement> getElements() {
		return elements;
	}
}
