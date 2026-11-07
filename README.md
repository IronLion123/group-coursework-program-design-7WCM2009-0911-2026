# Group Coursework: Programming and Program Design (7WCM2009-0911-2026)

## Participants
- Ashutosh Dilip
- Rosa Erdogan
- Geoffrey Lee

## Coursework Description

### Project Title
Interactive Kotlin Command-Line Utility: `ppd_cli_tool`


### Objective
 Develop a Kotlin-based command-line application that processes user inputs to perform specific calculations and conversions. The application will help students apply procedural programming concepts and implement control flow, data handling, and user input validation using Kotlin.

### Requirements

The complete project requirements can be found in the file `Documentation/Coursework Description.pdf`.

### Setup

#### Step 1: Install JDK 25

Check whether Java is already installed:

```bash
java -version
```

If the command is missing or shows a version other than 25, install a JDK:

- **Windows:** `winget install EclipseAdoptium.Temurin.25.JDK`
- **macOS:** `brew install openjdk@25`
- **Linux (Debian/Ubuntu):** `sudo apt install openjdk-25-jdk`
- **Any OS (SDKMAN):** `sdk install java 25.0.5.0+8-tem`

After installing, open a new terminal and run `java -version` again to confirm.

#### Step 2: Clone the repository

```bash
git clone https://github.com/IronLion123/group-coursework-program-design-7WCM2009-0911-2026.git
cd group-coursework-program-design-7WCM2009-0911-2026
```

#### Step 3: Build the tool

- **macOS and Linux:**
  ```bash
  ./gradlew installDist
  ```
- **Windows:**
  ```bash
  .\gradlew.bat installDist
  ```

#### Step 4: Run the tool

- **macOS and Linux:**
  ```bash
  build/install/ppd_cli_tool/bin/ppd_cli_tool
  ```
- **Windows:**
  ```bash
  build\install\ppd_cli_tool\bin\ppd_cli_tool.bat
  ```

You should see the welcome message and menu. Type `!exit` to quit.







