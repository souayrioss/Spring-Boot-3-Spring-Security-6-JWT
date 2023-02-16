package org.roronoa.banklygateway.util;


import org.modelmapper.ModelMapper;
import org.roronoa.banklygateway.dto.UserDto;
import org.roronoa.banklygateway.entity.User;

import java.security.SecureRandom;

import static org.roronoa.banklygateway.util.IConstantes.CAPS;
import static org.roronoa.banklygateway.util.IConstantes.LENGTH;


public class EntityUtils {

    private static final SecureRandom random = new SecureRandom();



    public static String generateReference() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CAPS.length());
            result.append(CAPS.charAt(index));
        }
        return result.toString();
    }



    public static UserDto userToUserDTO(User user) {
        ModelMapper modelMapper=new ModelMapper();
        return modelMapper.map(user, UserDto.class);
    }
    public static User userDTOToUser(UserDto userDto) {
        ModelMapper modelMapper=new ModelMapper();
        return modelMapper.map(userDto, User.class);
    }


}
