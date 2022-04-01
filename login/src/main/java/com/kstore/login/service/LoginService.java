package com.kstore.login.service;

import com.kstore.login.entity.Login;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Slf4j
public class LoginService {

    private AtomicLong idSequence = new AtomicLong();

    private List<Login> guests = new ArrayList<Login>();

    public Boolean singUp(String login, String password){
        Login newGuest = new Login(idSequence.incrementAndGet(),login, password);
        guests.add(newGuest);
        return true;
    }

    public Boolean singIn(String login, String password){
        log.info("Realizando login");
       return guests.stream().allMatch(guest -> guest.getPassword().equals(password) && guest.getUser().equals(login));
    }
}
