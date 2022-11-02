package AdventureGame;

public class SafeHaus extends NormalLoc {

	SafeHaus(Player player) {
		super(player, "Sicheres Haus");

	}

	@Override
	public boolean getLocation() {
		player.setHealty(player.getRhealty());
		System.out.println("Du hast geheilt");
		System.out.println("Du bist momentan zu Hause,sicher ist.");
		return true;
	}

}
