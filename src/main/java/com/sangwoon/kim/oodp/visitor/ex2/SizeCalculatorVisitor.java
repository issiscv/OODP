package com.sangwoon.kim.oodp.visitor.ex2;

public class SizeCalculatorVisitor implements Visitor {
	private long totalSize = 0;

	@Override
	public void visit(File file) {
		totalSize += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		for (FileSystemElement element : directory.getElements()) {
			element.accept(this);
		}
	}

	public long getTotalSize() {
		return totalSize;
	}

}
