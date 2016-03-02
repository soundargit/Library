package com.krita.library.ws;

import com.krita.library.dto.Library;

import java.util.List;

/**
 * Created by soundar on 19/02/2016.
 */
public interface LibraryService {

    public List<Library> getListOfLibraries();

    public String getFunctionsList(String LibraryName);

    public void createLibrary(String libraryName);

    public void updateLibraryFunctionList(String libraryName, List<String> libraryFunction);

}
