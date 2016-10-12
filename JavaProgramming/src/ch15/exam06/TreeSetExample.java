package ch15.exam06;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet1 = new TreeSet<>();
		treeSet1.add(new Person("성기문",25));
		treeSet1.add(new Person("기문",24));
		treeSet1.add(new Person("문",23));
		System.out.println(treeSet1.toString());
		for (Person person : treeSet1) {
			System.out.print(person+", ");
		}
		
		System.out.println("\n");
			
		TreeSet<Fruit> treeSet2 = new TreeSet<>(new FruitComparator());
		treeSet2.add(new Fruit("pare",4000));
		treeSet2.add(new Fruit("apple",3000));
		treeSet2.add(new Fruit("soju",5000));
		
		System.out.println(treeSet2.toString());
		
		for (Fruit fruit : treeSet2) {
			System.out.print(fruit+", ");
		}
	}
}
