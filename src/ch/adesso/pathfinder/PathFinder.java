package ch.adesso.pathfinder;

import java.awt.Point;

import javax.swing.WindowConstants;

import ch.adesso.pathfinder.PathFinderLogic.DIRECTION;

public class PathFinder {

	public static final int EMPTY = 0;
	public static final int BORDER = 1;
	private static final int[] EMPTY_COLOR = new int[] { 0xFF, 0xFF, 0xFF };
	private static final int[] BORDER_COLOR = new int[] { 0x00, 0x00, 0x00 };
	private static final int[] START_COLOR = new int[] { 0x00, 0x00, 0xFF };
	private static final int[] END_COLOR = new int[] { 0xFF, 0x00, 0x00 };
	private static final int[] LINE_COLOR = new int[] { 0x00, 0xFF, 0x00 };

	private Window window;
	private int[][] labyrinth;
	private Point start;
	private Point end;

	public PathFinder() {
		initWindow();
		initLabyrinth();
	}

	private void initWindow() {
		this.window = new Window(Labyrinth.WIDTH, Labyrinth.HEIGHT);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	private void initLabyrinth() {
		labyrinth = new int[Labyrinth.WIDTH][Labyrinth.HEIGHT];
		for (int x = 0; x < Labyrinth.WIDTH; x++) {
			for (int y = 0; y < Labyrinth.HEIGHT; y++) {
				char character = Labyrinth.LABYRINTH.charAt(x + y * Labyrinth.WIDTH);
				if (character == Labyrinth.START_CHARACTER) {
					start = new Point(x, y);
					labyrinth[x][y] = EMPTY;
					window.setColor(x, y, START_COLOR);
				} else if (character == Labyrinth.END_CHARACTER) {
					end = new Point(x, y);
					labyrinth[x][y] = EMPTY;
					window.setColor(x, y, END_COLOR);
				} else if (character == Labyrinth.BORDER_CHARACTER) {
					labyrinth[x][y] = BORDER;
					window.setColor(x, y, BORDER_COLOR);
				} else {
					labyrinth[x][y] = EMPTY;
					window.setColor(x, y, EMPTY_COLOR);
				}
			}
		}
		window.repaint();
	}

	public void findPath(PathFinderLogic pathFinderLogic) {
		DIRECTION direction = DIRECTION.RIGHT;
		Point position = new Point(start);
		do {
			direction = pathFinderLogic.getNewDirection(labyrinth, position, direction);
			setNewPosition(position, direction);
			window.setColor(position.x, position.y, LINE_COLOR);
			window.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		} while (!position.equals(end));
	}

	private void setNewPosition(Point position, DIRECTION direction) {
		switch (direction) {
			case RIGHT:
				position.x = position.x + 1;
				break;
			case LEFT:
				position.x = position.x - 1;
				break;
			case UP:
				position.y = position.y - 1;
				break;
			case DOWN:
				position.y = position.y + 1;
				break;
		}
	}

}