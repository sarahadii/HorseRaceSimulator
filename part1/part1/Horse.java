
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
    private String color;
    private String breed;

    
      
    //Constructor of class Horse
    public Horse(String horseName, char horseSymbol, double horseConfidence, String color, String breed)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.fallen = false;
        this.distanceTravelled = 0;
        this.color = color;
        this.breed = breed;
    }
    


    public static void main(String[] args) {
       System.out.println("Horse class is ready.");
    }


    //Other methods of class Horse
    public void fall()
    {
        this.fallen = true;
    }
    
    public double getConfidence()
    {
        return this.horseConfidence;  
    }
    
    public int getDistanceTravelled()
    {
        return this.distanceTravelled;    
    }
    
    public String getName()
    {
        return this.horseName; 
    }
    
    public char getSymbol()
    {
        return this.horseSymbol;   
    }
    
    public void goBackToStart()
    {
        this.distanceTravelled = 0;
        fallen = false;
    }
    
    public boolean hasFallen()
    {
        return this.fallen;  
    }

    public void moveForward()
    {
        this.distanceTravelled += 1;
    }

    public void setConfidence(double newConfidence)
    {
        if (newConfidence >= 0 && newConfidence <= 1) {
            this.horseConfidence = newConfidence;
        }
        else{
            System.out.println("Confidence level must be between 0 and 1.");
        }
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;  
    }
    
    public void setName(String newName) // testing the vcommit 
    {
        this.horseName = newName;  
    }
    public String getColor() {
        return this.color;
    }
    public String getBreed() {
        return this.breed;
    }
    
}
