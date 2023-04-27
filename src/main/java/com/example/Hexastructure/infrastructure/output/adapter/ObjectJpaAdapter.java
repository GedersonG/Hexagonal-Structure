package com.example.Hexastructure.infrastructure.output.adapter;

import com.example.Hexastructure.domain.model.ObjectModel;
import com.example.Hexastructure.domain.spi.IObjectPersistencePort;
import com.example.Hexastructure.infrastructure.exception.NoDataFoundException;
import com.example.Hexastructure.infrastructure.output.entity.ObjectEntity;
import com.example.Hexastructure.infrastructure.output.mapper.IObjectEntityMapper;
import com.example.Hexastructure.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ObjectJpaAdapter implements IObjectPersistencePort {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;


    @Override
    public ObjectModel saveObject(ObjectModel objectModel) {
        ObjectEntity objectEntity = objectRepository.save(objectEntityMapper.toObjectEntity(objectModel));
        return objectEntityMapper.toObjectModel(objectEntity);
    }

    @Override
    public List<ObjectModel> getAllObjects() {
        List<ObjectEntity> entityList = objectRepository.findAll();
        if(entityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return objectEntityMapper.toObjectModelList(entityList);
    }
}
