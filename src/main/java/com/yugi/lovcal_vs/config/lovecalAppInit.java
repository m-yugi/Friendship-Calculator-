// package com.yugi.lovcal_vs.config;

// import jakarta.servlet.ServletContext;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.ServletRegistration;

// import org.springframework.web.WebApplicationInitializer;
// import
// org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
// import org.springframework.web.context.support.XmlWebApplicationContext;
// import org.springframework.web.servlet.DispatcherServlet;

// public class lovecalAppInit implements WebApplicationInitializer {
// public void onStartup(ServletContext servletContext) throws ServletException
// {
// AnnotationConfigWebApplicationContext context = new
// AnnotationConfigWebApplicationContext();
// context.register(lovcalAppConfig.class);
// DispatcherServlet dispatch = new DispatcherServlet(context);
// ServletRegistration.Dynamic register = servletContext.addServlet("dispatch",
// dispatch);
// register.setLoadOnStartup(1);
// register.addMapping("/");
// }
// }
