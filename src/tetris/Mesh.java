package tetris;

import java.util.Collections;
import java.util.Vector;

public class Mesh {

    private final Vector<Vector<Boolean>> _cells;

    Mesh(int rowCount, int colCount) {
        _cells = new Vector<>();
        _cells.setSize(rowCount);

        for (int i = 0; i < _cells.size(); i++) {
            Vector<Boolean> cols = new Vector<Boolean>();
            cols.setSize(colCount);

            Collections.fill(cols, false);
            _cells.set(i, cols);
        }
    }

    public int getRowCount() {
        return _cells.size();
    }

    public int getColCount() {
        if (_cells.isEmpty())
            return 0;

        return _cells.get(0).size();
    }

    public void setCellValue(int row, int col, Boolean value) {
        if (row > -1 && row < _cells.size()) {
            if (col > -1 && col < _cells.get(row).size()) {
                _cells.get(row).set(col, value);
            }
        }
    }

    public Boolean getValue(int row, int col) {
        if (row > -1 && row < _cells.size()) {
            if (col > -1 && col < _cells.get(row).size()) {
                return _cells.get(row).get(col);
            }
        }
        return false;
    }
}