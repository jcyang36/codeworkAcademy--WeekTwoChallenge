//Author: Joyce Yang
//This program takes in the user's educational and work achievements, and skills, and outputs a resume.
//may 31, 2017
package connect;
import java.util.Scanner;
import java.util.ArrayList;
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
    String  wComp;
    ArrayList <String> education = new ArrayList <String> ();
	ArrayList <String> work = new ArrayList <String> ();
	ArrayList <String> duties = new ArrayList <String> ();
	ArrayList <String> skills = new ArrayList <String> ();


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
    while(email.indexOf("@") == -1){
    	System.out.println(" Please enter an email: ");
    	email=receiveInput.nextLine();
   } 
   
  
 
    String rep="Y";
    String rep_duty="Y";

 	
 	 	
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
 	 	education.add(degree+ " in "+ field+",\n" +classOf +"\n");
 	 	
 	 	
 	
 	 	count++;
	 	System.out.println("Enter another educational achievement? Y/N: ");
	 	rep = choice.next();
	 	
	 	if(count>20){
	 		   break;
	 		   
	 	   }
	 	   
	 	
 	} 

 	

    
 	
 	
	 	
	 	String workrep="Y";
	 	int workcount=0;
	 	System.out.println("Work");
    while(workrep.equalsIgnoreCase("Y") && workcount<10){

			 	System.out.println("Title of position: ");
				 wTitle=receiveInput.nextLine();
				 System.out.println("Work Company");
				 wComp = receiveInput.nextLine();
				 System.out.println("Dates of employment: ");
				 wDur = receiveInput.nextLine();	
				 	
				 rep_duty = "Y";
				 int duty_count=0;
				 duties.clear();
				 	
				 while(duty_count <20 &&  rep_duty.equalsIgnoreCase("y"))
				 	{
				 		System.out.println("Duty "+(count+1)+ " : ");
				 	
				     	System.out.println("Enter your duty name");
				     	duties.add(receiveInput.nextLine());
				    	duty_count++;
					    System.out.println("Enter a new work duty? (Y/N)" );
				 	   rep_duty = choice.next();
				 	
				 	  
					   
				    }
				 	   
					 	
				 	
				 String final_duties = "";
				 String duties_ele;
				 
				for(int i = 0 ;i < duties.size() ; i ++)
				{
					 duties_ele = duties.get(i);
				    final_duties = final_duties + " \n " +"-Duty "+ (i+1)+", "+ duties_ele;
				    
				}   
					    
				
				work.add(wTitle+"\n"+wComp+", " + wDur+"\n"+final_duties);
				workcount++;
			    System.out.println("Enter a new position for work(new comp)? (Y/N)" );
				workrep = choice.next();			
				
    }

	String	skill_rep="Y";
	int skill_count = 0;
	System.out.println("Skills");
 	while(skill_rep.equalsIgnoreCase("Y") && skill_count<20){
 			
 			System.out.println(" Enter a skill: ");
 		
			String final_skills =  receiveInput.nextLine();
			System.out.println(" Enter a proficiency level: ");
			final_skills= final_skills+ ", " + receiveInput.nextLine();
			skills.add(final_skills);
	 	     System.out.println("Enter a new skill? (Y/N)" );
	 	   
	 	      skill_rep = choice.next();
		 	
	 	     skill_count++;
	 	  
	 	   
 	}
    //----------  PROCESSING  ----------
    
   //-----------  OUTPUT  ---------- 
    
    
      
    
       
 	System.out.println(first+" "+ middle+" "+ last);    
    System.out.println(email+"\n");
    
    System.out.println("Education " );
    for ( String school :education){
    	System.out.println(school);
    }
    
    System.out.println("Experience ");
    for(int i=0;i< work.size(); i++)
    {
    	System.out.println(work.get(i).toString())	;
    	
    	
    }
    	
    
    System.out.println("Skills ");
    for ( String skill :skills){
    	System.out.println(skill);
    }
   //----------  OUTPUT  ----------
    }
    
    
  
    
    }

    
