package com.sk.design_importer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Design_Characteristics")
public class DesignCharacteristics {
    @Id
    private String characteristicId;

    private String name;
    private String type;
    private String version;
    private String description;
    private LocalDateTime createdAt;

}
