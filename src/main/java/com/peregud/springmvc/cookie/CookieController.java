package com.peregud.springmvc.cookie;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class CookieController {

    @GetMapping("/cookie")
    public String readCookie(@CookieValue(value = "username", defaultValue = "Admin") String username) {
        return "My username is " + username;
    }

    @GetMapping("/change-username")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("username", "Oxana");
        cookie.setMaxAge(7 * 24 * 60 * 60);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setPath("/cookie");
        response.addCookie(cookie);
        return "Username is changed";
    }

    @GetMapping("/delete-username")
    public String deleteCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("username", null);
        cookie.setMaxAge(0);
        cookie.setSecure(true);
        cookie.setHttpOnly(true);
        cookie.setPath("/cookie");
        response.addCookie(cookie);
        return "Username is deleted";
    }

    @GetMapping("/all-cookies")
    public String readAllCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            return Arrays.stream(cookies)
                    .map(c -> c.getName() + " = " + c.getValue()).collect(Collectors.joining(", "));
        }
        return "No cookies";
    }
}
