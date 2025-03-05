package com.sangwoon.kim.oodp.visitor.ex2;

public interface Visitor {
	void visit(File file);
	void visit(Directory directory);
}
