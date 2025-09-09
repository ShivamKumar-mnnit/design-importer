package com.sk.design_importer.controller;


import com.sk.design_importer.model.Design;
import com.sk.design_importer.service.DesignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
public class DesignController {

    private final DesignService designService;

    @GetMapping("/designs")
    public ResponseEntity<List<Design>> getDesigns(){
        List<Design> designs = designService.getDesigns();
        return ResponseEntity.ok().body(designs);
    }

    @GetMapping("/design/{designId}")
    public  ResponseEntity<Optional<Design>> getDesignById(@PathVariable String designId){
        Optional<Design> design = designService.getDesignById(designId);
        return ResponseEntity.ok().body(design);
    }

    @PostMapping("/designs")
    public ResponseEntity<String> saveDesign(@RequestBody Design design) {
        Boolean success = designService.saveDesign(design);
        if (success) {
            return ResponseEntity.ok("Design saved successfully!");
        } else {
            return ResponseEntity.status(500).body("Failed to save design.");
        }
    }


}
