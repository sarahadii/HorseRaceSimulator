package part1;
public class HorseTest {
    public static void main(String[] args) {
        Horse h = new Horse("Thunder", 'T', 0.75, null, null);
        System.out.println("Horse Name: " + h.getName());
        System.out.println("Horse Symbol: " + h.getSymbol());
        System.out.println("Horse Confidence: " + h.getConfidence());
        System.out.println("Distance: " + h.getDistanceTravelled());
        System.out.println("Has Fallen: " + h.hasFallen());
        h.moveForward();
        System.out.println("Distance after moving forward: " + h.getDistanceTravelled());
        h.fall();
        System.out.println("Has Fallen: " + h.hasFallen());
        h.goBackToStart();
        System.out.println("Distance after going back to start: " + h.getDistanceTravelled());
        System.out.println("Has Fallen: " + h.hasFallen());
        h.setConfidence(1.5);
        System.out.println("Confidence after setting to 1.5: " + h.getConfidence());
    }
}