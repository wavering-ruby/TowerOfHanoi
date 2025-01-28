# Tower of Hanoi - Java and Python Implementations

This project implements the classic Tower of Hanoi puzzle in both Java and Python.

## Description

The program solves the Tower of Hanoi puzzle by recursively moving the disks from the source tower to the destination tower using an auxiliary tower.

### Main Steps:
1. Move a smaller set of disks from the source to the auxiliary tower.
2. Move the largest disk from the source tower to the destination tower.
3. Move the smaller set of disks from the auxiliary tower to the destination tower.

## How to Run

### Java
1. Copy the Java code into a `.java` file.
2. Compile the code using `javac`.
3. Run the compiled code with `java Main`.

### Python
1. Copy the Python code into a `.py` file.
2. Run the code using `python filename.py`.

## Example Output
For 3 disks, the output will be:

```
Mover anel 1 da torre A para a torre C
Mover anel 2 da torre A para a torre B
Mover anel 1 da torre C para a torre B
Mover anel 3 da torre A para a torre C
Mover anel 1 da torre B para a torre A
Mover anel 2 da torre B para a torre C
Mover anel 1 da torre A para a torre C
```

## Code Implementations

### Java

```java
class Main{
  public static void main(String[] args){
    int n = 3;
    char O = 'A';
    char D = 'C';
    char A = 'B';
  
    TH(n, O, D, A);
  }
  
  public static void TH(int n, char O, char D, char A){
      if(n > 1){
        TH(n-1, O, A, D);
        System.out.println("Mover anel " + n + " de " + O + " para " + D);
        TH(n-1, A, D, O);
      } else {
          System.out.println("Mover anel 1 da torre " + O + " para a torre " + D);
    }
  }
}
```

### Python

```python
def TH(n, O, D, A):
    if n > 1:
        TH(n - 1, O, A, D)
        print(f"Move disk {n} from {O} to {D}")
        TH(n - 1, A, D, O)
    else:
        print(f"Move disk 1 from {O} to {D}")

def main():
    n = 3
    O = 'A'
    D = 'C'
    A = 'B'
  
    TH(n, O, D, A)

if __name__ == "__main__":
    main()
```

## Notes

- The recursive function `TH(int n, char O, char D, char A)` in Java and `TH(n, O, D, A)` in Python is used to solve the puzzle.
- `n` represents the number of disks.
- `O`, `D`, and `A` represent the source, destination, and auxiliary towers, respectively.
