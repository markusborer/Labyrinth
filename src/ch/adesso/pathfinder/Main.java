package ch.adesso.pathfinder;

public class Main {

	public static void main(String[] args) {
		try {
			PathFinder pathFinder = new PathFinder();
			pathFinder.findPath(new PathFinderLogicRandom());
			//pathFinder.findPath(new PathFinderLogicHand());
			//pathFinder.findPath(new PathFinderLogicPledge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
