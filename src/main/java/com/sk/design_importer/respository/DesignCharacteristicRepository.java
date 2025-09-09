package com.sk.design_importer.respository;
import com.sk.design_importer.model.DesignCharacteristics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DesignCharacteristicRepository extends MongoRepository<DesignCharacteristics,String> {
}
