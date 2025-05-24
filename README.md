# 🎯 JavaFX Guess The Number Game

[![Java](https://img.shields.io/badge/Java-8%2B-blue.svg?logo=java)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Status-Completed-brightgreen)]()
[![Made by](https://img.shields.io/badge/Made%20By-ShravanPusdekar-orange)]()

A simple and interactive **Guess the Number** desktop game built using **JavaFX** (Java 8+).  
The player attempts to guess a randomly generated number between 0 and 100 with visual feedback and background image styling.

---

## 🚩 Features

- Clean and minimal JavaFX-based UI
- Accepts user input with `TextField` and `Button`
- Validates numeric input with error handling
- Provides real-time feedback: too high, too low, or correct
- Random number generation between 0 and 100
- Custom background image support via inline CSS

---

## 📂 Project Structure

This project consists of a **single Java class**:

- `GTNGame.java`: The main JavaFX application containing GUI setup, random number logic, and user interaction handling.

You can optionally include:
- `background.jpg`: The background image used for the game UI (must be in the same directory or correctly referenced in resources).

---

## 💻 Technologies Used

| Technology  | Version          | Purpose                             |
|-------------|------------------|-------------------------------------|
| Java SE     | 8 or above       | Core programming language           |
| JavaFX      | Bundled with Java 8 or later | GUI framework for desktop applications |

---

## 🚀 How to Run

1. **Clone or download** the repository.
2. Place your `background.jpg` in the correct directory (e.g., next to `GTNGame.java`).
3. Open the project in an IDE like IntelliJ IDEA or Eclipse with JavaFX support.
4. Compile and run the `GTNGame` class.
5. Enter a number between 0 and 100 and click **Check**.
6. The game will tell you if your guess is too high, too low, or correct.

---

## ⚙️ Code Overview

- **UI Components:**  
  Uses `Label`, `TextField`, `Button`, and `VBox` for layout and interaction.

- **Random Number Logic:**  
  Uses Java's `Random` class to generate a number once per game session.

- **Event Handling:**  
  Lambda expression handles user input when the **Check** button is clicked.

- **Styling:**  
  Background image is applied using inline CSS via `setStyle()` on the layout container.

---

## 🛠️ Future Improvements

- Add a “Play Again” or “Restart” button
- Show number of attempts taken
- Display game win message with restart prompt
- Load background image via external CSS
- Store high scores or best attempts

---

## 📬 Contact

For suggestions, bugs, or collaboration, feel free to reach out via GitHub or email.

---

*Made with ❤️ using JavaFX by ShravanPusdekar*
