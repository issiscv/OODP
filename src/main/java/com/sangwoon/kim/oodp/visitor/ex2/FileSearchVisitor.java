package com.sangwoon.kim.oodp.visitor.ex2;

public class FileSearchVisitor implements Visitor {

	private String searchFileName;
	private File fountFile;

	public FileSearchVisitor(String searchFileName) {
		this.searchFileName = searchFileName;
	}

	@Override
	public void visit(File file) {
		if (file.getName().equals(searchFileName)) {
			fountFile = file;
		}
	}

	@Override
	public void visit(Directory directory) {
		for (FileSystemElement element : directory.getElements()) {
			element.accept(this);
		}
	}

	public File getFountFile() {
		return fountFile;
	}
}
