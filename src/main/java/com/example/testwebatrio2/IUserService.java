package com.example.testwebatrio2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<UserEntity> getAll();
    List<UserEntity> findAll();
    List<UserEntity> findByNom(String nom);
    UserEntity findById(Long id);
    UserEntity save(UserEntity userEntity);
    UserEntity update(UserEntity userEntity);
    void deleteById(Long id);
}
