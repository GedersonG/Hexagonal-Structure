package com.example.Hexastructure.infrastructure.input.rest;

import com.example.Hexastructure.application.dto.request.ObjectRequestDto;
import com.example.Hexastructure.application.dto.response.ObjectResponseDto;
import com.example.Hexastructure.application.handler.IObjectHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/object")
@RequiredArgsConstructor
public class ObjectRestController {
    private final IObjectHandler objectHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveObject(@RequestBody ObjectRequestDto objectRequestDto){
        objectHandler.saveObject(objectRequestDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<ObjectResponseDto>> getAllObjects(){
        return ResponseEntity.ok(objectHandler.getAllObjects());
    }
}
