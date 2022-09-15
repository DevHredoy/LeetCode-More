
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        //THe following code simply prints two hashmaps
        /*Hashtable<Integer,String> ht1=new Hashtable<>();
        Hashtable<Integer,String> ht2=new Hashtable<>();

        //placing values in the table
        ht1.put(1,"One");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        //
        ht2.put(4,"Four");
        ht2.put(5,"Five");
        ht2.put(6,"Six");

        System.out.println("mapping of ht1 : "+ht1);
        System.out.println("mapping of ht2: " +ht2);*/

        //This demonstrates that how Hashmap can be mapped
       /* Map<Integer,String> hMapTable=new HashMap<>();
        hMapTable.put(1,"One");
        hMapTable.put(2,"Two");
        hMapTable.put(3,"Three");

        Hashtable<Integer,String> htable2=new Hashtable<>(hMapTable);
        System.out.println("Mapping of htable2 is : " +htable2);*/



        HashMap<String,Integer> names  =new HashMap<>();
        names.put("Vishal",10);
        names.put("anand",44);
        names.put("Shahriar",55);

        System.out.println(names.size());
        System.out.println(names);

        if(names.containsKey("anand"))
        {    names.put("anand",66);
            Integer value=names.get("anand");

            System.out.println("the value for this key is : "+value);

        }


    }

}
