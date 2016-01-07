import java.util.Scanner;
public class Main {

	public static int howManyData(){
		Scanner sn = new Scanner(System.in);
		int num = 0;
		while(num<1 || num>1000){
		num = sn.nextInt();
		}
		return num;
	}
	
	public static String removeCharAt(String s, int pos){
	    return s.substring(0, pos) + s.substring(pos + 1);
	}
	
	public static void main(String[] args) {
		int numOfDataset = howManyData();
		String firstNum_st;
		int firstNum;
		
		String[] arr = new String[numOfDataset];
		Scanner sn2 = new Scanner(System.in);
		for(int i=0; i<numOfDataset; i++){
			while(true){
				arr[i] = sn2.nextLine();
				if(arr[i].substring(1,2).contains(" ")){
					if(arr[i].length()<82){
						break;
					}
				}else{
					if(arr[i].length()<83){
						break;
					}
				}
			}
		}
		for(int j=0; j<numOfDataset; j++){
			if(arr[j].substring(1, 2).contains(" ")){
				firstNum_st = arr[j].substring(0, 1); //extract first number
				firstNum = Integer.parseInt(firstNum_st); //change to int
				arr[j] = removeCharAt(arr[j],firstNum+1);
				System.out.println(arr[j]);
			}
			else{
				firstNum_st = arr[j].substring(0, 2); //extract first number
				firstNum = Integer.parseInt(firstNum_st); //change to int
				arr[j] = removeCharAt(arr[j],firstNum+1);
				System.out.println(arr[j]);
			}
		}
	}
}
