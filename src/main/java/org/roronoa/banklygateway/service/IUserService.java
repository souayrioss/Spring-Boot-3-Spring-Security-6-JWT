package org.roronoa.banklygateway.service;

import org.roronoa.banklygateway.dto.AuthDto;
import org.roronoa.banklygateway.entity.User;

import java.util.List;

public interface IUserService {
    User save(User user);
    User getUser(String uuid);
    List<User> getListUsers();

    User findByEmail(AuthDto authDto);


}