## Stone-Paper-Scissor Game in Java

### Overview
This is a Java-based implementation of the classic game, Stone-Paper-Scissor. It allows users to play against the computer in an interactive and user-friendly manner. Users have the option to keep playing multiple rounds or quit whenever they wish.

### Instructions
1. **Starting the Game:**
   - The user is welcomed and asked to enter their name to begin.

2. **Making a Selection:**
   - The user is prompted to choose between Stone, Paper, or Scissor each round.
   - Inputs other than these are considered invalid, prompting the user to re-enter their selection.

3. **Playing the Game:**
   - After each round, the computer's selection is revealed, and the winner is announced.
   - The score is displayed, and users can decide to play again or quit.

### Code Structure
The `Main` class comprises several static methods designed to facilitate different aspects of game progression:

- **`userInfo()`:** Captures user information and displays a welcome message.
- **`getRanNumber()`:** Generates a random number representing the computer's selection.
- **`showStates(int userScore, int compScore, String name)`:** Presents the current scores.
- **`convertNumber(String s)`:** Transforms user input into a corresponding numeric value.
- **`getInput()`:** Retrieves a valid input from the user.
- **`printComSelection(int selection)`:** Displays the computer's choice.
- **`giveResult(int userSelection, int compSelection, String name)`:** Determines and announces the winner of each round.
- **`playgames(String name)`:** Coordinates the overall game flow.

### Example Code
```java
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        //... rest of the code ...
    }
    //... other methods ...
}
```

### Running the Game
To play the game, compile the Java file and run the resulting class through the Java interpreter. Assuming the file name is `Main.java`, you can use the following commands:
```sh
javac Main.java
java Main
```

### Contribution
Feel free to contribute by forking this project and submitting a pull request. Please ensure that the `README.md` file is kept up to date with any changes or enhancements made.

### Note
Before attempting to run the game, verify that Java Development Kit (JDK) is installed and properly configured on your system.
