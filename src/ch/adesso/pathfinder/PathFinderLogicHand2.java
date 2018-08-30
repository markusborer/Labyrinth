package ch.adesso.pathfinder;

import static ch.adesso.pathfinder.PathFinderLogic.DIRECTION.*;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

/*
 Die Hand-Methode ist die bekannteste Regel, einen Irrgarten zu durchqueren.
 Man legt einfach seine rechte oder linke Hand an eine Wand des Irrgartens und hält dann beim Durchlaufen ständigen Kontakt.
 Falls alle Mauern zusammenhängen oder mit der Außenseite verbunden sind – das heißt, der Irrgarten ist „einfach zusammenhängend“ –, garantiert die Hand-Methode,
 dass man entweder einen anderen Ausgang erreicht, oder wieder zum Eingang zurückkehrt.
 */
public class PathFinderLogicHand2 implements PathFinderLogic {

	private Map<DIRECTION, Integer> directionMap = new HashMap<>();

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		directionMap.put(UP, labyrinth[position.x][position.y - 1]);
		directionMap.put(RIGHT, labyrinth[position.x + 1][position.y]);
		directionMap.put(DOWN, labyrinth[position.x][position.y + 1]);
		directionMap.put(LEFT, labyrinth[position.x - 1][position.y]);
		switch (oldDirection) {
			case RIGHT:
				return getNewDirection(UP, RIGHT, DOWN, LEFT);
			case DOWN:
				return getNewDirection(RIGHT, DOWN, LEFT, UP);
			case LEFT:
				return getNewDirection(DOWN, LEFT, UP, RIGHT);
			case UP:
				return getNewDirection(LEFT, UP, RIGHT, DOWN);
			default:
				return null;
		}
	}

	private DIRECTION getNewDirection(DIRECTION... directions) {
		for (DIRECTION direction : directions) {
			if (directionMap.get(direction).intValue() == PathFinder.EMPTY) {
				return direction;
			}
		}
		return null;
	}

}
