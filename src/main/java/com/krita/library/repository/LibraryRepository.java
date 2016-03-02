package com.krita.library.repository;

import com.krita.library.dto.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by soundar on 24/02/2016.
 */
public interface LibraryRepository extends MongoRepository<Library, String> {

    public Library findByName(String name);

}
