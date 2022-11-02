package AdventureGame;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);

	public void login() {

		System.out.println("(((:--------------------HERZCLIH WILLKOMMEN UNSERE SPIEL--------------------:)))");
		System.out.println(" ");
		System.out.println("!!! Bitte Geben Sie Ihre Name ein !!!");
		System.out.println(" ");
		String playerName = scan.nextLine();

		System.out.println(
				"(((:--------------------" + "Hallo " + (playerName.toUpperCase().trim()) + "--------------------:)))");
		player = new Player("a");
		player.selectCha();
		start();

	}

	public void start() {

		while (true) {

			System.out.println("");
			System.out.println("(:------------Für Bewegung wahlen Sie bitte ein Ort---------:))");

			System.out.println("*--------------------------------------------------------------*");
			System.out.println("!!!|1.Sicheres Haus -->  Sie gehört ein Ort,die kein Feind ist !!!|");
			System.out.println("!!!|2.Höhle         -->  Du kannst ein Zombi sehen             !!!|");
			System.out.println("!!!|3.Wald          -->  Vielleicht begegnen Sie dem Bären.    !!!|");
			System.out.println("!!!|4.Fluss         -->  Vielleicht begegnen Sie einem Vampir. !!!|");
			System.out.println("!!!|5.Laden         -->  Du kannst Waffen und Harnisch bekommen!!!|");
			System.out.println("*---------------------------------------------------------------*");
			int selLoc;

			try {

				selLoc = scan.nextInt();

				if ((selLoc < 0) || (selLoc > 5)) {
					System.out.println("-------------------- Ohh Mann !!        --------------");
					System.out.println("...............Bitte wahlen ein richtige Ort !!!............ ");
					selLoc = scan.nextInt();
				} else {
					System.out.println("-------------Toll Ihre Ort :-> " + selLoc + "<-: --------------");

				}
				switch (selLoc)

				{
				case 1:
					location = new SafeHaus(player);
					break;
				case 5:
					location = new ToolStore(player);
					break;
				default:
					location = new SafeHaus(player);
					break;
				}

				if (!location.getLocation()) { //
					System.out.println("------------GAME OVER------------");
					break;
				}

			} catch (Exception e) {
				System.out.println("oo was machst du denn . gibt bitte nur 1-3 ein Zahl..");
			}
		}

	}

	public void form() {

		System.out.println("-----------------------------------------------------------");

		System.out.println("|1- :          |");
		System.out.println("|2- :          |");
		System.out.println("|3- :          |");
		System.out.println("*---------------------------------------------------------*");
	}

}
