package com.example.Hexastructure.infrastructure.configuration;

import com.example.Hexastructure.domain.api.IObjectServicePort;
import com.example.Hexastructure.domain.spi.IObjectPersistencePort;
import com.example.Hexastructure.domain.usecase.ObjectUseCase;
import com.example.Hexastructure.infrastructure.output.adapter.ObjectJpaAdapter;
import com.example.Hexastructure.infrastructure.output.mapper.IObjectEntityMapper;
import com.example.Hexastructure.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort(){
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }

    @Bean
    public IObjectServicePort objectServicePort(){
        return new ObjectUseCase(objectPersistencePort());
    }
}
