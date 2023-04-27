package com.example.Hexastructure.application.mapper;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IObjectRequestMapper {
    ObjectModel toObjectModel(ObjectRequestDto objectRequestDto);
}
