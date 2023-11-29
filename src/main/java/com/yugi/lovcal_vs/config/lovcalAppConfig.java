package com.yugi.lovcal_vs.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.yugi.lovcal_vs")
@PropertySource("classpath:email.properties")
public class lovcalAppConfig implements WebMvcConfigurer {
    @Autowired
    private Environment env;

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    // public void addFormatters(FormatterRegistry registry) {
    // registry.addFormatter(new phoneFormatter());
    // registry.addFormatter(new cardFormatter());
    // registry.addFormatter(new amountFormatter());
    // registry.addConverter(new creditCardConverter());
    // registry.addConverter(new cardToStringConverter());
    // }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource message = new ResourceBundleMessageSource();
        message.setBasename("messages");
        return message;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validate = new LocalValidatorFactoryBean();
        validate.setValidationMessageSource(messageSource());
        return validate;
    }

    @Bean
    public JavaMailSender sendJavaMailSender() {
        JavaMailSenderImpl mailsender = new JavaMailSenderImpl();
        mailsender.setHost(env.getProperty("email.host"));
        mailsender.setUsername(env.getProperty("email.username"));
        mailsender.setPassword(env.getProperty("email.password"));
        mailsender.setPort(convertToInt(env.getProperty("email.port")));

        mailsender.setJavaMailProperties(getProperties());
        return mailsender;

    }

    @Override
    public Validator getValidator() {
        return validator();
    }

    public int convertToInt(String number) {
        return Integer.parseInt(number);
    }

    public Properties getProperties() {
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.starttls.enable", true);
        mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        return mailProperties;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}