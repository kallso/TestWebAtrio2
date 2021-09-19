package com.example.testwebatrio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository IUserRepository;

    @Override
    public List<UserEntity> getAll() {
        return IUserRepository.findAll();
    }

    @Override
    public List<UserEntity> findAll() {
        return IUserRepository.findAll();
    }

    @Override
    public UserEntity findById(Long id) {
        return IUserRepository.getOne(id);
    }

    @Override
    public UserEntity save(UserEntity newUser) {
        return IUserRepository.save(newUser);
    }

    @Override
    public UserEntity update(UserEntity medecinEntity) {
        return IUserRepository.saveAndFlush(medecinEntity);
    }

    @Override
    public void deleteById(Long id) {
        IUserRepository.deleteById(id);
    }

    @Override
    public List<UserEntity> findByNom(String nom) {
        return IUserRepository.findByNom(nom);
    }

}

