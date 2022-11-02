package AdventureGame;

public class ToolStore extends NormalLoc {

	ToolStore(Player player) {
		super(player, "Laden");

	}

	@Override
	public boolean getLocation() {

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		System.out.println("*-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-*");
		System.out.println("|1- :    Geld        :  |" + "Du hast " + getPlayer().getMoney() + " GELD");
		System.out.println("|2- :    Waffen      :  |");
		System.out.println("|3- :    Rüstungen   :  |");
		System.out.println("|4- :    Ausgang     :  |");
		System.out.println("Ihre Wahl :   ");
		int selTool = scan.nextInt();
		int selItemID;

		switch (selTool) {
		case 1:
			selItemID = waffenMenu();
			kaufWaffen(selItemID);

			break;
		case 2:
			break;

		default:
			break;
		}

		return true;

	}

	public int waffenMenu() {
		System.out.println("Ihre Wahl :   ");
		System.out.println("*-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.-*");
		System.out.println("|1-Typ: Pistole      Beschaedigung:(2)    Geld:(25)|"); // Tabanca
		System.out.println("|2-Typ: Schwert	     Beschaedigung:(3)    Geld:(35)|"); // Kilic
		System.out.println("|3-Typ: Gewehr       Beschaedigung:(7)    Geld:(45)|"); // Tüfek
		System.out.println("|4.------------    Ausgang ------- ------------    |");
		System.out.println("|.......Bitte wahlen ein Waffen ...............    |");
		int selWaffenID = scan.nextInt();
		return selWaffenID;

	}

	public void kaufWaffen(int itemID) {
		int damage = 0, prise = 0;
		String bName = null;

		switch (itemID) {
		case 1:
			damage = 2;
			bName = "Pistole";
			prise = 5; // 25
			break;
		case 2:
			damage = 3;
			bName = "Schwert";
			prise = 35;
			break;
		case 3:
			damage = 7;
			bName = "Gewehr";
			prise = 45;
			break;

		default:
			System.out.println("OO !! was machst du denn . gibt bitte nur 1-3 ein Zahl..");
			break;
		}
		if (player.getMoney() > prise) {

			player.getInv().setBeschaedigung(damage);
			player.getInv().setbName(bName);
			player.setMoney(player.getMoney() - prise);

			System.out.println(bName + " Du hast Waffen gekauft ;  ");
			System.out.println("Vorherige Beschaedigung :" + player.getDamage());
			System.out.println(", Neue Beschaedigung :  " + (player.getDamage()));
			System.out.println(player.getInv().getBeschaedigung());
			System.out.println("Übrigens Gelds : " + player.getMoney());

		} else {
			System.out.println("Oh Mannnn!! Dein Geld ist genug leider:( ");
		}

	}

}
