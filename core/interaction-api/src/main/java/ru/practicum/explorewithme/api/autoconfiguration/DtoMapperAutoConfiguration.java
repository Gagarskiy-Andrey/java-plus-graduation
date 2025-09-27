package ru.practicum.explorewithme.api.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import ru.practicum.explorewithme.api.utility.UserMapperApi;

@AutoConfiguration
@ConditionalOnClass(UserMapperApi.class)
@ComponentScan(basePackageClasses = UserMapperApi.class)
public class DtoMapperAutoConfiguration {

}