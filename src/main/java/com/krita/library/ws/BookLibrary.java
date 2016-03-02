package com.krita.library.ws;

/**
 * Created by soundar on 19/02/2016.
 */
public interface BookLibrary {

    public String getAllBookList();

    public String getBookGenreList();

    public String getBookListForGenre();

    public String getBookDetails(String name);

    public String createBookGenre();

    public String AddBooks();

    public String updateBooks();
}
