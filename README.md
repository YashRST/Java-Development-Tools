# Java-Development-Tools

**Java-Development-Tools** is a utility library designed to simplify object copying and generate setter/getter methods for POJOs. It includes tools to copy one POJO to another and helps with generating boilerplate setter and getter methods.

## Folder Structure

```plaintext
.
├───classes                 # Compiled classes for POJOCopier and supporting utilities.
│   └───com/thinking/machines/common/
│           Keyboard.class
│           POJOCopier.class
│
├───common
│   ├───classes             # Compiled classes for common utilities and POJOCopier.
│   │   └───com/thinking/machines/common/
│   │           Keyboard.class
│   │           POJOCopier.class
│   │           setterGetterGenerator.class
│   ├───dist                # JAR file for easy distribution.
│   │       tmcommon.jar
│   ├───src                 # Source files for POJOCopier and supporting classes.
│   │   └───com/thinking/machines/common/
│   │           Keyboard.java
│   │           POJOCopier.java
│   │           setterGetterGenerator.java
│   └───test                # Test cases for validating functionality.
│           aaa.java/class
│           bbb.class
│           test1.java/class
│           test2psp.class
│           test3.java/class
│
└───itext                   # Dependencies for PDF-related functionality.
        itext-pdfa-5.5.3.jar
        itext-xtra-5.5.3.jar
        itextpdf-5.5.3.jar
```

# Key Components

## POJOCopier
- **Description**: Copies properties from one POJO to another.
- **Test**: `test2` demonstrates copying and prints both the process and result.

## Keyboard
- **Description**: Takes input from the user and prints it.
- **Test**: `test1` showcases basic input and output functionality.

## setterGetterGenerator
- **Description**: Generates setters and getters for a POJO.
- **Command to run**:
  ```bash
  java -classpath ../dist/tmcommon.jar;. com.thinking.machines.common.setterGetterGenerator test3
  ```
This will copy the generated setter and getter methods to your clipboard, ready to be pasted into the appropriate file.

## Test: test3 runs the generator.

# How to Use

## Running Tests

### Test 1 (Keyboard)
- **Description**: Takes input and prints it.
- **Command**:
  ```bash
  java -classpath ../dist/tmcommon.jar;. test1psp
  ```
### Test 2 (POJOCopier)
- **Description**: Copies properties from one POJO to another and prints the output.
- **Command**:
  ```bash
  java -classpath ../dist/tmcommon.jar;. test2psp
  ```
### Test 3 (setterGetterGenerator)
- **Description**: Generates setters and getters, places them in the clipboard.
- **Command**:
  ```bash
  java -classpath ../dist/tmcommon.jar;. com.thinking.machines.common.setterGetterGenerator test3
  ```

Simply paste the generated methods into the intended POJO class.

## Dependencies
The project includes PDF-related functionality via the itext library:
- `itextpdf-5.5.3.jar`
- `itext-xtra-5.5.3.jar`
- `itext-pdfa-5.5.3.jar`

Ensure these dependencies are included in your classpath when working with PDF files.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

