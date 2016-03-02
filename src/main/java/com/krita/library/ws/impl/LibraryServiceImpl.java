package com.krita.library.ws.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.krita.library.dto.Library;
import com.krita.library.repository.LibraryRepository;
import com.krita.library.ws.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by soundar on 19/02/2016.
 */
@RestController("/library/")
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    @Override
    @RequestMapping("get")
    public List getListOfLibraries() {
        List<Library> libraryList = libraryRepository.findAll();
        System.out.println("List"+ libraryList);

        return libraryList;
    }

    @Override
    @RequestMapping("getFunction")
    public String getFunctionsList(String LibraryName) {
        return "library";
    }

    @Override
    @RequestMapping("create")
    public void createLibrary(@RequestParam String libraryName) {
        Library library = new Library(libraryName);
        libraryRepository.save(library);
    }

    @Override
    @RequestMapping("update")
    public void updateLibraryFunctionList(@RequestParam String libraryName, @RequestParam List<String> libraryFunction) {
        Library library = libraryRepository.findByName(libraryName);
        library.addFunction(libraryFunction);
        libraryRepository.save(library);
    }

}
