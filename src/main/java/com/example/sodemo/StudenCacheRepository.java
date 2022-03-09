package com.example.sodemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenCacheRepository extends CrudRepository<StudenCacheModel, String> {

}
