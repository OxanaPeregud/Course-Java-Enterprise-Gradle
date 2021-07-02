package com.peregud.inputdao.converter;

import javax.servlet.http.HttpServletRequest;

public interface Converter<T> {
    T convert(HttpServletRequest request);
}
