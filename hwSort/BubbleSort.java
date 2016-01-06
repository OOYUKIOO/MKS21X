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
		if(data[i]>data[i+1]){
		    int toSwap = data[i];
		    data[i] = data[i+1];
		    data[i+1] = toSwap;
		}
	    }
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

















