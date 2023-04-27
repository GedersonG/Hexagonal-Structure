package com.example.Hexastructure.application.handler.handlerImpl;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.application.dto.response.ObjectResponseDto;
import com.example.Hexastructure.application.handler.IObjectHandler;
import com.example.Hexastructure.application.mapper.IObjectRequestMapper;
import com.example.Hexastructure.application.mapper.IObjectResponseMapper;
import com.example.Hexastructure.domain.api.IObjectServicePort;
import com.example.Hexastructure.domain.model.ObjectModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class ObjectHandler implements IObjectHandler {

    private final IObjectServicePort objectServicePort;
    private final IObjectRequestMapper objectRequestMapper;
    private final IObjectResponseMapper objectResponseMapper;
    @Override
    public void saveObject(ObjectRequestDto objectRequestDto) {
        ObjectModel objectModel = objectRequestMapper.toObjectModel(objectRequestDto);
        objectServicePort.saveObject(objectModel);
    }

    @Override
    public List<ObjectResponseDto> getAllObjects() {
        return objectResponseMapper.toResponseDtoList(objectServicePort.getAllObjects());
    }
}
