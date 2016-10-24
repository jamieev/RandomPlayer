import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class App {

	static Player player = new Player();

	public static void main(String[] args) {
		Row row = new Row(new Integer[] {9,3,5,8,2,10,1,7,0,4,6,11});
		player.play(
				new Pattern("r" + Utils.randomDur() + " " + row.getPlayerString()).setInstrument("piano").setVoice(0),
				new Pattern("r" + Utils.randomDur() + " " + row.invert().getPlayerString()).setInstrument("piano").setVoice(1),
				new Pattern("r" + Utils.randomDur() + " " + row.retrograde().getPlayerString(5,7)).setInstrument("flute").setVoice(2),
				new Pattern("r" + Utils.randomDur() + " " + row.invert().retrograde().getPlayerString(5,6)).setInstrument("oboe").setVoice(3)
				);
	}
}
