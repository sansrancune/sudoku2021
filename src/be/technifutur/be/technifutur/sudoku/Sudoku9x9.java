package be.technifutur.be.technifutur.sudoku;

public class Sudoku9x9 implements ISudoku{

    char[][] grid = new char[9][9];

    public void gridFiller(){
        for (int i=0; i< grid.length;i++){
            for (int j=0; j< grid.length;i++){
                grid[i][j]=EMPTY;
            }
        }
    }

    @Override
    public void addValue(int row, int col, char value) {
        if( isValueValid(value) && isCellValid(row,col)){
            grid[row][col]=value;
        }
    }

    @Override
    public char getValue(int row, int col) {
        return grid[row][col];
    }

    @Override
    public boolean isValueValid(char value) {

        if (Character.getNumericValue(value)<= grid.length && Character.getNumericValue(value)>0){
            return true;
        }
        else return false;

    }

    @Override
    public boolean isCellValid(int row, int col) {
        if(row<grid.length && row>=0 && col<grid.length && col>=0){
            return true;
        }
        else return false;

    }
}
