# HorseRaceSimulator
This project is a horse racing simulator developed in Java.  
It contains:
- A **text-based simulation** (Part 1)
- A **graphical user interface (GUI)** (Part 2)

It allows users to customize horses, design tracks, run races, and view race statistics.

---
## Project Structure
```
HorseRaceSimulator/
├── Part1/     # Text version
│   ├── Horse.java
│   └── Race.java
│
├── Part2/     # Graphical/GUI version
│   ├── MainHorsePage.java
│   ├── TrackDesign.java
│   ├── horseCustbutton.java
│   ├── statsButton.java
│   └── (Other files)
│
└── README.md
```

---
### Text-based Version (Part 1)
First, open a new terminal and navigate the **Part1** directory.
Then compile the Java files:
   ```bash
   javac *.java
   ```
Once you compile, run the Race simulation:
   ```bash
   java part1.Race
   ```

---
### Graphical/GUI Version (Part 2)
First, again open terminal and navigate to the **Part2** directory after navigating compile the Java files:
   ```bash
   javac -cp ../Part1 *.java
   ```
Run the main GUI page:
   ```bash
   java part2.MainHorsePage
   ```

This will open a window where you can:
Design tracks, customize your horses, and view race statistics

---
## Dependencies
- Only **Java Standard Library** is required .

---

## Usage Guidelines
- Start with the Main Menu (`MainHorsePage`) in GUI.
- First "Track Design" to create a track.
- Second click on "Customize Horse" to create 3 horses after creating each horse click on save to start with the next horse.
- Once done with the race click on "Statistics" to view results after races.
- Make sure you create at least **3 horses** before starting a race,or viewing statistics.

---

## Notes that might help
- Horse attributes (like breed and accessories) impact their speed and confidence.
- Different track conditions (Dry, Muddy, Icy, etc.) affect horse performance.

