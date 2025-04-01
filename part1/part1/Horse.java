package part1;

/**
 * Horse class represents each participant with a symbol, name, and confidence level.
 * 
 * @author (Sara Hadi) 
 * @version (April 1)
 */
public class Horse
{
    private String horseName;
    private char horseSymbol;
    private double horseConfidence;
    private int distanceTravelled;
    private boolean fallen;

    
    
      
    //Constructor of class Horse
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.fallen = false;
        this.distanceTravelled = 0;
        
        public static void main(String[] args) {
            System.out.println("Horse class is ready.");
        }
    }
    // to commit the changes
    
    
    //Other methods of class Horse
    public void fall()
    {
        
    }
    
    public double getConfidence()
    {
        
    }
    
    public int getDistanceTravelled()
    {
        
    }
    
    public String getName()
    {
        
    }
    
    public char getSymbol()
    {
        
    }
    
    public void goBackToStart()
    {
        
    }
    
    public boolean hasFallen()
    {
        
    }

    public void moveForward()
    {
        
    }

    public void setConfidence(double newConfidence)
    {
        
    }
    
    public void setSymbol(char newSymbol)
    {
        
    }
    
}
