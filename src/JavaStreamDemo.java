
// in java 8 Stream is a class which have been made to save lines of codes
// we are going to see some demo of stream in this session

import java.util.ArrayList;
import java.util.List;

public class JavaStreamDemo {


    public static void main(String[] args) {
        List<String> names= new ArrayList<String>();
        names.add("tanvir");
        names.add("touhid");
        names.add("tamzid");
        names.add("reza");
        names.add("afsar");
        names.add("Mahmudul");


        long count=names.stream().filter(str->str.length()<5).count();
        System.out.println("the total occurance of any word less that length 5 is "+count);

    }



}
