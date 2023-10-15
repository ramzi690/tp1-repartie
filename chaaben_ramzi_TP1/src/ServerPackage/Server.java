package ServerPackage;
import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//première étape
		//TODO
		ServerSocket socketServeur = new ServerSocket(1234);
		System.out.println("Je suis un serveur en attente la connexion d'un client");
		//la deuxième étape	
		Socket socket = socketServeur.accept();
		System.out.println("un client est connecté");
		//Read the client input
		/*InputStream is = socket.getInputStream();
		int nb = is.read();
		int x=nb*5;*/
		InputStream is = socket.getInputStream();
		int nb = is.read();
		InputStream is1 = socket.getInputStream();
		int nb1 = is1.read();
		InputStream is2 = socket.getInputStream();
		int nb2 = is2.read();
		int x = 0;
		System.out.println(nb1);
		switch(nb1)
		{
			case 0:  x=nb+nb2;
			case 1:  x=nb-nb2;
			case 2:  x=nb*nb2;
			case 3:  x=nb/nb2;
		}
		//Le serveur envoie le résultat au client
		OutputStream os =socket.getOutputStream(); 
		os.write(x);
		// la dérinère étape: fermer socket
		socket.close();
	}

}