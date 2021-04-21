package be.technifutur.be.technifutur.sudoku;

public interface ISudoku {

    public void addValue(int row, int col, char value);
    public char getValue(int row, int col);
    public boolean isValueValid(char Value);
    public boolean isCellValid(int row, int col);
}
