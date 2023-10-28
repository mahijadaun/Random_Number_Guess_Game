import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mynum = (int)(Math.random()*100);
		while(true){
		    System.out.print("Please enter your number: ");
		    int usernum = sc.nextInt();
		    if (usernum == mynum){
		        System.out.println("Correct");
		        break;
		    }else if(usernum > mynum){
		        System.out.println("enter a smaller value");
		    }else if(usernum < 0){
		        break;
		    }else{
		        System.out.println("enter a larger value");
		    }
		}
		
	}
}
