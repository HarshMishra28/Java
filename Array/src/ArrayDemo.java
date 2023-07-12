import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []arr=new String[10];
		System.out.println("Enter Arrays Content");
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Enter the name of employees: "+i);
			arr[i]=sc.next();
		}
		System.out.println("Array content are : ");
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
