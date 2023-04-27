package com.example.Hexastructure.application.handler;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.application.dto.response.ObjectResponseDto;

import java.util.List;

public interface IObjectHandler {
    void saveObject(ObjectRequestDto objectRequestDto);

    List<ObjectResponseDto> getAllObjects();
}
