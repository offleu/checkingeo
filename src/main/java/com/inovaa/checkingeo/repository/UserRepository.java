package com.inovaa.checkingeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inovaa.checkingeo.entinty.User;

//usar <Entidade que vai ser manipulado, tipo do Id>

public interface UserRepository extends JpaRepository<User, Long> {

}
