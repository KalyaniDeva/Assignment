package org.System;// SINGLE INHERITANCE Package :org.system 

public class Desktop extends Computer{// Class :Desktop Methods :desktopSize()
	
	
	public void desktopSize() {
		System.out.println("15inch");
	}

	public static void main(String[] args) {//create above 2 class and call all your class methods into the Desktop using single inheritance.
		Computer check=new Computer();
		check.computerModel();
		check.desktopSize();
					}

}
/*
 * Package :org.system Class :Computer Methods :computerModel()
 * 
 * Class :Desktop Methods :desktopSize()
 * 
 * Description: create above 2 class and call all your class methods into the
 * Desktop using single inheritance.
 */