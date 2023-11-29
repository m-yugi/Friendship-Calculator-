package com.yugi.lovcal_vs.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class lovcalAppInitV2 extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getRootConfigClasses'");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { lovcalAppConfig.class };
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getServletConfigClasses'");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getServletMappings'");
    }

}