public class Pokemon {

	private String name;
	private int cp;
	private PokemonType type;

	public Pokemon(String name,PokemonType type,int cp) {
		this.name = name;
		this.cp = cp;
		this.type=type;
	}

	public String getname() {
		return this.name;

	}
	
	public PokemonType gettype() {
		return this.type;

	}

	public int getcp() {
		return this.cp;

	}

	public void setcp() {
		this.cp += 500;

	}
}
