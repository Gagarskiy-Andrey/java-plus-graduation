package ru.practicum.explorewithme.api.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import ru.practicum.explorewithme.api.utility.UserMapper;

@AutoConfiguration
@ConditionalOnClass(UserMapper.class)
@ComponentScan(basePackageClasses = UserMapper.class)
public class DtoMapperAutoConfiguration {

}