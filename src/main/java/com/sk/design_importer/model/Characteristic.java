package com.sk.design_importer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Design_Characteristics_Mapping")
public class Characteristic {
    @Id
    private String designId;

    private List<DesignCharacteristics> designCharacteristics;

}
