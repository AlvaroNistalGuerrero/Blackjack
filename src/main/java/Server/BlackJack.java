package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.fp.dam.naipes.blackjack.Blackjack;

public class BlackJack {
	
	
	public static void main(String[] args)throws IOException {
		ExecutorService executorService = Executors.newFixedThreadPool(100);
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("Echo Server listening on port 9999");
		Partida p = new Partida();
		while (true) 
			executorService.submit(new BlackJackServer(serverSocket.accept(), p));
	}

}
