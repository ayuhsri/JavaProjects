package emailapp;
import java.io.*;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int capacity=1000;
	private String email;
	private int passwordLength=10;
	
	public Email(String first,String last)throws IOException
	{
		firstName=first;
		lastName=last;
		department=setDepartment();
		
		System.out.println("EMAIL CREATED : "+firstName+" "+lastName);
		
		
		System.out.println("Department : "+department);
		
		password=generatePassword(passwordLength);
		System.out.println("Password : "+password);
		
		email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase()+".com";
		System.out.println("Email : "+email);
	}
	
	private String setDepartment()throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Department");
		String deptt=br.readLine();
		return deptt;
	}
	
	private String generatePassword(int len)
	{
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		String pw="";
		for(int x=0;x<len;x++)
		{
			int randChar= (int) (Math.random() * characters.length());
			pw=pw+characters.charAt(randChar);
		}
		return pw;
	}
	
	public void setmailBoxCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	public void changePassword(String newPassword)
	{
		password=newPassword;
	}
	
	public String getName()
	{
		return firstName+" "+lastName;
	}
	public String getEmail()
	{
		return email;
	}
	public int getCapacity()
	{
		return capacity;
	}
}
