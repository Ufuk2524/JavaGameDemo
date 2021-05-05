package Abstract;

import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public interface GameService {

	public void add(Game game);

	public void delete(Game game);

	public void update(Game game); 
	
	public void sale(Gamer gamer, Game game);

	public void sale(Gamer gamer, Game game, Campaing campaing);
}