# Magical Arena

This project implements a magical arena where two players engage in combat until one player's health reaches zero. Each player has attributes such as health, strength, and attack. The players take turns attacking and defending, and the game ends when one player dies.

## Project Structure

- `src/main/java`
  - `dev/akshya/magic/model`
    - `Arena.java`
    - `DuelArena.java`
    - `IPlayer.java`
    - `Player.java`
  - `dev/akshya/magic/util`
    - `Constants.java`

- `src/test/java`
  - `dev/akshya/magic/model`
    - `PlayerTest.java`
    - `DuelArenaTest.java`

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher

### Building the Project

1. Navigate to the project directory:

```bash
cd <project-directory>
```

2. Build the project using Maven:

```bash
mvn clean install
```

### Running the Application

To run the game, create a `Main.java` file and execute it. Here's an example:

```java
public class MagicalArena {
    public static void main(String[] args) {
        IPlayer playerA = new Player("PlayerA", 50, 5, 10);
        IPlayer playerB = new Player("PlayerB", 100, 10, 5);
        Arena arena = new DuelArena("MagicalArena", playerA, playerB);
        arena.startGame();
    }
}
```

### Running Tests

To run the tests, use the following Maven command:

```bash
mvn test
```

## Classes and Interfaces

### `Arena`

An interface representing the arena where the players fight. It has methods to start and end the game.

### `DuelArena`

A class implementing the `Arena` interface. It handles the logic for the duel between two players.

### `IPlayer`

An interface representing a player in the arena. It has methods for attacking, defending, and checking if the player is alive.

### `Player`

A class implementing the `IPlayer` interface. It defines the attributes and behaviors of a player.

## Testing

### `PlayerTest`

Unit tests for the `Player` class. It tests the attack, defend, and isAlive methods.

### `DuelArenaTest`

Unit tests for the `DuelArena` class. It tests the game flow and role switching logic.

## Example Output

```text
Taken damage: 30, remaining health: 70
Attacker Health: 50, Defender Health: 70
...
PlayerA Won!
Game Ends here!
```

## Packaging for Submission

1. Ensure all your changes are committed with clear and concise commit messages.
2. Run the following command to clean and package your project:

```bash
mvn clean package
```

3. Zip the entire project directory, including the `.git` directory to retain commit history:

```bash
zip -r magical-arena.zip <project-directory>
```