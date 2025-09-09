package com.sk.design_importer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Design")
public class Design {
    @Id
    private String id;
    @Indexed
    private String name;

    private List<Characteristic> designCharacteristics;

    private LocalDateTime createdAt;

}
