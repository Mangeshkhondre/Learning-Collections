import java.util.Vector;
import java.util.Enumeration;
class Enum1
{
	public static void main(String ar[])
	{
		Vector v = new Vector();
		
		for(int i=1;i<=10;i++)
			v.addElement(i);
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+" ");
		
	}
}