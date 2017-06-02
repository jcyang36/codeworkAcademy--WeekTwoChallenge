//Author: Joyce Yang
//This program takes in the user's educational and work achievements, and skills, and outputs a resume.
//may 31, 2017
package connect;
import java.util.Scanner;
public class WeekTwoChallenge{
    public static void main(String[] args){
    //----------  INPUT  ----------
       Scanner receiveInput  =new Scanner(System.in);
       Scanner choice = new Scanner(System.in);
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
	String[] duties= new String[10];
    duties[0]="- Duty 1, Lorem ipsum";
    duties[1]="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
    duties[2]="- Duty 1, Lorem ipsum";
    duties[3]="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
    duties[4]="- Duty 1, Lorem ipsum";
    duties[5]="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
    duties[6]="- Duty 1, Lorem ipsum";
    duties[7]="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
    duties[8]="- Duty 1, Lorem ipsum";
    duties[9]="- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos";
  String[] skills= new String[3];
	String skil="";
	int count=0;
     //----------  INPUT  -----------
     
     //----------  PROCESSING  ----------
    
    System.out.println(" First Name : ");
    
    first=receiveInput.nextLine();
    System.out.println(" Middle Initial : ");
    middle=receiveInput.nextLine();
    System.out.println(" Last Name : ");
    last=receiveInput.nextLine();
    

    System.out.println(" Email : ");
    email=receiveInput.nextLine();
 /*   while(email.indexOf("@") == -1){
    	System.out.println(" Please enter an email: ");
    	email=receiveInput.nextLine();
   } 
   */
  
 
    String rep="Y";
    do{

 	
 	 	
 	while(rep.equalsIgnoreCase("Y")){
 		
 		/*receiveInput.hasNextLine();*/ 
 		System.out.println("Education\n Degree earned : ");
 		
 	 	
 	 	degree =receiveInput.nextLine();
 	 	
 		System.out.println("Field of study: ");
 	 	
 			field=receiveInput.nextLine();
 	 	
 	 	
 	 	System.out.println("College or University: ");
 	 	classOf=receiveInput.nextLine();
 	 	System.out.println("Year of graduation: ");
 	 	classOf=classOf+", "+receiveInput.nextLine();
 	 	
	 	System.out.println("Enter another educational achievement? Y/N: ");
	 	rep = choice.next();
	 	if (rep.equalsIgnoreCase("N")){
	 		break;
	 	}
	 	if(count>20){
	 		   break;
	 		   
	 	   }
	 	   count++;
	 	
 	} 
 	
 	}while(rep.equalsIgnoreCase("Y"));
 	
 	
 	
	 	rep = "Y";
	 	count=0;
	 	
		 	System.out.println("Work \n Title of position: ");
		 	wTitle=receiveInput.nextLine();
		 	System.out.println("Work Company , dates of employment: ");
		 	wDur = receiveInput.nextLine();
		 	
		 	
		 	
		 	do{System.out.println("Duty "+(count+1)+ " : ");
		 	
		 	duties[count]=receiveInput.nextLine();
		 	
			System.out.println("Enter a new work duty? (Y/N)" );
		 	rep = choice.next();
		 	
		 	   if (rep.equalsIgnoreCase("N")){
		 	 		break;
		 	 		}
			  if(count>20){
		 		   break;
		 		   
		 	   }
		 	   count++;
	 	}while(rep.equalsIgnoreCase("Y"));
			 count=0;
		 
		 
		 rep="Y";
 	do{
 		
 			System.out.println("Skills \n Enter a skill and proficiency level: ");
 		
			skil=skil+"\n"+receiveInput.nextLine();
	 
	 	
	 	System.out.println("Enter a new skill? (Y/N)" );
	 	   
	 	   rep = choice.next();
		 	
	 	   if (rep.equalsIgnoreCase("N")){
	 	 		break;
	 	 		}
	 	   if(count>20){
	 		   break;
	 		   
	 	   }
	 	   count++;
 	}while(rep.equalsIgnoreCase("Y"));
    //----------  PROCESSING  ----------
    
   //-----------  OUTPUT  ---------- 
    
    
      
    
       
 	System.out.println(first+" "+ middle+" "+ last);    
    System.out.println(email+"\n");
    
    System.out.println("Education " );
    System.out.println( degree+ " in "+ field+",\n" +classOf +"\n");
    
    System.out.println("Experience ");
    System.out.println(wTitle);
    System.out.println(wDur);
    System.out.println(duties);
    
    
    System.out.println("Skills ");
    System.out.println(skil);
   //----------  OUTPUT  ----------
    }
    }
    
