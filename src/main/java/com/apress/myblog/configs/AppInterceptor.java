package com.apress.myblog.configs;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

public class AppInterceptor extends WebRequestHandlerInterceptorAdapter {
    public AppInterceptor(WebRequestInterceptor requestInterceptor) {
        super(requestInterceptor);
    }
}
