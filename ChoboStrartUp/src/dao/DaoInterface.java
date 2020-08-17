package dao;

// метод insert - добавление строки;
// метод update - изменение строки;
// метод delete - заполнение строки;

import java.sql.SQLException;

public interface DaoInterface<T> {
    public void insert(T ob) throws SQLException;
    public void update(T ob);
    public void delete(T ob);
}
