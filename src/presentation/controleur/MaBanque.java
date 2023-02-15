package presentation.controleur;

import java.util.Scanner;

import metier.authentification.IAuth;
import metier.authentification.ServiceAuth;
import presentation.modele.Banque;

public class MaBanque {
	public static IAuth loginService;

	public static void main(String[] args) {

		Banque maBanque = new Banque("CIH", "Rabat agdal", "+212536251477", "CIH@banque.ma");

		Scanner clavier = new Scanner(System.in);
		// loginService = new ServiceAuth(maBanque, clavier);
		loginService = new ServiceAuth(maBanque);
		loginService.seConnecter();

		clavier.close();

	}

}
