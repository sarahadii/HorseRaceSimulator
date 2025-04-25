package part1;

public class RaceTest {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Horse1", '1', 0.8, null, null);
        Horse horse2 = new Horse("Horse2", '2', 0.6, null, null);
        Horse horse3 = new Horse ("Horse3", '3', 0.3, null, null);

        Race myRace = new Race(10, null, null, 0);
        myRace.addHorse(horse1, 1);
        myRace.addHorse(horse2, 2);
        myRace.addHorse(horse3, 3);
        myRace.startRace();
    }
}