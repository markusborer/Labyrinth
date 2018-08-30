package ch.adesso.pathfinder;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import ch.adesso.pathfinder.PathFinderLogic.DIRECTION;

public class PathFinderLogicHandTest {

	@Test
	public void getNewDirection_Right_Up() {
		String labyrinth =
				"X X" + 
				"S  " + 
				"X X";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Right_Right() {
		String labyrinth =
				"XXX" + 
				"S  " + 
				"X X";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Right_Down() {
		String labyrinth =
				"XXX" + 
				"S X" + 
				"X X";
		assertEquals(DIRECTION.DOWN, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Right_Left() {
		String labyrinth =
				"XXX" + 
				"S X" + 
				"XXX";
		assertEquals(DIRECTION.LEFT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Down_Right() {
		String labyrinth =
				"XSX" + 
				"   " + 
				"X X";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Down_Down() {
		String labyrinth =
				"XSX" + 
				"  X" + 
				"X X";
		assertEquals(DIRECTION.DOWN, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Down_Left() {
		String labyrinth =
				"XSX" + 
				"  X" + 
				"XXX";
		assertEquals(DIRECTION.LEFT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Down_Up() {
		String labyrinth =
				"XSX" + 
				"X X" + 
				"XXX";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Left_Down() {
		String labyrinth =
				"X X" + 
				"  S" + 
				"X X";
		assertEquals(DIRECTION.DOWN, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Left_Left() {
		String labyrinth =
				"X X" + 
				"  S" + 
				"XXX";
		assertEquals(DIRECTION.LEFT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Left_Up() {
		String labyrinth =
				"X X" + 
				"X S" + 
				"XXX";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Left_Right() {
		String labyrinth =
				"XXX" + 
				"X S" + 
				"XXX";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Up_Left() {
		String labyrinth =
				"X X" + 
				"   " + 
				"XSX";
		assertEquals(DIRECTION.LEFT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Up_Up() {
		String labyrinth =
				"X X" + 
				"X  " + 
				"XSX";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Up_Right() {
		String labyrinth =
				"XXX" + 
				"X  " + 
				"XSX";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Up_Down() {
		String labyrinth =
				"XXX" + 
				"X X" + 
				"XSX";
		assertEquals(DIRECTION.DOWN, getNewDirection(labyrinth));
	}

	private DIRECTION getNewDirection(String labyrinthString) {
		int[][] labyrinth = buildLabyrinth(labyrinthString);
		PathFinderLogicHand pathFinder = new PathFinderLogicHand();
		Point position = new Point(1, 1);
		DIRECTION oldDirection = null;
		if (labyrinthString.charAt(1) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.DOWN;
		} else if (labyrinthString.charAt(3) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.RIGHT;
		} else if (labyrinthString.charAt(5) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.LEFT;
		} else if (labyrinthString.charAt(7) == Labyrinth.START_CHARACTER) {
			oldDirection = DIRECTION.UP;
		}
		return pathFinder.getNewDirection(labyrinth, position , oldDirection);
	}

	private int[][] buildLabyrinth(String labyrinthString) {
		int[][] labyrinth = new int[3][3];
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				char character = labyrinthString.charAt(x + y * 3);
				if (character == Labyrinth.BORDER_CHARACTER) {
					labyrinth[x][y] = PathFinder.BORDER;
				} else {
					labyrinth[x][y] = PathFinder.EMPTY;
				}
			}
		}
		return labyrinth;
	}

}
