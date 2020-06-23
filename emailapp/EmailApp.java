package emailapp;
import java.io.*;
public class EmailApp {
	
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your first name");
		String firstName=br.readLine();
		System.out.println("Enter your last name");
		String lastName=br.readLine();
		Email email=new Email(firstName,lastName);
		System.out.println("\n\nEnter code");
		System.out.println("1 to Change Password\n2 to change mailBox capacity\n3 to display user info ");
		int ch=Integer.parseInt(br.readLine());
		if(ch==1)
		{
			System.out.println("Enter new password");
			String newPassword=br.readLine();
			email.changePassword(newPassword);
			System.out.println("Password Changed!");
		}
		if(ch==2)
		{
			System.out.println("Enter mailBox capacity");
			email.setmailBoxCapacity(Integer.parseInt(br.readLine()));
			System.out.println("MailBox Capacity changed!");
		}
		if(ch==3)
		{
			System.out.println("NAME : "+email.getName()+"\nEMAIL : "+email.getEmail() +"\nMailBox Capacity : "+email.getCapacity());
		}
		
	}
}
