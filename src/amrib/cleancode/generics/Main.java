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
		GenericList<String> stringList = new GenericList<String>();
		stringList.add("aaa");
		stringList.add("bbb");
		System.out.println(stringList.get(0));
	}

}
