package amrib.cleancode.generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		list.add(5);
		list.add(7);

		System.out.println("*****************");
		GenericList<Integer> intList = new GenericList<Integer>();
		intList.add(5);
		intList.add(4);
		Integer item1 = intList.get(1);
		System.out.println(item1);

		System.out.println("*****************");
		GenericList<Double> stringList = new GenericList<Double>();
		stringList.add(12.3);
		stringList.add(5.3);
		System.out.println(stringList.get(0));

		System.out.println("******************");
		GenericList<User> userList = new GenericList<User>();
		userList.add(new User(10));

		System.out.println("******************");
		User user1 = new User(10);
		User user2 = new User(20);
		if (user1.compareTo(user2) > 0)
			System.out.println("user1 > user2");
		else if (user1.compareTo(user2) < 0)
			System.out.println("user1 < user2");
		else
			System.out.println("user1 == user2");

		System.out.println("*******************");
		System.out.println(Utils.max(5, 10));
		System.out.println(Utils.max(new User(10), new User(20)));
		Utils.print(1, "John");
		Utils.print(2, 12);

		System.out.println("*******************");
		GenericList<Instructor> instructor = new GenericList<>();
		GenericList<User> user = new GenericList<User>();
		// Utils.printUsers(instructor);
	}

}
