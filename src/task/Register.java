package task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;


public class Register {
 public static void main(String args[]) {
	 
	 Day3two person1=new Day3two();
	 Scanner in=new Scanner(System.in);

	 ArrayList<Day3two>arraylist=new ArrayList<>();
	 
	 
	 boolean reg =true;
		 while(reg) {
			 System.out.println("MAIN MENU");
			 System.out.println("Enter the number of the option");
			 System.out.println("1)Are you a new user");
			 System.out.println("2)Existing user");
			 System.out.println("3)show user");
			 System.out.println("4)Exit");
			 
			 System.out.println("Enter the number");
			 int input=in.nextInt();
			 in.nextLine();
			 
			
			if(input==2) {
				 String username ;
				 System.out.println("enter your username:");
				 username=in.nextLine();
				 String password;
				 System.out.println("enter your password:");
				 password=in.nextLine();
				 
//				 Day3two alr=new Day3two();
				
				for(int i=0;i<arraylist.size();i++) {
					 Day3two alr=arraylist.get(i);
					if(alr.getUsername().equals(username)&&alr.getPassword().equals(password)) {
				System.out.println("LOGIN SUCCESSFUL");		
				 System.out.println(alr.getUsername());
				 System.out.println(alr.getPassword());
				 System.out.println(alr.getEmail());
				 System.out.println(alr.getAddress());
				 System.out.println(alr.getMobilenumber());
				 System.out.println(alr.getCreateAt());
				 System.out.println(alr.getUpdateAt());
				 System.out.println(alr.getIsActive());
					}
					else {
						System.out.println("*****INVALID*****");
					}
				}
				 
			 }
			 else if(input==4) {
				 reg=false;
			 }
			 else if(input==3) {
				 System.out.println(arraylist);
			 }
			
			 else if(input==1) {
				 
			 
	 String username ;
	 System.out.println("enter your username:");
	 username=in.nextLine();
	 String password;
	 System.out.println("enter your password:");
	 password=in.nextLine();
	 String email;
	 System.out.println("enter your email ID:");
	 email=in.nextLine();
	 String address;
	 System.out.println("enter your address:");
	 address=in.nextLine();
	 long mobilenumber;
	 System.out.println("enter your phone number:");
	 mobilenumber=in.nextLong();
	 Date createAt=new Date();
	 Date updateAt=new Date();
	 boolean isActive=true;

	
	
	 person1.setUsername(username);
	 person1.setPassword(password);
	 person1.setEmail(email);
	 person1.setAddress(address);
	 person1.setMobilenumber(mobilenumber);
	 person1.setUpdateAt(updateAt);
	 person1.setCreateAt(createAt);
	 person1.setIsActive(isActive);
	 
	 arraylist.add(person1);
		}
			 else {
				 System.out.println("INVALID");
			 }
		 }
	 
	 
		 

 }
	
}
