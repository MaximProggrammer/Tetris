package tetris;

import java.util.Collections;
import java.util.Vector;

public class Mesh {

    // Vector устаревший тип для коллекций, но для данной задачи подойдет
    private final Vector< Vector<Boolean> > _cells;

    // Конструктор
    Mesh(int rowCount, int colCount)
    {
        _cells = new Vector<>();
        // Устанавливаем количество строк сетки
        _cells.setSize(rowCount);

        // ДЛя каждой строки создаем столбцы и устанавливаем их количество
        for(int i = 0; i < _cells.size(); i++)
        {
            Vector<Boolean> cols = new Vector<Boolean>();
            cols.setSize(colCount);
            // Заполняем наш вектор значением false, иначе в нем будут null
            Collections.fill(cols, false);
            _cells.set(i, cols);
        }
    }

    public int getRowCount()
    {
        return _cells.size();
    }

    public int getColCount()
    {
        if( _cells.isEmpty() )
            return 0;

        return _cells.get(0).size();
    }

    public void setCellValue(int row, int col, Boolean value)
    {
        if( row > -1 && row < _cells.size() )
        {
            if( col > -1 && col < _cells.get(row).size() )
            {
                _cells.get(row).set(col, value);
            }
        }
    }

    public Boolean getValue(int row, int col)
    {
        if( row > -1 && row < _cells.size() )
        {
            if( col > -1 && col < _cells.get(row).size() )
            {
                return _cells.get(row).get(col);
            }
        }
        return false;
    }
}