package org.System;

public class Desktop extends Computer{
	
	
	public void desktopSize() {
		System.out.println("15inch");
	}

	public static void main(String[] args) {
		Computer check=new Computer();
		check.computerModel();
		check.desktopSize();
					}

}
