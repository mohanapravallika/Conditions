package cond;
import java.util.*;
public class While_loop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		while(ch==1)
		{
			System.out.println("enter stdnt_no: ");
			int stdnt_no = sc.nextInt();
			System.out.println("enter stdnt_name: ");
			String stdnt_name = sc.next();
			System.out.println("sno = "+stdnt_no);
			System.out.println("sname = "+stdnt_name);
  System.out.println("enter choice: 1 for input else quit");
          ch = sc.nextInt();
		}
		System.out.println("end of the data");
		}
}
