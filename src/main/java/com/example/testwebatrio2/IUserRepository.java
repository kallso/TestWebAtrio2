package com.example.testwebatrio2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByNom(@Param("nom") String nom);

}

