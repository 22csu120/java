import java.util.*;
public class oddeven{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	if(num%2==0){
	System.out.println("It is an even number");
	}
	else{
	System.out.println("It is an odd number");
	}
	}
}
