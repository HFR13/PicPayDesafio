package com.picpay.picpaysimplificado.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpay.picpaysimplificado.domain.UserType;
import com.picpay.picpaysimplificado.domain.user.User;
import com.picpay.picpaysimplificado.dtos.UserDTO;
import com.picpay.picpaysimplificado.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception{
        if(sender.getUserType() == UserType.MERCHANT){
              throw new Exception("Usuário do tipo logista não está autorizado a realizar transação");
        }

        if(sender.getBalance().compareTo(amount) < 0 ){
              throw new Exception("Usuário com saldo insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception{

        return this.userRepository.findById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));

    }


    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
   
    }

    public void saveUser(User user){
        this.userRepository.save(user);
    }

    
}
