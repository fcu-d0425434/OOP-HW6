import java.util.Random;

public class GYM {

	public static Player fight(Player player1, Player player2) {
		int p1 = 0;
		int p2 = 0;
		Random ran = new Random();
		int x = ran.nextInt(2) + 1;
		Pokemon[] pkm1 = player1.getPokemons();
		Pokemon[] pkm2 = player2.getPokemons();

		for (int i = 0; i < 3; i++) {
			if (pkm1[i].gettype() == pkm2[i].gettype()) {
				if (pkm1[i].getcp() > pkm2[i].getcp()) {
					p1 += 1;
				} else if (pkm1[i].getcp() < pkm2[i].getcp()) {
					p2 += 1;
				} else if (pkm1[i].getcp() == pkm2[i].getcp()) {
					if (x == 1) {
						p1 += 1;
					}

					else if (x == 2) {
						p2 += 1;
					}
				}
			}

			else if (pkm1[i].gettype() == PokemonType.FIRE && pkm2[i].gettype() == PokemonType.WATER) {
				p2 += 1;
			} else if (pkm1[i].gettype() == PokemonType.FIRE && pkm2[i].gettype() == PokemonType.GRASS) {
				p1 += 1;
			} else if (pkm1[i].gettype() == PokemonType.WATER && pkm2[i].gettype() == PokemonType.GRASS) {
				p2 += 1;
			} else if (pkm1[i].gettype() == PokemonType.WATER && pkm2[i].gettype() == PokemonType.FIRE) {
				p1 += 1;
			} else if (pkm1[i].gettype() == PokemonType.GRASS && pkm2[i].gettype() == PokemonType.WATER) {
				p1 += 1;
			} else if (pkm1[i].gettype() == PokemonType.GRASS && pkm2[i].gettype() == PokemonType.FIRE) {
				p2 += 1;
			}
		}
		if (p1 > p2) {
			player1.setlevel();
			System.out.println("Winner is [" + player1.getplayername() + "]and his/her level becomes ["
					+ player1.getlevel() + "].");
			return player1;
		} else {
			player2.setlevel();
			System.out.println("Winner is [" + player2.getplayername() + "]and his/her level becomes ["
					+ player2.getlevel() + "].");
			return player2;
		}

	}
}