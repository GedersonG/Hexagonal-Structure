package com.example.Hexastructure.infrastructure.output.mapper;

import com.example.Hexastructure.domain.model.ObjectModel;
import com.example.Hexastructure.infrastructure.output.entity.ObjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IObjectEntityMapper {
    ObjectEntity toObjectEntity(ObjectModel objectModel);

    ObjectModel toObjectModel(ObjectEntity objectEntity);

    List<ObjectModel> toObjectModelList(List<ObjectEntity> objectEntityList);
}
