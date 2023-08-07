package org.tnsif.interfaceexecuter;


//Driver class
public class InterfaceExecuter {

	public static void main(String[] args) {
		
		//We cant instanciate an interface
		//Sony s = new Sony;
		
		SonyTV  s = new SonyTV();
		s.display();
		s.show();
		Sony.accept();
		
		ISRO i = new ISRO();
		i.status();
		
		Human h = new Human();
		h.showdrink();
	}

}
