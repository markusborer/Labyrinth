package ch.adesso.pathfinder;

import java.awt.Point;
import java.util.Random;

/*
Diese triviale Methode kann sogar von einem sehr einfachen Roboter durchgeführt werden.
Sie besteht einfach darin, so lange geradeaus zu gehen, bis man eine Kreuzung erreicht.
Dort entscheidet man sich zufällig für eine Richtung, in die man weitergeht.
Weil man bei dieser Methode Wege möglicherweise mehrmals beschreitet, dauert es im Allgemeinen sehr lange, bis man zum Ausgang kommt.
Dennoch erreicht man diesen immer.
 */
public class PathFinderLogicRandom implements PathFinderLogic {

	public Random random = new Random();

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		DIRECTION left = oldDirection;
		DIRECTION forward = oldDirection;
		DIRECTION right = oldDirection;
		DIRECTION backward = oldDirection;
		switch (oldDirection) {
			case RIGHT:
				left = DIRECTION.UP;
				forward = DIRECTION.RIGHT;
				right = DIRECTION.DOWN;
				backward = DIRECTION.LEFT;
				break;
			case LEFT:
				left = DIRECTION.DOWN;
				forward = DIRECTION.LEFT;
				right = DIRECTION.UP;
				backward = DIRECTION.RIGHT;
				break;
			case UP:
				left = DIRECTION.LEFT;
				forward = DIRECTION.UP;
				right = DIRECTION.RIGHT;
				backward = DIRECTION.DOWN;
				break;
			case DOWN:
				left = DIRECTION.RIGHT;
				forward = DIRECTION.DOWN;
				right = DIRECTION.LEFT;
				backward = DIRECTION.UP;
				break;
		}
		boolean leftIsEmpty = getNewPosition(labyrinth, position, left) == PathFinder.EMPTY;
		boolean forwardIsEmpty = getNewPosition(labyrinth, position, forward) == PathFinder.EMPTY;
		boolean rightIsEmpty = getNewPosition(labyrinth, position, right) == PathFinder.EMPTY;
		if (!leftIsEmpty && !forwardIsEmpty && !rightIsEmpty) {
			return backward;
		}
		if (!leftIsEmpty && forwardIsEmpty && !rightIsEmpty) {
			return forward;
		}
		while (true) {
			int randomDirection = random.nextInt(3);
			if (randomDirection == 0 && leftIsEmpty) {
				return left;
			}
			if (randomDirection == 1 && forwardIsEmpty) {
				return forward;
			}
			if (randomDirection == 2 && rightIsEmpty) {
				return right;
			}
		}
	}

}
