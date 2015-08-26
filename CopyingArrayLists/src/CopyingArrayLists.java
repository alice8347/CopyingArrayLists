import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {
	public static void main (String[] args)
	{
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for (int index = 0; index < 10; index++) {
			int i = 1 + r.nextInt(100);
			arrayList1.add(i);
		}
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrayList1);
		
		arrayList1.remove(9);
		arrayList1.add(-7);
		
		System.out.println("ArrayList 1: " + arrayList1.toString());
		System.out.println("ArrayList 2: " + arrayList2.toString());
	}
}
