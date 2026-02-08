# 🎮 Connect Four Game

This is a revised version of the console game - Connect Four.

- 🧠 The idea of OOP (object orientated programming) is to code real life objects and their functionalities.  
- 🎯 In this project aim was to analyse, design, implement “ConnectFour” game using OOP principles/features.  
- 📐 For the class diagram, please review the PNG file below or the version included inside the `src` directory.

---

## 🧩 Overview of How Code Was Refactored

- The code was refactored to follow the OOP principles of encapsulation, abstraction, inheritance and polymorphism.<br>
The logic was extracted into different classes for the players, board and user input. An interface and abstract class in the case of the player, was used for each of these components to abstract the methods and properties from their implementation. As there are 2 different types of player
– human and computer, 2 classes for these were created. These both extended from the Player abstract class, which contained the common private properties with their accessor methods and an abstract move method, which each player class provide their own implementation of. To follow the OOP principle of encapsulation, property variables in classes were set to private with public accessor methods if needed.

---

## ▶️ How to Run

To compile and run this console game input this command into the terminal:<br>
```bash
javac *.java && java Main.java
```

---

## 🖥️ Example: When It Runs

```bash
(base) ~/src javac *.java && java Main.java

Welcome to Connect 4
There are 2 players red and yellow
Player 1 is Red, Player 2 is Yellow
To play the game type in the number of the column you want to drop you counter in
A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally 

|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
  1   2   3   4   5   6   7
```
---
🎯 Gameplay Example
```bash
It is Player 1's turn
1
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
| r |   |   |   |   |   |   |
  1   2   3   4   5   6   7

It is Player 2 (Bot)'s turn
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
|   |   |   |   |   |   |   |
| r |   | y |   |   |   |   |
  1   2   3   4   5   6   7
```
---
## 🚫 Example: Error Handling

Invalid Placement
```bash
Unable to place counter. Please try again.
```
Non Integer Input
```bash
Error! Non integer input. Please input an integer value 1-7:
```
---
## 🏗️ Class diagram

<img width="1748" height="1612" alt="image" src="https://github.com/user-attachments/assets/8be0ace9-441f-4815-85f5-7910e262983b" />
