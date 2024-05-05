public class ValidSudoku {

    int[][] sudoku;
    int row;
    int column;

    public ValidSudoku(int row, int column){
        this.row=row;
        this.column=column;
        this.sudoku=new int[row][column];
    }

    //Each row must contain the digits 1-9 without repetition.
    public boolean validateRow() {

        for (int i = 0; i < row; i++) {

        }
        return true;
    }

    //Each column must contain the digits 1-9 without repetition.
    public boolean validateColumn() {
        for (int i = 0; i < column; i++) {

        }
        return true;
    }

    //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    public boolean validateSubBox() {

        return true;
    }

}
