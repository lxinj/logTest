package com.lxj.logtest.servlet;

import javax.servlet.ServletContext;

/**
 * @author lixinjian
 * @date 2022/6/16
 */
public interface MyWebApplicationInitializer {
    /**
     * 启动时加载
     */
    void loadOnstarp(ServletContext servletContext);
}
