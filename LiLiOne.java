import java.util.*;
class LiLiOne 
{
	public static void main(String[] args) 
	{
		LinkedList<String> la = new LinkedList<String>();
		la.add("Z");
		la.add("Y");
		la.add("X");
		la.add("W");
		System.out.println(la);
		la.addFirst("A1");
		la.addLast("B1");
		System.out.println(la);
		la.add("Raghu");
		la.add(3, "Ram");
		System.out.println(la);
		la.remove(4);
		la.remove("Ram");
		System.out.println(la);

		System.out.println(la.isEmpty());
		la.clear();
		System.out.println(la.isEmpty());
		System.out.println(la);


	}
}
