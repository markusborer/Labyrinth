package ch.adesso.pathfinder;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/*
Die Hand-Methode ist die bekannteste Regel, einen Irrgarten zu durchqueren.
Man legt einfach seine rechte oder linke Hand an eine Wand des Irrgartens und hält dann beim Durchlaufen ständigen Kontakt.
Falls alle Mauern zusammenhängen oder mit der Außenseite verbunden sind – das heißt, der Irrgarten ist „einfach zusammenhängend“ –, garantiert die Hand-Methode,
dass man entweder einen anderen Ausgang erreicht, oder wieder zum Eingang zurückkehrt.
*/
public class PathFinderLogicHand implements PathFinderLogic {

	@Override
	public DIRECTION getNewDirection(int[][] labyrinth, Point position, DIRECTION oldDirection) {
		List<DIRECTION> checkOrder = new ArrayList<>();
		switch (oldDirection) {
			case RIGHT:
				checkOrder.add(DIRECTION.UP);
				checkOrder.add(DIRECTION.RIGHT);
				checkOrder.add(DIRECTION.DOWN);
				checkOrder.add(DIRECTION.LEFT);
				break;
			case LEFT:
				checkOrder.add(DIRECTION.DOWN);
				checkOrder.add(DIRECTION.LEFT);
				checkOrder.add(DIRECTION.UP);
				checkOrder.add(DIRECTION.RIGHT);
				break;
			case UP:
				checkOrder.add(DIRECTION.LEFT);
				checkOrder.add(DIRECTION.UP);
				checkOrder.add(DIRECTION.RIGHT);
				checkOrder.add(DIRECTION.DOWN);
				break;
			case DOWN:
				checkOrder.add(DIRECTION.RIGHT);
				checkOrder.add(DIRECTION.DOWN);
				checkOrder.add(DIRECTION.LEFT);
				checkOrder.add(DIRECTION.UP);
				break;
		}
		return getNewDirection(labyrinth, position, checkOrder);
	}

	private DIRECTION getNewDirection(int[][] labyrinth, Point position, List<DIRECTION> checkDirectionOrder) {
		for (DIRECTION checkDirection : checkDirectionOrder) {
			int newPosition = getNewPosition(labyrinth, position, checkDirection);
			if (newPosition == PathFinder.EMPTY) {
				return checkDirection;
			}
		}
		return null;
	}

}
