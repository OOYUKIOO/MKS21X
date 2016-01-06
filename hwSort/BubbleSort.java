public class BubbleSort{

    public static void printArray(int[]data){
	String message = "[";
	if (data.length==0){
	    message+=" ";
	}
	for(int i=0;i<data.length;i++){
	    message += data[i]+",";
	}
	System.out.println(message.substring(0,message.length()-1)+"]");
    }

    public static void bubbleSort(int[]data){
	for(int x = 0; x < data.length-1; x++){
	    for (int i = 0; i<data.length - 1; i++){
		if(data[x]>data[x+1]){
		    int toSwap = data[x];
		    data[x] = data[x+1];
		    data[x+1] = toSwap;
		}
	    }
	    printArray(data);
	}
    }

    //testing
    public static void main(String[]args){
        int[]test = {4,2,6,1,0,3};
        printArray(test);
	bubbleSort(test);
	printArray(test);
    }


}

















