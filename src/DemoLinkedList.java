import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

public class DemoLinkedList {
    //this code will take a sentence
    //it will break them into words then save them


    public static void main(String[] args) {


        System.out.println("please write a sentence : ");
        Scanner scanner=new Scanner(System.in);
        String sentenceHolder=scanner.nextLine();


//now we have to try to save this whole sentence in a shape of
        //Collection framework

        //at first lets try linkedList


        //before that we have to split the sentence using space between
        // the words

        //I can split the sentence but I don't know how to store them after splitting them.



        String[] words=sentenceHolder.split(" ");


        //next thing is we have to know how to copy paste array to arraylist or other data
        //structure

        LinkedList<String> newWordListInLinkedList=new LinkedList<>();
        for(String mangfu:words)
        {
            newWordListInLinkedList.add(mangfu);

        }


        System.out.println("length of the linkedlist :" +newWordListInLinkedList.size());

        System.out.println(newWordListInLinkedList.get(3));

            //printing the whole linkedlist - newWordListInLinkedList


        //I am going to do this by  using collection method

                    for(String wor:newWordListInLinkedList)
                    {
                        System.out.println(wor);

                    }

            // adding a new element in the position of 3

        System.out.println("-------------------");




        for(String wor:newWordListInLinkedList)
        {
            System.out.println(wor);

        }



//it's all about experimenting different things

        ArrayList<Stream> testingString=new ArrayList<>();











    }


}
