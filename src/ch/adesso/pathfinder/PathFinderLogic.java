package ch.adesso.pathfinder;

import java.awt.Point;

public interface PathFinderLogic {

	enum DIRECTION {
		RIGHT, LEFT, UP, DOWN
	}

	DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection);

	default int getNewPosition(int[][] labyrinth, Point position, DIRECTION direction) {
		int newPosition = 0;
		switch (direction) {
			case RIGHT:
				newPosition = labyrinth[position.x + 1][position.y];
				break;
			case LEFT:
				newPosition = labyrinth[position.x - 1][position.y];
				break;
			case UP:
				newPosition = labyrinth[position.x][position.y - 1];
				break;
			case DOWN:
				newPosition = labyrinth[position.x][position.y + 1];
				break;
		}
		return newPosition;
	}
	
}
