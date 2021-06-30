package com.peregud.springmvc.session;

import org.springframework.context.annotation.Bean;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CustomHttpSessionListener implements HttpSessionListener {

    @Bean
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent sessionEvent) {
                System.out.println("Session Created with session id: " + sessionEvent.getSession().getId());
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent sessionEvent) {
                System.out.println("Session Destroyed, Session id: " + sessionEvent.getSession().getId());
            }
        };
    }
}
