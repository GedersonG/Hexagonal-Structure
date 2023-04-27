package com.example.Hexastructure.domain.spi;

import com.example.Hexastructure.domain.model.ObjectModel;

import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}
