package Proceso3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Hilo3 h3 = new Hilo3();
		Hilo4 h4 = new Hilo4();
		h1.start();
		try {
			h1.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		h2.start();
		try {
			h2.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		h3.start();
		try {
			h3.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		h4.start();
		try {
			h4.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

}
