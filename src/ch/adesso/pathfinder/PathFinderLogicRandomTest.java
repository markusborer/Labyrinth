package ch.adesso.pathfinder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.Point;
import java.util.Random;

import org.junit.Test;

import ch.adesso.pathfinder.PathFinderLogic.DIRECTION;

public class PathFinderLogicRandomTest {

	@Test
	public void getNewDirection_Right_Right() {
		String labyrinth =
			"XXX" +
			"S  " +
			"XXX";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth));
	}

	@Test
	public void getNewDirection_Right_Up() {
		String labyrinth =
			"X X" +
			"S X" +
			"XXX";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth));
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
	public void getNewDirection_Right_RandomUp() {
		String labyrinth =
			"X X" +
			"S  " +
			"X X";
		assertEquals(DIRECTION.UP, getNewDirection(labyrinth, 0));
	}

	@Test
	public void getNewDirection_Right_RandomRight() {
		String labyrinth =
			"X X" +
			"S  " +
			"X X";
		assertEquals(DIRECTION.RIGHT, getNewDirection(labyrinth, 1));
	}

	@Test
	public void getNewDirection_Right_RandomDown() {
		String labyrinth =
			"X X" +
			"S  " +
			"X X";
		assertEquals(DIRECTION.DOWN, getNewDirection(labyrinth, 2));
	}

	private DIRECTION getNewDirection(String labyrinthString) {
		PathFinderLogicRandom pathFinder = new PathFinderLogicRandom();
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

	private DIRECTION getNewDirection(String labyrinthString, int randomResult) {
		PathFinderLogicRandom pathFinder = new PathFinderLogicRandom();
		Random random = mock(Random.class);
		when(random.nextInt(3)).thenReturn(randomResult);
		pathFinder.random = random;
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

}
