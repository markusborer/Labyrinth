package ch.adesso.pathfinder;

public class Labyrinth {

	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	public static final char BORDER_CHARACTER = 'X';
	public static final char START_CHARACTER = 'S';
	public static final char END_CHARACTER = 'E';
	public static final String LABYRINTH = 
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X   XXXXXXXX                                                 X                                     X"+
	"X   X      X                                                 X                                     X"+
	"X   X      X                                                 X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X   X      X     XXXXXXXXXXXXXXXXXXXXXXXXX                   X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                 X                         X                                     X"+
	"X   X            X                 X                         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     X"+
	"X   X            X                 X                         X                                     X"+
	"X                X                 X                         X                                     X"+
	"X                X                 X       XXXXXXXXXXXXXXXXXXX                                     E"+
	"X                X                 X                         X                                     X"+
	"X                X     X           X                         X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                      X           X              X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      X"+
	"X                      XXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X   XXXXXXXX                                                 X                                     X"+
	"X   X      X                                                 X                                     X"+
	"X   X      X                                                 X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X   X      X     XXXXXXXXXXXXXXXXXXXXXXXXX                   X                                     X"+
	"XS  X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                 X                         X                                     X"+
	"X   X            X                 X                         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     X"+
	"X   X            X                 X                         X                                     X"+
	"X                X                 X                         X                                     X"+
	"X                X                 X       XXXXXXXXXXXXXXXXXXX                                     X"+
	"X                X                 X                         X                                     X"+
	"X                X     X           X                         X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                      X           X              X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      X"+
	"X                      XXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X                                                 X                                                X"+
	"X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"X   XXXXXXXX                                                 X                                     X"+
	"X   X      X                                                 X                                     X"+
	"X   X      X                                                 X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X   X      X     XXXXXXXXXXXXXXXXXXXXXXXXX                   X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                                           X                                     X"+
	"X   X      X     X                 X                         X                                     X"+
	"X   X            X                 X                         XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     X"+
	"X   X            X                 X                         X                                     X"+
	"X                X                 X                         X                                     X"+
	"X                X                 X       XXXXXXXXXXXXXXXXXXX                                     X"+
	"X                X                 X                         X                                     X"+
	"X                X     X           X                         X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+
	"X                X     X           X              X          X                                     X"+
	"X                X     X           X              X          X                                     X"+
	"X                      X           X              X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          X                                     X"+
	"X                      X                          X          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      X"+
	"X                      XXXXXXXXXXXXXXXXXXXXXXXXXXXX          X                                     X"+
	"X                                                            X                                     X"+
	"X                                                            X                                     X"+
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final String LABYRINTH_1 =
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
	"X           X   X         X         X             X        X         X         X             X     X" +
	"XXXXX XXXXX X X X XXXXXXX X XXXXXXX X XXX XXXXXXX X XXX XX X XXXXXXX X XXXXXXX X XXX XXXXXXX X XXX X" +
	"X   X     X X X X   X   X X   X   X X   X       X   X X  X X   X   X X   X   X X   X       X   X X X" +
	"X XXXXX XXX X X XXX X XXX XXX X X X XXX XXXXXXX XXXXX XX X XXX X XXX XXX X X X XXX XXXXXXX XXXXX X X" +
	"X X     X   X X     X X     X X X X X   X   X X     X    X     X X     X X X X X   X   X X     X   X" +
	"X X XXXXX XXX XXXXXXX X XXX X XXX X X XXX X X XXXXX XXX XXXXXXXX X XXX X XXX X X XXX X X XXXXX XXX X" +
	"X X X   X     X       X X   X     X   X   X   X   X   X  X       X X   X     X   X   X   X   X   X X" +
	"X X X XXXXXXXXX XXXXX X X XXXXXXX XXXXX X X XXX X XXX XXXX XXXXX X X XXXXXXX XXXXX X X XXX X XXX XXX" +
	"X X X         X   X X X X   X   X X   X X X X   X   X    X   X X X X   X   X X   X X X X   X   X   X" +
	"X X XXX X XXX X X X X X X XXX X X X X X X XXX XXXXX XXX XX X X X X X XXX X X X X X X XXX XXXXX XXX X" +
	"X X   X X X X X X X   X X X   X X X X   X   X X   X   X  X X X   X X X   X X X X   X   X X   X   X X" +
	"X XXX XXX X X XXX XXXXX XXX XXX X XXXXXXXXX X X X XXX XX XXX XXXXX XXX XXX X XXXXXXXXX X X X XXX X X" +
	"X   X X   X       X   X X   X   X X         X X X   X X      X   X X   X   X X         X X X   X X X" +
	"XXX X X X XXXXXXXXX X X X XXX XXX X XXXXX XXX X XXX X X XXXXXX X X X XXX XXX X XXXXX XXX X XXX X X X" +
	"X X X   X X     X   X   X   X   X   X     X   X   X   X    X   X   X   X   X   X     X   X   X   X X" +
	"X X XXX XXX XXX X XXXXX XXX XXX XXXXX XXXXX XXXXX XXXXX XX X XXXXX XXX XXX XXXXX XXXXX XXXXX XXXXX X" +
	"X X   X X   X X X X   X X     X     X X     X X   X      X X X   X X     X     X X     X X   X     X" +
	"X XXX XXX XXX X X XXX X X XXXXXXX XXX X XXXXX X XXX XXXX X X XXX X X XXXXXXX XXX X XXXXX X XXX XXX X" +
	"X   X X   X   X X   X   X X X   X   X X     X   X   X    X X   X   X X X   X   X X     X   X   X   X" +
	"XXX X X XXX X X XXX XXXXX X X X XXX X XXXXX X XXX X XXX XX XXX XXXXX X X X XXX X XXXXX X XXX X XXX X" +
	"X   X X X X X   X   X   X   X X   X   X     X X   X   X    X   X   X   X X   X   X     X X   X   X X" +
	"X X X X X X XXXXX XXX X X XXX XXX XXXXX XXXXX X XXXXX X XXXX XXX X X XXX XXX XXXXX XXXXX X XXXXX X X" +
	"X X X   X X X         X   X   X X       X   X X   X   X          X   X   X X       X   X X   X   X X" +
	"X XXXXXXX X X XXXXXXXXXXXXX XXX XXXXXXXXX XXX XXXXX XXXX XXXXXXXXXXXXX XXX XXXXXXXXX XXX XXXXX XXXXX" +
	"X         X X       X   X   X           X X   X   X            X   X   X           X X   X   X     X" +
	"X XXXXX XXX XXXXXXX XXX X XXX XXXXX XXX X X XXX X XXXXX XXXXXX XXX X XXX XXXXX XXX X X XXX X XXXXX X" +
	"X X   X     X   X   X   X X       X   X   X     X          X   X   X X       X   X   X     X       X" +
	"X X X XXXXXXX X X XXX X X XXXXXXX XXX XXX XXXXXXXXXXXXXX X X XXX X X XXXXXXX XXX XXX XXXXXXXXXXXXX X" +
	"X X X X   X   X       X X     X   X   X     X         X  X       X X     X   X   X     X         X X" +
	"X XXX X X X XXXXXXXXXXXXXXXXX X XXX XXXXXXX X XXX XXXXX XXXXXXXXXXXXXXXX X XXX XXXXXXX X XXX XXXXX X" +
	"X   X   X X     X         X   X X X     X   X   X X   X    X         X   X X X     X   X   X X   X X" +
	"XXX X XXX XXXXX X XXXXXXX X XXX X XXXXX XXXXX XXX X X X XX X XXXXXXX X XXX X XXXXX XXXXX XXX X X X X" +
	"X   X X       X X       X X   X X     X       X   X X    X X       X X   X X     X       X   X X   X" +
	"X XXX X XXXXXXX XXXXXXX X X X X XXX X XXXXXXXXX XXX XXXXXX XXXXXXX X X X X XXX X XXXXXXXXX XXX XXXXX" +
	"X X   X X       X X   X X X X X     X X     X X     X      X X   X X X X X     X X     X X     X   X" +
	"X XXXXX X XXXXXXX X X X X XXX XXXXXXX X XXX X XXXXXXX X XXXX X X X X XXX XXXXXXX X XXX X XXXXXXX X X" +
	"X     X X     X   X X   X X   X     X   X X X         X X    X X   X X   X     X   X X X         X X" +
	"XXXXX X XXXXX X XXX XXXXX X XXXXX X XXXXX X XXXXX X XXX XX XXX XXXXX X XXXXX X XXXXX X XXXXX X XXX X" +
	"X   X X   X     X   X X   X X   X X       X     X X X      X   X X   X X   X X       X     X X X   X" +
	"X X X X XXX XXXXX XXX X XXX X X XXX X XXXXXXXXX XXX X XXXXXX XXX X XXX X X XXX X XXXXXXXXX XXX X XXX" +
	"X X X X     X     X     X     X   X X   X     X X   X  X     X     X     X   X X   X     X X   X X X" +
	"X XXX X XXXXX XXXXX XXXXXXX XXXXX XXX X X XXX X X XXX XX XXXXX XXXXXXX XXXXX XXX X X XXX X X XXX X X" +
	"X     X X     X   X       X     X   X X   X   X   X   X  X   X       X     X   X X   X   X   X   X X" +
	"X XXXXX X XXXXX X XXXXXXX XXXXX XXX XXXXXXX XXXXXXX XXX XX X XXXXXXX XXXXX XXX XXXXXXX XXXXXXX XXX X" +
	"X X   X X X X   X       X     X X   X       X       X      X       X     X X   X       X       X   X" +
	"X X X XXX X X XXXXX X XXXXXXX XXX XXX XXXXX X XXXXXXXXXX XXXXX X XXXXXXX XXX XXX XXXXX X XXXXXXXXX X" +
	"X X X     X   X X   X X     X     X       X X   X     X  X X   X X     X     X       X X   X     X X" +
	"X X XXXXXXX XXX X XXXXX XXX XXXXXXX XXXXX X XXX X XXX X XX X XXXXX XXX XXXXXXX XXXXX X XXX X XXX X X" +
	"XSX X         X X       X X       X   X   X   X   X X    X X       X X       X   X   X   X   X X   E" +
	"X X XXXXXXX X X XXXXXXXXX XXXXX XXXXX X XXX XXXXXXX XXXX X XXXXXXXXX XXXXX XXXXX X XXX XXXXXXX XXX X" +
	"X X X     XXX   X         X     X     X X   X          XXX X         X     X     X X   X           X" +
	"X X X XXX X XXX X X X XXXXX XXXXX XXXXX XXXXX XXXXXXXXXX X X X X XXXXX XXXXX XXXXX XXXXX XXXXXXXXXXX" +
	"X X     X X X   X X X X     X     X     X     X       X    X X X X     X     X     X     X       X X" +
	"X X XXXXX X X XXX X X X XXXXX XXXXX XXX X XXXXX XXXXX X XXXX X X X XXXXX XXXXX XXX X XXXXX XXXXX X X" +
	"X X X     X     X X X X X     X   X X X X X     X   X      X X X X X     X   X X X X X     X   X   X" +
	"X XXX XXXXXXXXX XXX X X X XXXXX X X X X X X XXXXX XXXXX XX XXX X X X XXXXX X X X X X X XXXXX XXXXX X" +
	"X X   X     X   X   X X   X     X X X   X X   X   X        X   X X   X     X X X   X X   X   X     X" +
	"X X XXX XXX X XXX X XXXXX XXX X X X XXX X XXX X X X XXXX XXX X XXXXX XXX X X X XXX X XXX X X X XXXXX" +
	"X   X   X X X     X X   X   X X X X   X X     X X X X        X X   X   X X X X   X X     X X X X   X" +
	"XXXXX X X X XXX XXXXX X XXX XXX X XXX XXXXXXXXX X X XXX XX XXXXX X XXX XXX X XXX XXXXXXXXX X X XXX X" +
	"X X   X X   X   X     X   X     X   X X   X     X X   X    X     X   X     X   X X   X     X X   X X" +
	"X X XXX XXX XXXXX X XXXXX XXXXXXXXX X X X X XXX X XXX X XXX  X XXXXX XXXXXXXXX X X X X XXX X XXX X X" +
	"X X   X X X X     X X   X     X     X   X X X X X X   X   X XX X   X     X     X   X X X X X X   X X" +
	"X   X X   X   X X   X X   X X   X X   X   X     X X X   X      X X   X X   X X   X   X     X X X   X" +
	"X X X X XXX XXXXX XXX X XXX X X XXX X XXXXXXXXX XXX X XXX XX XXX X XXX X X XXX X XXXXXXXXX XXX X XXX" +
	"X X X X     X     X     X     X   X X   X     X X   X X      X     X     X   X X   X     X X   X X X" +
	"X XXX X XXXXX XXXXX XXXXXXX XXXXX XXX X X XXX X X XXX X XXXXXX XXXXXXX XXXXX XXX X X XXX X X XXX X X" +
	"X     X X     X   X       X     X   X X   X   X   X   X  X   X       X     X   X X   X   X   X   X X" +
	"X XXXXX X XXXXX X XXXXXXX XXXXX XXX XXXXXXX XXXXXXX XXX XX X XXXXXXX XXXXX XXX XXXXXXX XXXXXXX XXX X" +
	"X X   X X X X   X       X     X X   X       X       X      X       X     X X   X       X       X   X" +
	"X X X XXX X X XXXXX X XXXXXXX XXX XXX XXXXX X XXXXXXXXXX XXXXX X XXXXXXX XXX XXX XXXXX X XXXXXXXXX X" +
	"X X X     X   X X   X X     X     X       X X   X     X  X X   X X     X     X       X X   X     X X" +
	"X X XXXXXXX XXX X XXXXX XXX XXXXXXX XXXXX X XXX X XXX X XX X XXXXX XXX XXXXXXX XXXXX X XXX X XXX X X" +
	"X X X         X X       X X       X   X   X   X   X X    X X       X X       X   X   X   X   X X   X" +
	"X X XXXXXXXXX X XXXXXXXXX XXXXX XXXXX X XXX XXXXXXX XXXX X XXXXXXXXX XXXXX XXXXX X XXX XXXXXXX XXX X" +
	"X X X     X X   X         X     X     X X   X              X         X     X     X X   X           X" +
	"X X X XXX X XXX X X X XXXXX XXXXX XXXXX XXXXX XXXXXXXXXXXX X X X XXXXX XXXXX XXXXX XXXXX XXXXXXXXXXX" +
	"X X     X X X   X X X X     X     X     X     X       X    X X X X     X     X     X     X       X X" +
	"X X XXXXX X X XXX X X X XXXXX XXXXX XXX X XXXXX XXXXX X XXXX X X X XXXXX XXXXX XXX X XXXXX XXXXX X X" +
	"X X X     X     X X X X X     X   X X X X X     X   X      X X X X X     X   X X X X X     X   X   X" +
	"X XXX XXXXXXXXX XXX X X X XXXXX X X X X X X XXXXX XXXXX XX XXX X X X XXXXX X X X X X X XXXXX XXXXX X" +
	"X X   X     X   X   X X   X     X X X   X X   X   X        X   X X   X     X X X   X X   X   X     X" +
	"X X XXX XXX X XXX X XXXXX XXX X X X XXX X XXX X X X XXXX XXX X XXXXX XXX X X X XXX X XXX X X X XXXXX" +
	"X   X   X X X     X X   X   X X X X   X X     X X X X        X X   X   X X X X   X X     X X X X   X" +
	"XXXXX X X X XXX XXXXX X XXX XXX X XXX XXXXXXXXX X X XXX XX XXXXX X XXX XXX X XXX XXXXXXXXX X X XXX X" +
	"X X   X X   X   X     X   X     X   X X   X     X X   X    X     X   X     X   X X   X     X X   X X" +
	"X X XXX XXX XXXXX X XXXXX XXXXXXXXX X X X X XXX X XXX X XXXX X XXXXX XXXXXXXXX X X X X XXX X XXX X X" +
	"X     X   X       X X   X     X     X   X X X X X X   X      X X   X     X     X   X X X X X X   X X" +
	"X XXXXXXX XXXXXXX XXX X XXXXX XXX XXXXXXX X X X XXX XXX XXXX XXX X XXXXX XXX XXXXXXX X X X XXX XXX X" +
	"X   X     X   X   X   X     X   X   X     X X X X   X    X   X   X     X   X   X     X X X X   X   X" +
	"X XXX XXXXX X X XXX XXXXXXX XXX XXXXX XXXXX X X X XXX XX X XXX XXXXXXX XXX XXXXX XXXXX X X X XXX XXX" +
	"X X   X X   X X X X     X X   X       X   X X X X   X    X X X     X X   X       X   X X X X   X   X" +
	"XXX XXX X X XXX X XXXXX X XXX XXXXXXX X X X X X XXX X X XX X XXXXX X XXX XXXXXXX X X X X X XXX X X X" +
	"X   X   X X X         X   X X X       X X   X X   X X X          X   X X X       X X   X X   X X X X" +
	"X XXX XXX X X XXXXXXX XXX X X X XXXXXXX XXXXX XXX X XXXX XXXXXXX XXX X X X XXXXXXX XXXXX XXX X XXX X" +
	"X   X     X   X   X   X   X X X X       X   X   X X   X  X   X   X   X X X X       X   X   X X   X X" +
	"X X XXXXXXXXXXX X XXXXX XXX X XXX XXXXXXX X X X X XXX X XX X XXXXX XXX X XXX XXXXXXX X X X X XXX X X" +
	"X X             X           X             X   X X          X           X             X   X X       X" +
	"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

}
