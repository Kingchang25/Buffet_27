/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sport = new String ("sports");
		String videogames = new String ("video Games");
		String cartoon = new String ("cartoons");

		System.out.println("Welcome to the Ascii Museum!");
		System.out.println("Please select what exibit you'd  like to to view.");
		System.out.println("1. " + sport);
		System.out.println("2. " + videogames);
		System.out.println("3. " + cartoon);
		String choice = sc.nextLine();
		if (choice.equals(sport)) {
			System.out.println("-Sports exibit!-");
			System.out.println("Please select a sport to view.");
			System.out.println("1. Basketball");
			System.out.println("2. Fishing");
			System.out.println("3. Golf");
			String sportchoice = sc.nextLine();
			if(sportchoice.equals("basketball")) {
				System.out.println("You have selected the Basketball exibit!");
					System.out.println("            <\\ __");
				System.out.println("            /\\>   \\O___");
				System.out.println("          /       __\\   \\");
				System.out.println("        /       /  /");
				System.out.println("       |          /");
				System.out.println("_______|_______________");
		
			}
			else if (sportchoice.equals("fishing")) {
				System.out.println("You have selected the Fishing exibit!");
				System.out.println("     ,%&& %&& %");
				System.out.println("   ,%&%& %&%& %&");
				System.out.println("  %& %&% &%&% % &%");
				System.out.println(" % &%% %&% &% %&%&,");
				System.out.println(" &%&% %&%& %& &%& %");
				System.out.println("%%& %&%& %&%&% %&%%&");
				System.out.println("&%&% %&% % %& &% %%&");
				System.out.println("&& %&% %&%& %&% %&%'");
				System.out.println(" '%&% %&% %&&%&%%'%");
				System.out.println("  % %& %& %&% &%%");
				System.out.println("    `\\%%.'  /`%&'");
				System.out.println("      |    |            /`-._           _\\\\/");
				System.out.println("      |,   |_          /     `-._ ..--~`_");
				System.out.println("      |;   |_`\\_      /  ,\\\\.~`  `-._ -  ^");
				System.out.println("      |;:  |/^}__..-,@   .~`    ~    `o ~");
				System.out.println("      |;:  |(____.-'     '.   ~   -    `    ~");
				System.out.println("      |;:  | \\ / `\\       //.  -    ^   ~");
				System.out.println("      |;:  |\\ /' /\\_\\_        ~. _ ~   -   //-");
				System.out.println(" jgs\\\\/;:   \\'--' `---`           `\\\\//-\\\\///");


			}
			else if (sportchoice.equals("golf")) {
				System.out.println("You have selected the Golf exibit!");
				System.out.println("        /`                                            |>18>>");
				System.out.println("       /                                              |");
				System.out.println("     <<O                                              |");
				System.out.println("       \\                                              |");
				System.out.println("       /\\                                             |");
				System.out.println("      / / o                                           |");
				System.out.println("jgs^^^^^^^`^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else {
				System.out.println("Invalid input. Please try again.");
			}
		}
		else if (choice.equals("video games")) {
			System.out.println("You have selected the Video Games exibit!");
			System.out.println("Please select a video game to view.");
			System.out.println("1. Sims");
			System.out.println("2. Pokemon");
			System.out.println("3. Legend of Zelda");
			String videogamechoice = sc.nextLine();
			if(videogamechoice.equals("sims")) {
				System.out.println("You have selected the Sims exibit!");
				System.out.println("                                                         ,-,-.");
				System.out.println("                                                       _(    _) ");
				System.out.println("                                                      (__,`-' ");
				System.out.println("                                            ,'`.   .-----, ");
				System.out.println("                             __           ,','`.`.  |   | ");
				System.out.println("                  _____    ,'  `.       ,','    `.`.|---| ");
				System.out.println("              _,-'     \\  /      \\    ,',' _____  `.`.  | ");
				System.out.println("           ,-'          \\ \\      /  ,','  |  |  |   `.`.| ");
				System.out.println("         ,'           ___\\ `.__.' ,','__  |--|--|   __'.`.         _ ");
				System.out.println("        /         _,-'     .----. \\|    \\ |__|__|  /    |/      ,-' \\ TM ");
				System.out.println("       |        ,'         |    |  |     \\        /     |    ,-'    _\\ ");
				System.out.println("       |        |          |    |  |      \\      /      |  ,'    ,-' ");
				System.out.println("        \\       \\          |    |  |       \\    /       | /     / ");
				System.out.println("         \\       \\         |    |  |        \\  /        | |    (  ");
				System.out.println("          \\       `.       |    |  |         \\/         |  \\    \\ ");
				System.out.println(" ____ _    `.       `.     |    |  |    \\          /    |   `.   `. ");
				System.out.println("'-..-'||     `.       `.   |    |  |    |\\        /|    |     `.   `. ");
				System.out.println("  ||  ||__   __`.       \\  |    |  |    | \\      / |    |       \\    \\ ");
				System.out.println("  ||  |.-.\\ /__\\ \\       \\ |    |  |    |  \\    /  |    |      ,'    / ");
				System.out.println("  ||  || || \\__, /       | |    |  |    |   \\__/   |    | __,-'    ,' ");
				System.out.println("               ,'        / |    |  |    |          |    | \\     ,-' ");
				System.out.println("        ____,-'        ,'  |____|  |    |          |    |  \\_,-' ");
				System.out.println("        \\            ,'            |____|          |____| ");
				System.out.println("         \\       _,-' ");
				System.out.println("          \\___,-' ");


			}
			else if (videogamechoice.equals("pokemon")) {
				System.out.println("You have selected the Pokemon exibit!");
				System.out.println("                                  ,'\\ ");
				System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____ ");
				System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`. ");
				System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  | ");
				System.out.println(" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  | ");
				System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  | ");
				System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     | ");
				System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    | ");
				System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   | ");
				System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   | ");
				System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   | ");
				System.out.println("                                `'                            '-._| ");

			}
			else if (videogamechoice.equals("legend of zelda")) {
				System.out.println("You have selected the Legend of Zelda exibit!");
				System.out.println("                                               : ");
				System.out.println("                                              :: ");
				System.out.println("                                             :: ");
				System.out.println("                                             :: ");
				System.out.println("                                            :: ");
				System.out.println("                                            :: ");
				System.out.println("                              __           :: ");
				System.out.println("   _..-'/-¯¯--/_          ,.--. ''.     |`\\\\=,.. ");
				System.out.println("-:--.---''-..  /_         |\\_\\..  \\    `-.=._/ ");
				System.out.println(".-|¯         '.  \\         \\_ \\-`/\\ |    ::` ");
				System.out.println("  /  @  \\      \\  -_   _..--|-\\¯¯``'--.-/_\\ ");
				System.out.println("  |   .-'|      \\  \\-'\\_/     ¯/-.|-.\\_\\_/ ");
				System.out.println("  \\_./` /        \\_//-''/    .-' ");
				System.out.println("       |           '-/'@====/              _.--. ");
				System.out.println("   __.'             /¯¯'-. \\-'.          _/   /¯' ");
				System.out.println(".''____|   /       |'--\\__\\/-._        .'    | ");
				System.out.println(" \\ \\_. \\  |       _| -/        \\-.__  /     / ");
				System.out.println("  \\__\\ '/   _.  ('-..| /       '_  ''   _.' ");
				System.out.println("        /  .'     ¯¯¯¯ /        | ``'--'' ");
				System.out.println("       (  / ¯```¯¯¯¯¯|-|        | ");
				System.out.println("        \\ \\_.         \\ \\      / ");
				System.out.println("         \\___\\         '.'.   / ");
				System.out.println("                         /    | ");
				System.out.println("                        /   .' ");
				System.out.println("                       /  .' | ");
				System.out.println("                     .'  / \\  \\ ");
				System.out.println("                    /___| /___' ");
				

			}
			else {
				System.out.println("Invalid input. Please try again.");
			}

		}
		else if (choice.equals(cartoon)) {
			System.out.println("You have selected the Cartoons exibit!");
			System.out.println("Please select a cartoon to view.");
			System.out.println("1. South Park");
			System.out.println("2. the Simpsons");
			System.out.println("3. Beavis and Butthead");
			String cartoonchoice = sc.nextLine();
			if(cartoonchoice.equals("south park")) {
				System.out.println("You have selected the South Park exibit!");
				System.out.println("         _          __________                              _,");
System.out.println("     _.-(_)._     .\"          \".      .--\"\"--.          _.-{__}-._");
System.out.println("   .'________'.   | .--------. |    .'        '.      .:-'`____`'-:.");
System.out.println("  [____________] /` |________| `\\  /   .'``'.   \\    /_.-\"`_  _`\"-._\\");
System.out.println("  /  / .\\/. \\  \\|  / / .\\/. \\ \\  ||  .'/.\\/.\\'.  |  /`   / .\\/. \\   `\\");
System.out.println("  |  \\__/\\__/  |\\_/  \\__/\\__/  \\_/|  : |_\\/\\_| ;  |  |    \\__/\\__/    |");
System.out.println("  \\            /  \\            /   \\ '.\\    /.' / .-\\                /-.");
System.out.println("  /'._  --  _.'\\  /'._  --  _.'\\   /'. `'--'` .'\\/   '._-.__--__.-_.'   \\");
System.out.println(" /_   `\"\"\"\"`   _\\/_   `\"\"\"\"`   _\\ /_  `-./\\.-'  _\\'.    `\"\"\"\"\"\"\"\"`    .'`\\");
System.out.println("(__/    '|    \\ _)_|           |_)_/            \\__)|        '       |   |");
System.out.println("  |_____'|_____|   \\__________/   |              |;`_________'________`;-'");
System.out.println("jgs'----------'    '----------'   '--------------'`--------------------`");
System.out.println("     S T A N          K Y L E        K E N N Y         C A R T M A N");
			}

				else if (cartoonchoice.equals("the simpsons")) {
					System.out.println("You have selected the Simpsons exibit!");
					System.out.println("   ___  _____    ");
					System.out.println(" .'/,-Y\"     \"~-.  ");
					System.out.println(" l.Y             ^.           ");
					System.out.println(" /\\               _\\_      \"Doh!\"   ");
					System.out.println("i            ___/\"   \"\\ ");
					System.out.println("|          /\"   \"\\   o !   ");
					System.out.println("l         ]     o !__./   ");
					System.out.println(" \\ _  _    \\.___./    \"~\\  ");
					System.out.println("  X \\/ \\            ___./  ");
					System.out.println(" ( \\ ___.   _..--~~\"   ~`-.  ");
					System.out.println("  ` Z,--   /               \\    ");
					System.out.println("    \\__.  (   /       ______) ");
					System.out.println("      \\   l  /-----~~\" /      -Row");
					System.out.println("       Y   \\          / ");
					System.out.println("       |    \"x______.^ ");
					System.out.println("       |           \\    ");
					System.out.println("       j            Y");
					
				}
				else if (cartoonchoice.equals("beavis and butthead")) {
					System.out.println("You have selected the Beavis and Butthead exibit!");
					System.out.println("       .------..");
					System.out.println("     -          -");
					System.out.println("   /              \\");
					System.out.println(" /                   \\");
					System.out.println("/    .--._    .---.   |");
					System.out.println("|  /      -__-     \\   |");
					System.out.println("| |                 |  |");
					System.out.println(" ||     ._   _.      ||");
					System.out.println(" ||      o   o       ||");
					System.out.println(" ||      _  |_      ||");
					System.out.println(" C|     (o\\_/o)     |O     Uhhh, this computer");
					System.out.println("  \\      _____      /       is like, busted or");
					System.out.println("    \\ ( /#####\\ ) /       something. So go away.");
					System.out.println("     \\  `====='  /");
					System.out.println("      \\  -___-  /");
					System.out.println("       |       |");
					System.out.println("       /-_____-\\");
					System.out.println("     /           \\");
					System.out.println("   /               \\");
					System.out.println("  /__|  AC / DC  |__\\");
					System.out.println("  | ||           |\\ \\");

					
				}
				else {
					System.out.println("Invalid input. Please try again.");
				}
		}
		else {
			System.out.println("Invalid input. Please try again.");
		}


		
		
	}
}
