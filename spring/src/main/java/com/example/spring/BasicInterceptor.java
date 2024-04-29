package com.example.spring;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class BasicInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(BasicInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("time")){
            logger.info("{}", request.getHeader("User-Agent"));
            return true;
        }
        logger.info("you did not make the cut");
        return false;
    }
}
