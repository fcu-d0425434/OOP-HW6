public class Player {

	private String playername;
	private Pokemon[] pokemons;
	private int level = 1;

	public Player(String playername) {
		this.playername = playername;
	}

	public void setPokemons(Pokemon[] pokemon) {
		this.pokemons=pokemon;
	}

	public String getplayername() {
		return this.playername;

	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}
	
	public int getlevel() {
		return this.level;

	}
	
	public void setlevel() {
		this.level+=1;
	}

}
