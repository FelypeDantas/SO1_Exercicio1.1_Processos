package view;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redes = new RedesController();
		
		String process = "ping -4 -c 10 www.google.com.br";
		
		redes.readProcess(process);
		
		String ip = "ip addr";
		redes.config(ip);

	}

}
