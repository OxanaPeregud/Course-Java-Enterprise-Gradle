package com.peregud.springmvc.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SessionListenerController {
    private static final Logger LOG = LoggerFactory.getLogger(SessionListenerController.class);

    @GetMapping("/create-new-session")
    public String createNewSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            LOG.info("Session not available, creating new session");
            session = request.getSession(true);
        }
        return "Session is available now: " + session.getId();
    }

    @GetMapping("/destroy-active-session")
    public String removeSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
            return "Session Destroyed: " + session.getId();
        }
        return "Session is not available to destroy";
    }
}
