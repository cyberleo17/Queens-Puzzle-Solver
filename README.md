Eight Queens Puzzle Solver
This project is a Java-based solver for the classic Eight Queens Puzzle. The goal of this puzzle is to place eight queens on an 8x8 chessboard so that no two queens can attack each other. In chess, a queen can attack another piece if it is located in the same row, column, or diagonal. This solution provides an algorithm that finds one or more valid configurations for placing the queens on the board without conflicts.

Features on the code
-Efficient Backtracking Algorithm: Uses a systematic approach to find valid positions for all eight queens.
-Customizable Board Size: Can be adapted to solve the n-queens puzzle for any board size.
-Clear Solution Output: Displays the solved board configuration with queens placed in safe positions.

How It Works
The solver uses a recursive backtracking algorithm:

1.Starting from the first row, it attempts to place a queen in a safe position on each column of that row.

2.For each placement, it checks if the queen is safe from attacks from other queens already placed.

3.If a safe position is found, it moves to the next row.

4.If no safe position is available in a row, it backtracks to the previous row and moves the previously placed queen to the next possible position.

5.This continues until all eight queens are placed on the board in non-attacking positions.
