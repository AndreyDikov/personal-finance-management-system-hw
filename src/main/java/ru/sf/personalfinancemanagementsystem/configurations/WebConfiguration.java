package ru.sf.personalfinancemanagementsystem.configurations;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.jspecify.annotations.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.sf.personalfinancemanagementsystem.annotations.handlers.CurrentUserIdAnnotationHandler;

import java.util.List;


@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WebConfiguration implements WebMvcConfigurer {

    CurrentUserIdAnnotationHandler resolver;


    @Override
    public void addArgumentResolvers(
            @NonNull List<HandlerMethodArgumentResolver> resolvers
    ) {
        resolvers.add(resolver);
    }

}
