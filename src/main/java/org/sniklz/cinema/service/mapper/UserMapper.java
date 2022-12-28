package org.sniklz.cinema.service.mapper;

import java.util.stream.Collectors;
import org.sniklz.cinema.dto.response.UserResponseDto;
import org.sniklz.cinema.model.Role;
import org.sniklz.cinema.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoleIds(user.getRoles()
                .stream()
                .map(Role::getId)
                .collect(Collectors.toList()));
        return responseDto;
    }
}
