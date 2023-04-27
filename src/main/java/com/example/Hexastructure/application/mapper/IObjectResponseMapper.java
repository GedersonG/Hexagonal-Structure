package com.example.Hexastructure.application.mapper;

import com.example.Hexastructure.application.dto.response.ObjectResponseDto;
import com.example.Hexastructure.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IObjectResponseMapper {
    ObjectResponseDto toObjectResponseDto(ObjectModel objectModel);

    List<ObjectResponseDto> toResponseDtoList(List<ObjectModel> objectModelList);
}
