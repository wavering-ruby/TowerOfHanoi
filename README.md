
# Tower of Hanoi - Java Implementation

This project implements the classic Tower of Hanoi puzzle in Java.

## Description

The program solves the Tower of Hanoi puzzle by recursively moving the disks from the source tower to the destination tower using an auxiliary tower.

### Main Steps:
1. Move a smaller set of disks from the source to the auxiliary tower.
2. Move the largest disk from the source tower to the destination tower.
3. Move the smaller set of disks from the auxiliary tower to the destination tower.

## How to Run

1. Copy the code into a `.java` file.
2. Compile the code using `javac`.
3. Run the compiled code with `java Main`.

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

## Notes

- The recursive function `TH(int n, char O, char D, char A)` is used to solve the puzzle.
- `n` represents the number of disks.
- `O`, `D`, and `A` represent the source, destination, and auxiliary towers, respectively.
