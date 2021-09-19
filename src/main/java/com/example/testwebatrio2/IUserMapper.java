package com.example.testwebatrio2;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface IUserMapper {
    UserDto entiteVersDto(UserEntity userEntity);
    UserEntity dtoVersEntite(UserDto userDto);
    List<UserDto> listeEntitesVersListeDto(List<UserEntity> userEntity);
    //List<UserDto> entiteVersListeDtoTriee(List<UserEntity> dataTablesOutput);
}
