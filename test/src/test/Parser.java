package test;

public class Parser {
	
	public static void main(String[] args) {
		
		String s1 = "abcde";
		char[] arr = s1.toCharArray();
		
		for(int i=0;(i+1)<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				
				if(arr[j]>arr[j+1]){
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
		for(int k=0;k<arr.length;k++){
			
			
			System.out.println(arr[k]);
			
		}
	}

	
}
