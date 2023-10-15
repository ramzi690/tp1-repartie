package ClientPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//la première étape
		//TODO
		System.out.println("Je suis un client pas encore connecté...");
		//TODO
		Socket socket = new Socket("localhost", 1234);
		System.out.println("Je suis un client connecté");
		//Le client taper un entier
		System.out.println("Donner un entier");
		Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		OutputStream os = socket.getOutputStream(); 
		os.write(x);
		//Le client choisi l'operation
		System.out.println("Choisi L'operation:");
		System.out.println("1: L'addition");
		System.out.println("2: Soustraction");
		System.out.println("3:Multiplication");
		System.out.println("4: division");
		Scanner sc1=new Scanner(System.in);
		int ch = sc.nextInt();
		OutputStream os1 = socket.getOutputStream(); 
		os1.write(ch);
		// le client choisi autre entier
		System.out.println("Donner un autre entier");
		Scanner sc2=new Scanner(System.in);
		int x1= sc2.nextInt();
		OutputStream os2 = socket.getOutputStream(); 
		os2.write(x1);
		//Resultat de serveur
		InputStream is = socket.getInputStream();
		int nb=is.read();
		System.out.println(nb);
		//La dernière étape : Fermer socket
		//TODO
		socket.close();

	}

}