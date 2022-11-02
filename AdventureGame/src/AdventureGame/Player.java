package AdventureGame;

import java.util.Scanner;

public class Player {
	private int damage, healty, money, rhealty;
	// rhealty(reel- wenn kämpft sink oder erhöht sein gesund.

	private String name, cName;// Karakter name
	private Inventory inv;

	Scanner scan = new Scanner(System.in);

	public void initPlayer(String cName, int dmg, int hlthy, int mny) { //
		setcName(cName);
		setDamage(dmg);
		setHealty(hlthy);
		setMoney(mny);
		setHealty(hlthy);
	}

	public void selectCha() {
		/*
		 * switch(chaMenu()){ case 1: initPlayer("Samuray",5,21,15); case 2:
		 * initPlayer("Ritter",8,24,5); case 3: initPlayer("BogenShütze",7,18,20); break
		 * ; default: initPlayer("Samuray",5,21,15); break ;
		 */

		// erst mal hab ich so geamcht danach hab ich gemerkt Redudanz

		switch (chaMenu()) {

		case 1:
			setcName("Samuray");
			setDamage(5);
			setHealty(21);
			setMoney(15);
			break;

		case 2:
			setcName("BogenShütze");
			setDamage(7);
			setHealty(18);
			setMoney(20);
			break;
		case 3:
			setcName("Ritter");
			setDamage(8);
			setHealty(24);
			setMoney(5);
			break;

		default:
			setcName("Samuray");
			setDamage(5);
			setHealty(21);
			setMoney(15);
			break;
		}

		System.out.println("Ihre  Charakter ist " + getcName() + " Damage :" + getDamage() + " Gesund : " + getHealty()
				+ " Geld :" + getMoney());
	}

	public int chaMenu() {

		System.out.println("!!! Bitte wahlen Sie ein Charakter !!!");
		System.out.println("-----------------------------------------------------------");

		System.out.println("*-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-*");
		System.out.println("|1-Typ: Samuray      Beschaedigung:(5)   Gesund:(21)  Geld:(15)|");
		System.out.println("|2-Typ: BogenShütze  Beschaedigung:(7)   Gesund:(18)  Geld:(20)|");
		System.out.println("|3-Typ: Ritter       Beschaedigung:(8)   Gesund:(24)  Geld:( 5)|");
		System.out.println("*---------------------------------------------------------*");

		int chaID = scan.nextInt();
		try {

			if ((chaID < 1) || (chaID > 3)) {
				System.out.println("-------------------- Ohh Mann--------------");
				System.out.println("...............Bitte wahlen ein Charakter............ ");
				chaID = scan.nextInt();
			} else {
				System.out.println("-------------Toll Ihre Charakter :-> " + chaID + "<-: --------------");

			}

		} catch (Exception e) {
			System.out.println("oo was machst du denn . gibt bitte nur 1-3 ein Zahl..");
		}

		return chaID;
	}

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealty() {
		return healty;
	}

	public void setHealty(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getRhealty() {
		return rhealty;
	}

	public void setRhealty(int rhealty) {
		this.rhealty = rhealty;
	}

}
