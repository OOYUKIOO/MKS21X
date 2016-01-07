import java.util.*;
public class Driver2{

    public static void fillRandom(int[]data){
	Random rand = new Random();
	for (int i = 0; i < data.length; i++){
	    data[i] = rand.nextInt();
	}
    }

    public static void swap(int[]ary, int from, int to){
	int carry = ary[from];
	ary[from] = ary[to];
	ary[to] = carry;
    }

    public static void main(String[]args){
        int size = 10000;
        String choice = "insertion";
        String order = "random"; // reversed sorted

        if(args.length >= 1){
            choice = args[0];
        }

        if(args.length >= 2){ //pick number of elements
            size = Integer.parseInt(args[1]);
        }

        if(args.length > 2){
            order = args[2];
        }
        int[]ary = new int[size];


        //default is random order
        fillRandom(ary);
        if(order.equals("random")){

        }
        if(order.equals("sorted")){
            Arrays.sort(ary);
        }
        if(order.equals("reversed")){
            Arrays.sort(ary);
            for(int i = 0; i < ary.length / 2; i++){
                swap(ary,i,ary.length-i-1);
            }
        }

        long start = System.currentTimeMillis();

        if(choice.equals("bubble")){
            BubbleSort.bubbleSort(ary);
        }
        if(choice.equals("insertion")){
            InsertionSorts.insertionSort(ary);
        }
        if(choice.equals("selection")){
            SelectionSorts.selectionSort(ary);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time:"+ (end-start)/1000.0 + " seconds. Size = "+ary.length);
    }
}
