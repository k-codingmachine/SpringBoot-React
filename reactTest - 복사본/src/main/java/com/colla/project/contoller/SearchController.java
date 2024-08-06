package com.colla.project.contoller;

import com.colla.project.dto.CityDistrictAreaDTO;
import com.colla.project.dto.ResponseDataDTO;
import com.colla.project.service.hospital.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/search")
public class SearchController {

    private final HospitalService hospitalService;

    @PostMapping("/cityDistrictDetail")
    public ResponseDataDTO cityDistrictDetailSearch(@RequestBody CityDistrictAreaDTO cityDistrictAreaDTO){
        System.out.println(cityDistrictAreaDTO);
        return hospitalService.cityDistrictDetailSearch(cityDistrictAreaDTO);
    }
}
