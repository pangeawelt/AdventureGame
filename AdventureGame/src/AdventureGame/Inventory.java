package AdventureGame;

public class Inventory {
	private boolean wasser, lebensmittel, brennholz;
	private String bName, rName; // beschaedigungname und ruestungname(weapon und armor)
	private int beschaedigung, ruestung;

	Inventory() {
		this.wasser = false;
		this.lebensmittel = false;
		this.brennholz = false;
		this.beschaedigung = 0;
		this.ruestung = 0;
		this.bName = null;
		this.rName = null;

	}

	public boolean isWasser() {
		return wasser;
	}

	public void setWasser(boolean wasser) {
		this.wasser = wasser;
	}

	public boolean isLebensmittel() {
		return lebensmittel;
	}

	public void setLebensmittel(boolean lebensmittel) {
		this.lebensmittel = lebensmittel;
	}

	public boolean isBrennholz() {
		return brennholz;
	}

	public void setBrennholz(boolean brennholz) {
		this.brennholz = brennholz;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public int getBeschaedigung() {
		return beschaedigung;
	}

	public void setBeschaedigung(int beschaedigung) {
		this.beschaedigung = beschaedigung;
	}

	public int getRuestung() {
		return ruestung;
	}

	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}

}
