package com.sk.design_importer.service;

import com.sk.design_importer.model.Design;
import org.apache.el.parser.BooleanNode;

import java.util.List;
import java.util.Optional;

public interface DesignService {
    List<Design> getDesigns();
    Optional<Design> getDesignById(String id);
    Boolean saveDesign(Design design);
}
