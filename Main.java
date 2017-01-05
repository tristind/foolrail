
import command.CommandParser;
import gui.RichRailController;

public class Main
{
	public static void main(String[] args)
	{
		Main main = new Main();
		main.run();
	}

	public Main()
	{
	}

	public void run()
	{
		CommandParser parser = new CommandParser();

		// test some commands
		parser.runCommand("new train tr1");
		parser.runCommand("new train tr2");
		parser.runCommand("new wagon wg1");
		parser.runCommand("new wagon wg2");
		parser.runCommand("new wagon wg3");
		parser.runCommand("add wg1 to tr1");
		parser.runCommand("add wg2 to tr1");
		parser.runCommand("add wg3 to tr1");
		parser.runCommand("remove wg2 from tr1");
		parser.runCommand("new wagon wg4 numseats 2000");
		parser.runCommand("add wg4 to tr2");

		RichRailController control = new RichRailController(parser);
		control.run();
	}
}
