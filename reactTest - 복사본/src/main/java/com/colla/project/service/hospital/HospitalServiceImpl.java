package com.colla.project.service.hospital;

import com.colla.project.dto.CityDistrictAreaDTO;
import com.colla.project.dto.HospitalDTO;
import com.colla.project.dto.ResponseDataDTO;
import com.colla.project.entity.Hospital;
import com.colla.project.entity.QHospital;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalServiceImpl extends QuerydslRepositorySupport implements HospitalService {

    public HospitalServiceImpl(){
        super(Hospital.class);
    }

    @Override
    public ResponseDataDTO cityDistrictDetailSearch(CityDistrictAreaDTO cityDistrictAreaDTO) {
        QHospital hospital = QHospital.hospital;
        JPQLQuery<Hospital> query = from(hospital);

        query.where(hospital.cityCode.eq(cityDistrictAreaDTO.getCityCode()));

        if(!cityDistrictAreaDTO.getDistrictCode().equals("시/군/구")){
            BooleanBuilder booleanBuilder = new BooleanBuilder();

            booleanBuilder.or(hospital.districtCode.eq(cityDistrictAreaDTO.getDistrictCode()));

            if(!cityDistrictAreaDTO.getAddressDetailCode().equals("읍/면/동")){
                booleanBuilder.or(hospital.addressDetailCode.eq(cityDistrictAreaDTO.getAddressDetailCode()));
            }

            query.where(booleanBuilder);
        }

        long count = query.fetchCount();

        this.getQuerydsl().applyPagination(cityDistrictAreaDTO.getPageable(), query);

        ResponseDataDTO responseData = new ResponseDataDTO();

        for(Hospital data : query.fetch()){
            HospitalDTO dto = entityToDTO(data);

            responseData.getDataList().add(dto);
            responseData.setTotalCount(count);
        }

        return responseData;
    }
}
