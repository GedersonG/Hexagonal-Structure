package com.example.Hexastructure.domain.api;

import com.example.Hexastructure.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {
    void saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}
