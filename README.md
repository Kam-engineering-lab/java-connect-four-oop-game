# Connect Four Game
This is a revised version of the console game - Connect Four.<br>
- The idea of OOP (object orientated programming) is to code real life objects and their functionalities. In this project the task was to analyse, design, implement “MyConnectFour” game using OOP principles/features.<br>
(For Class diagram please review png file)

# Overview of How Code Was Refactored
The code was refactored to follow the OOP principles of encapsulation, abstraction, inheritance and polymorphism.<br>
The logic was extracted into different classes for the players, board and user input. An interface and abstract class in the case of the player, was used for each of these components to abstract the methods and properties from their implementation. As there are 2 different types of player – human and computer, 2 classes for these were created. These both extended from the Player abstract class, which contained the common private properties with their accessor methods and an abstract move method, which each player class provide their own implementation of. To follow the OOP principle of encapsulation, property variables in classes were set to private with public accessor methods if needed.

# How to Run
To compile and run this console game input this command into the terminal: <br>
```javac *.java && java Main.java```
