import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashMap1
{
    public static void main(String args[])
    {
        Map<String,Integer> m=new HashMap<String,Integer>();
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        System.out.println("Hashmap - "+m);        

        // Set of keys,values,mappings
        System.out.println("keys - "+m.keySet());
        System.out.println("values - "+m.values());
        System.out.println("mapping- "+m.entrySet());

        // Using Iterator
        Iterator<String> itr=m.keySet().iterator();
        System.out.print("keys - ");
        while(itr.hasNext())
        {
            System.out.print(itr.next()+",");
        }
        System.out.println();
        System.out.print("Entriies - ");
        Iterator<Entry<String, Integer>> iterate1 = m.entrySet().iterator();
        while(iterate1.hasNext())
        {
            System.out.print(iterate1.next()+", ");
        }
        System.out.println();



        System.out.println(m.containsKey("one"));
        System.out.println(m.containsValue(5));
        System.out.println(m.size());


        //  merge()
        // The merge() method associates the specified value to the specified key
        //  if the specified key is not already associated.
        //  if the specified key is already associated with a value, 
        //  it will merge the new specified value with the existing old value.        

        m.merge("four",4,(oldValue,newValue) -> oldValue+newValue);
        System.out.println("Hashmap - "+m); 
        m.merge("four",4,(oldValue,newValue) -> oldValue+newValue);
        System.out.println("Hashmap - "+m); 

        //  compute()
        // m.compute("five",(key,value) -> value*100);  as five is not present => exception
        m.compute("first",(key,value) -> value*100);
        System.out.println("Hashmap - "+m);
    }
}