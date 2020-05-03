import java.util.HashSet;
import java.util.Arrays;
class HashSet1
{
	public static void main(String args[])
	{
		HashSet<String> hs1=new HashSet<>();
		HashSet<String> hs2=new HashSet<>();
		hs1.add(Integer.toString(1));
		hs1.add("A");
		hs1.add("B");
		hs1.add("b");
		hs1.add("a");
		
		System.out.println(hs1);
		
		System.out.println(hs1.isEmpty());
		System.out.println(hs1.size());
		System.out.println(hs1.contains(5));
		
		hs2=(HashSet)hs1.clone();
		System.out.println("hs2 = "+hs2);
		hs1.remove("b");
		System.out.println(hs1);
		hs1.clear();
		System.out.println(hs1);
		
		// convert hashset to array 
		String[] ar1=new String[hs2.size()];
		hs2.toArray(ar1);
		System.out.println(Arrays.toString(ar1));
		
	}
}