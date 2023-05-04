package com.example.Hexastructure.factory;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.application.dto.response.ObjectResponseDto;
import com.example.Hexastructure.domain.model.ObjectModel;

public class FactoryObjectDataTest {

    public static ObjectModel getObjectModel(){
        return new ObjectModel(1l,"Fonza");
    }

    public static ObjectRequestDto getObjectRequestDto(){
        ObjectRequestDto objectRequestDto = new ObjectRequestDto();
        objectRequestDto.setName("Fonza");
        return objectRequestDto;
    }

    public static ObjectResponseDto getObjectResponseDto(){
        ObjectResponseDto objectResponseDto = new ObjectResponseDto();
        objectResponseDto.setId(1l);
        objectResponseDto.setName("Fonza");
        return objectResponseDto;
    }
}
