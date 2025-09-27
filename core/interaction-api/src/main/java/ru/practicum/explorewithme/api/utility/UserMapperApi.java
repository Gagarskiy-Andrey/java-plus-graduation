package ru.practicum.explorewithme.api.utility;


import org.mapstruct.Mapper;
import ru.practicum.explorewithme.api.client.user.dto.UserDto;
import ru.practicum.explorewithme.api.client.user.dto.UserShortDto;

@Mapper(componentModel = "spring")
public interface UserMapperApi {

    UserShortDto toUserShortDto(UserDto userDto);

}