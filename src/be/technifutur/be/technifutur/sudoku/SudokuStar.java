package be.technifutur.be.technifutur.sudoku;

public class SudokuStar implements ISudoku{

    char[][] grid = new char[7][7];
    boolean outsideCell;

    public void gridFiller(char[][] grid){
        for (int i=0; i< grid.length;i++){
            for (int j=0; j< grid.length;i++){
                grid[i][j]=' ';
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
        if(row<grid.length && row>=0 && col<grid.length && col>=0 && !outsideCell(row,col)){
            return true;
        }
        else return false;

    }
    public boolean outsideCell(int row, int col){
        int dimension= (grid.length - 1) /2;
        int middle= (grid.length/2)+1;
        int firstSide =(grid.length-dimension)/2; // =2
        int lastSide =grid.length-((grid.length-dimension)/2); // =5

        if((row==middle && col < firstSide) || (row==middle && col >= lastSide)){
            return true;
        }
        else if((col==middle && row < firstSide) || (col==middle && row >= lastSide)){
            return true;
        }
        else return false;


    }
}
