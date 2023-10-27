package com.picpay.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
   Optional<User> findUserByDocument(String document);
   /*Este método "findUserByDocument" significa que vai buscar o Usuário
    *pelo Documento. 
    *
    *Usa-se o "Optional" porque nem sempre irá ser retornado um Usuário, 
    *ou seja, pode retorna outro coisa. 
    */

     Optional<User> findUserById(Long id);

}
