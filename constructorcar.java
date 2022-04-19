public class car {
    ///attributes 
    String manufacturer; 
    int yearmade; 
    double enginesize; 
    String colour; 
    
    public car(String manu, int year, double engine, String col){//contructor
    manufacturer=manu;
    yearmade=year;
    enginesize=engine;
    colour=col;
    }
    
    
    public static void main(String args[]) {
    System.out.println("This prints what is in the class"); 
    car mobile= new car("VW", 1992, 1.6, "white" );
    System.out.println(mobile.manufacturer+(" ")+ mobile.yearmade+(" ")+mobile.enginesize+(" ")+mobile.colour);
    
    }
}