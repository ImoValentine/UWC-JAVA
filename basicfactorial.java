public class rec{
    
    static int count=0;//setting variable count equal to 0
    
    static void recfu(){
    count++; //incrementing count, count +1
    if (count<=5){
        System.out.println("Hello"+ " "+count);
        recfu();//calling recursive function again until condition is met
    }
    }
    
    public static void main(String[]Args){
    recfu();
    }  
    }