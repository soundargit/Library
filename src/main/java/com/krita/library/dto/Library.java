package com.krita.library.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by soundar on 24/02/2016.
 */

@JsonAutoDetect
public class Library implements Serializable {

    @JsonProperty
    @Id
    private String id;

    @JsonProperty
    private String name;


    private List<String> functions = new ArrayList<String>();

    public Library() {
    }

    public List<String> getFunctions() {
        return functions;
    }

    public void addFunction(List<String> functionName) {
        functions.addAll(functionName);
    }

    public Library(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Library[id=%s, name='%s']",
                id, name, name);
    }

}
