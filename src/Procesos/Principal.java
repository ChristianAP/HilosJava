package Procesos;

public class Principal {
	 public static void main(String[]args) {
		 Hilo1 h1 = new Hilo1();
		 Hilo2 h2 = new Hilo2();
		 Thread h3 = new Thread(new Hilo3());
		 h1.start();
		 h2.start();
		 h3.start();
	 }
}
