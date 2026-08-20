
public record Position(int row, int column) {}

class Solution {
    List<List<Integer>> smallSqaure = List.of(List.of(0, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8));
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<Position>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    List<Position> posList = map.getOrDefault(board[i][j] - 'a', new ArrayList<>());
                    if (map.containsKey(board[i][j] - 'a')) {
                        for (Position pos : posList) {
                            if (pos.row() == i || pos.column() == j
                                || isInSamllSquare(i, j, pos.row(), pos.column())) {
                                return false;
                            }
                        }
                    }
                    posList.add(new Position(i, j));
                    map.put(board[i][j] - 'a', posList);
                }
            }
        }
        return true;
    }

    boolean isInSamllSquare(int i, int j, int k, int l) {
        boolean isRow = false;
        boolean isColumn = false;
        for (List<Integer> tempList : smallSqaure) {
            if (tempList.contains(i) && tempList.contains(k) && Math.abs(i - k) <= 2) {
                isRow = true;
            }
            if (tempList.contains(j) && tempList.contains(l) && Math.abs(j - l) <= 2) {
                isColumn = true;
            }
        }
        return isRow && isColumn;
    }
}

// go through each element check if column or row is same then return false

// diff between row and column
