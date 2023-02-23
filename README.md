# Java Minesweeper

---

## Demo & Snippets

---

## Requirements / Purpose

### MVP

1. Create a 2D array of integers to represent the game board. The values in the array will represent whether a cell is a mine or not.
2. Create a seperate 2D array of characters to represent the user interface wich will be initially hidden.
3. Randomly place mines on the game board by setting random cells.
4. If the selected cell contains a mine, display a message indicating that the game is over and the user has lost.
5. If no mines have been hit, display a message indicating that the game is over and the user has won.

### Purpose of Project

The purpose of a 2D array Java Minesweeper project is to create a game that challenges the player's deductive reasoning and memory skills. The game involves a board of cells, some of which contain hidden mines.

The player must select cells to reveal whether they contain a mine or not. If a cell contains a mine, the game is over and the player loses. The goal is to uncover all cells that do not contain mines, without uncovering any cells that do contain mines.

A 2D array is used to represent the board of cells because it provides a convenient data structure for storing and accessing the cell values in a matrix-like fashion.

### Tech stacks used:

Java: is widely used for developing games due to its platform independence, robustness, and easy-to-learn syntax. It is also an object-oriented language which allows for modular and reusable code.

The project requires storing and manipulating large amounts of data in memory, which is one of the strengths of Java. Overall, Java provides a strong combination of performance and flexibility.

---

## Build Steps

### Prerequisites

To get started, you will need to have Google Chrome and Visual Studio Code installed on your system.

### Steps

Here are the steps to set up the project:

1. Clone the repository to your local machine.
2. Open the repository in visual studio code.
3. Download the "Extension Pack for Java" from the VS Code extensions.
4. Run the project by clicking the play button (run) or F5 - the project runs and can be played through the Command Line Interface (CLI).

---

## Design Goals / Approach

The design goal of the project is to create a user-friendly graphical interface that allows players to interact with the game and uncover hidden mines without detonating them.

The game is designed using object-oriented programming principles, where each square on the game board is represented by a Cell object that holds information about its state. To make the game more challenging, the location of the mines are randomly generated.

Overall, the design goa is to create an engaging and challenging game that relies on strategy, logic and luck, while providing a user-friendly interface that is easy to navigate and understand.

---

## Features

- Personalisation: the user can determine the number of rows, columns and mines for each game.
- Mines: the game board contains hidden mines that the player must avoid detonating. The number of mines are determined by the user and randomly generated each game.

---

## Known issues

---

## Future Goals

- Add a way to restart the game through the CLI.

---

## What did you struggle with?

- Splitting the components into different classes. I had first completed the project all in one java file. However, per feedback, it was suggested I added OOP for each component of the project.

---

## Further details, related projects, reimplementations

---

## Contact

Feel free to reach out to me via ashleykouch99@gmail.com for any questions or collaboration opportunites.
