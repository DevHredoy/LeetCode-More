import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class IteratorDemo {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(asList());
        Iterator i= names.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }




    }
}
