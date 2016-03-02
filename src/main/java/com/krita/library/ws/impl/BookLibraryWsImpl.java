package com.krita.library.ws.impl;

import com.krita.library.ws.BookLibrary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by soundar on 19/02/2016.
 */
@RestController("/")
public class BookLibraryWsImpl implements BookLibrary {

    @RequestMapping("/GetBookList")
    @Override
    public String getAllBookList() {
        return "BookList";
    }

    @Override
    public String getBookGenreList() {
        return null;
    }

    @Override
    public String getBookListForGenre() {
        return null;
    }

    @Override
    public String getBookDetails(String name) {
        return null;
    }

    @Override
    public String createBookGenre() {
        return null;
    }

    @Override
    public String AddBooks() {
        return null;
    }

    @Override
    public String updateBooks() {
        return null;
    }
}
