package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exceptions.LibraryException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookManager {
    public List<Book> getAll() throws LibraryException {
        return DaoFactory.bookDao().getAll();
    }
    public void viewAll() throws LibraryException {
        DaoFactory.bookDao().viewAll();
    }
    public List<Book> searchByAuthor(String author) throws LibraryException {
        return DaoFactory.bookDao().searchByAuthor(author);
    }
    public List<Book> searchByGenre(String genre) throws LibraryException {
        return DaoFactory.bookDao().searchByGenre(genre);
    }

    public List<Book> searchByTitle(String title) throws LibraryException {
        return DaoFactory.bookDao().searchByTitle(title);
    }

   /* public Book searchByTitleAndAuthor(String title, String author) throws LibraryException {
        return DaoFactory.bookDao().searchByTitleAndAuthor(title, author);
    }*/

    public boolean isAvailable(int id) throws LibraryException {
        return DaoFactory.bookDao().isAvailable(id);
    }
    public Book add(Book item) throws LibraryException {
        return DaoFactory.bookDao().add(item);
    }

    public Book update(Book item) throws LibraryException {
        return DaoFactory.bookDao().update(item);
    }

    public void delete(Book item) throws LibraryException {
        DaoFactory.bookDao().delete(item);
    }


   /* @Override
    public Book getById(int id) throws LibraryException {
        return DaoFactory.bookDao().getB
    }*/

    public Book searchById(int id) throws LibraryException {
        return DaoFactory.bookDao().searchById(id);
    }
    public List<Book> removeAll() throws LibraryException {
        return DaoFactory.bookDao().removeAll();
    }

}
