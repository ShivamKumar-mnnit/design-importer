package com.sk.design_importer.respository;

import com.sk.design_importer.model.Characteristic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacteristicRepository extends MongoRepository<Characteristic,String> {
}
