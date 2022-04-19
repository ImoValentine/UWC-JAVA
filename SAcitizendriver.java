import java.util.Scanner;

public class saCitizen {

    private String name;
    private String surname;
    private String fullName;
    private String dob;
    private String address;
    private int age;
    private String idnumber;
    private boolean isalive;
    
    Scanner keyboard = new Scanner(System.in);
    
    public saCitizen() {
       
    }

    /** Creates a new instance of saCitizen */
    public saCitizen(String s_Name,String s_Surname,String s_Dob,String s_Address,String saIdnumber,boolean isStillAlive) {
        name = s_Name;
    	surname = s_Surname;
    	dob = s_Dob;
    	address = s_Address;
    	idnumber = saIdnumber;
    	isalive = isStillAlive;
    }

    public String getName(){
        return name;
    }
    
    public String getSurName(){
        return surname;
    }

	public String getFullName(){
        return fullName;
    }	
    public int getAge(){
        return age;
    }
    
    public String getIDnumber(){
        return idnumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public boolean getIsAlive(){
        return isalive;
    }
    
    public void setIDnumber(String idNumber){
    	
        idnumber = idNumber;
    }
    
    public void setDob(){
        System.out.println("Enter the your date of birth in the following format yearmonthday "); 
        dob = keyboard.nextLine();
    }
    

    public void setFullName(String s_Name, String s_Surname){
        fullName = s_Name + " " + s_Surname;
    }
    public void setName(String aName){
        name = aName;
    }
    
    public void setAge(int s_Age){
        age = s_Age;
    }
    
     public void setAddress(String s_Address){
        address = s_Address;
    }


    public int calculateAge(int s_DobYear){
		int yearOfBirth = s_DobYear;
        System.out.println("Enter the current year ");
        int currentYear = keyboard.nextInt();
        
        age = currentYear - yearOfBirth;
        
        return age;
    }

}