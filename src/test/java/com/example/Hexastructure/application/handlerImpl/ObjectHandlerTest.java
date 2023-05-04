package com.example.Hexastructure.application.handlerImpl;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.application.dto.response.ObjectResponseDto;
import com.example.Hexastructure.application.mapper.IObjectRequestMapper;
import com.example.Hexastructure.application.mapper.IObjectResponseMapper;
import com.example.Hexastructure.domain.api.IObjectServicePort;
import com.example.Hexastructure.domain.model.ObjectModel;
import com.example.Hexastructure.factory.FactoryObjectDataTest;
import com.example.Hexastructure.infrastructure.output.entity.ObjectEntity;
import com.example.Hexastructure.infrastructure.output.repository.IObjectRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class ObjectHandlerTest {

    @InjectMocks
    ObjectHandler objectHandler;

    @Mock
    IObjectServicePort objectServicePort;

    @Mock
    IObjectRequestMapper objectRequestMapper;

    @Mock
    IObjectResponseMapper objectResponseMapper;

    @Test
    void mustSaveAnObject() {
        //Given
        ObjectRequestDto requestDto = FactoryObjectDataTest.getObjectRequestDto();

        ObjectModel objectModel = FactoryObjectDataTest.getObjectModel();

        //When
        when(objectRequestMapper.toObjectModel(any())).thenReturn(objectModel);

        objectHandler.saveObject(requestDto);

        //Then
        verify(objectServicePort).saveObject(any(ObjectModel.class));
    }

    @Test
    void throwObjectAlreadyExistExceptionWhenAttemptSaveObject(){
        //Logic for exception test

        //Assert throw for this case
    }

    @Test
    void getAllObjects() {
    }
}