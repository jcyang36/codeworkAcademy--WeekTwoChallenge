package connect;
import java.util.Scanner;
public class WeekTwoChallenge{
    public static void main(String[] args){
    //----------  INPUT  ----------
       Scanner receiveInput  =new Scanner(System.in);
       String first="John";
    String last="Jingleheimer-Schmidt";
    String middle="J";
        String email="jjjschmidt@gmail.com";
        String degree ="BS";
    String classOf="UMaryland, 2002";
    String field="Psychology";
    String wTitle="Software Developer II";
    String wDur="Amtrak, June 2015- Present";
    String dutyone="- Duty 1, Lorem ipsum";
	String dutytwo="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
    String[] skills= new String[3];
    skills[0]="PHP, highly skilled";
    skills[1]="Ruby on Rails, proficient";
    skills[2]="Perl, familiar";
	String skil="";
     //----------  INPUT  -----------
     
     //----------  PROCESSING  ----------
    
    System.out.println(" First Name : ");
    
    //first=receiveInput.nextLine();
    System.out.println(" Middle Initial : ");
    //middle=receiveInput.nextLine();
    System.out.println(" Last Name : ");
    //last=receiveInput.nextLine();
    

    System.out.println(" Email : ");
    //email=receiveInput.nextLine();
    while(email.indexOf("@") == -1){
    System.out.println(" Please enter an email: ");
    //email=receiveInput.nextLine();
   }
    
    

 
  
 

 
 	System.out.println("Education\n Degree earned : ");
 	//degree=degree+receiveInput.nextLine();
 	System.out.println("Field of study: ");
 	//field=field+receiveInput.nextLine();
 	System.out.println("College or University: ");
 	//classOf=classOf+receiveInput.nextLine();
 	System.out.println("Year of graduation: ");
 	//classOf=classOf+", "+receiveInput.nextLine();
 	System.out.println("Title of position: ");
 	System.out.println("Work Company and dates of employment: ");
 	System.out.println("Duty 1: ");
 	System.out.println("Duty 2: ");
 	
 	System.out.println("Enter a skill and proficiency level: ");
 	System.out.println("Enter a new skill? (Y/N)" );
 	   	for (int count=0;  count< skills.length; count++) {
    	
    	skil =skil+"\n"+skills[count];
    	}
    //----------  PROCESSING  ----------
    
   //-----------  OUTPUT  ---------- 
    
    
      
    
       
 	System.out.println(first+" "+ middle+" "+ last);    
    System.out.println(email+"\n");
    
    System.out.println("Education " );
    System.out.println( degree+ " in "+ field+",\n" +classOf +"\n");
    
    System.out.println("Experience ");
    System.out.println(wTitle);
    System.out.println(wDur);
    System.out.println(dutyone);
    System.out.println(dutytwo);
    
    System.out.print("Skills ");
    System.out.println(skil);
   //----------  OUTPUT  ----------
    }
    }
    