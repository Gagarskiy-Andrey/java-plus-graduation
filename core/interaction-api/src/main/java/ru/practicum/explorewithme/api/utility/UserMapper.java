package ru.practicum.explorewithme.api.utility;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import ru.practicum.explorewithme.api.client.user.dto.UserDto;
import ru.practicum.explorewithme.api.client.user.dto.UserShortDto;

@Mapper(componentModel = "spring")
@Component("userMapperApiImpl")
public interface UserMapper {

    UserShortDto toUserShortDto(UserDto userDto);

}