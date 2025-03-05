package com.sangwoon.kim.oodp.visitor.ex2;

public class VisitorMain {

	public static void main(String[] args) {
		File file1 = new File("file1.txt", 100);
		File file2 = new File("file2.txt", 200);
		File file3 = new File("file3.txt", 300);

		Directory dir1 = new Directory("Folder 1");
		dir1.addElement(file1);
		dir1.addElement(file2);

		Directory dir2 = new Directory("Folder 2");
		dir2.addElement(file3);

		Directory rootDir = new Directory("Root");
		rootDir.addElement(dir1);
		rootDir.addElement(dir2);

		SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
		rootDir.accept(sizeCalculatorVisitor);
		System.out.println("Total size of file system: " + sizeCalculatorVisitor.getTotalSize() + " bytes");

		FileSearchVisitor fileSearchVisitor = new FileSearchVisitor("file3.txt");
		rootDir.accept(fileSearchVisitor);
		File fountFile = fileSearchVisitor.getFountFile();

		if (fountFile != null) {
			System.out.println("File fount: " + fountFile.getName() + ", Size: " + fountFile.getSize() + " bytes");
		} else {
			System.out.println("File not fount");
		}

	}

}
