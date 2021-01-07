package amrib.cleancode.generics;

public class User implements Comparable<User> {

	private int points;

	public User(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(User other) {
		// TODO Auto-generated method stub
		return points - other.points;
	}

}
