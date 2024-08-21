# Three-Level Password System

This Java program demonstrates a basic implementation of a multi-level password authentication system. The system checks the user's identity through three layers of security: a textual password, a graphical password, and a response-time check.

## Table of Contents
- [Introduction](#introduction)
- [System Overview](#system-overview)
- [Features](#features)
- [How It Works](#how-it-works)
- [Sample Input and Output](#sample-input-and-output)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Future Enhancements](#future-enhancements)

## Introduction
Traditional password systems rely heavily on single-factor authentication, typically a textual password. This Three-Level Password System adds additional layers of protection by requiring:
1. A textual password.
2. A graphical password (simulated as a sequence of options).
3. A behavior-based check using the user’s response time.

## System Overview
The program consists of three levels of authentication:
1. **Textual Password:** The user must enter the correct alphanumeric password.
2. **Graphical Password:** The user must select the correct sequence of graphical options (represented by numbers).
3. **Behavioral Property:** The user’s response time is measured; they must respond within a certain time limit.

## Features
- Simple, user-friendly command-line interface.
- Easy-to-understand and customizable password options.
- Provides enhanced security against unauthorized access by implementing three authentication factors.

## How It Works
1. **Textual Password:** The user is prompted to enter their textual password. If it matches the predefined password, they proceed to the next level.
2. **Graphical Password:** The user is prompted to select a sequence of graphical options (represented by numbers 1-4). The sequence must match the predefined sequence to proceed.
3. **Behavioral Property:** The user’s response time is tested by requiring them to press ENTER as quickly as possible after a prompt. If they take too long, access is denied.

## Sample Input and Output

### Successful Login:
**Input:**
```
Enter your textual password: MySecurePassword123
Select the correct sequence of graphical options (1-4): 1 3 2 4
Press ENTER as soon as you see the prompt to test your response time: [User presses ENTER quickly]
```

**Output:**
```
Access granted. Welcome!
```

### Failed Login (Incorrect Textual Password):
**Input:**
```
Enter your textual password: WrongPassword
```

**Output:**
```
Incorrect textual password. Access denied.
```

### Failed Login (Incorrect Graphical Password):
**Input:**
```
Enter your textual password: MySecurePassword123
Select the correct sequence of graphical options (1-4): 1 2 3 4
```

**Output:**
```
Incorrect graphical password. Access denied.
```

### Failed Login (Slow Response):
**Input:**
```
Enter your textual password: MySecurePassword123
Select the correct sequence of graphical options (1-4): 1 3 2 4
Press ENTER as soon as you see the prompt to test your response time: [User waits more than 5 seconds before pressing ENTER]
```

**Output:**
```
Response too slow. Access denied.
```

## Requirements
- Java Development Kit (JDK) installed.
- Basic understanding of Java.

## How to Run
1. **Clone or Download the Repository:**
    ```bash
    git clone https://github.com/yourusername/three-level-password-system.git
    ```
2. **Compile the Program:**
    ```bash
    javac ThreeLevelPasswordSystem.java
    ```
3. **Run the Program:**
    ```bash
    java ThreeLevelPasswordSystem
    ```

4. Follow the prompts to test the three levels of authentication.

## Future Enhancements
- Implement a real graphical password using images.
- Add encryption for storing and verifying passwords.
- Enhance the behavioral property check with more sophisticated metrics (e.g., typing dynamics, mouse movements).
- Allow customization of password sequences and timing requirements.
