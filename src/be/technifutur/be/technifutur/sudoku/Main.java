package be.technifutur.be.technifutur.sudoku;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sudoku");
        TestSudokuStar();


    }

    private static void TestSudokuStar() {
        SudokuStar sudokuStar= new SudokuStar();
        System.out.println(sudokuStar.isCellValid(3,3)? "Valid":"not valid"); // v
        System.out.println(sudokuStar.isCellValid(9,1)? "Valid":"not valid"); // v
        System.out.println(sudokuStar.isCellValid(0,150)? "Valid":"not valid"); // n
        System.out.println(sudokuStar.isCellValid(20,20)? "Valid":"not valid");//v
        System.out.println(sudokuStar.isCellValid(10,1)? "Valid":"not valid");//n
        System.out.println(sudokuStar.isCellValid(1,10)? "Valid":"not valid");//n
        System.out.println(sudokuStar.isCellValid(20,13)? "Valid":"not valid");//v
        System.out.println(sudokuStar.isCellValid(12,14)? "Valid":"not valid");//v
        System.out.println(sudokuStar.isCellValid(8,4)? "Valid":"not valid");//v
        System.out.println(sudokuStar.isCellValid(-5,4)? "Valid":"not valid");//n
    }


}
