package com.sk.design_importer.service.impl;

import com.sk.design_importer.model.Design;
import com.sk.design_importer.respository.DesignRepository;
import com.sk.design_importer.service.DesignService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DesignServiceImpl implements DesignService {

    private final DesignRepository designRepository;

    @Override
    public List<Design> getDesigns(){
        try{
            return designRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Design> getDesignById(String id){
        try{
            return designRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Boolean saveDesign(Design design) {
        try {
            designRepository.save(design);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
