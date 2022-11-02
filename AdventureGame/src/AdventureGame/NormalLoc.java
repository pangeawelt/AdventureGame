package AdventureGame;

public abstract class NormalLoc extends Location {

	NormalLoc(Player player, String name) {
		super(player);
		this.name = name; // das gehört von Location

	}

	@Override
	public boolean getLocation() {
		return true; // weiter
	}

}
