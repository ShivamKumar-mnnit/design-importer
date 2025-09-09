package com.sk.design_importer.respository;

import com.sk.design_importer.model.Design;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DesignRepository extends MongoRepository<Design,String> {
}
