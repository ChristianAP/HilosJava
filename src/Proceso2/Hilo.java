package Proceso2;

import java.io.InterruptedIOException;

public class Hilo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " " + getName());
			try {
				Hilo.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
	
}
