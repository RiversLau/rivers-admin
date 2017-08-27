package com.zhaoxiang.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: Rivers
 * Date: 2017/6/28 09:44
 */
public class LogInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LogManager.getLogger(LogInterceptor.class);

    private long iniTime;

    /**
     * 方法在DispatcherServlet完全处理完请求后被调用
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

        logger.info("************* TOTAL TIME *************");
        logger.info("************* " + handler.toString() + " *************");

        logger.info("************* REQUEST '" + request.getServletPath() + "' " + (System.currentTimeMillis() - iniTime) + "millis consumed *************");

        logger.info("************* END *************");

        super.afterCompletion(request, response, handler, ex);
    }

    /**
     * 方法在业务处理器处理请求之后被调用
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        try {
            super.postHandle(request, response, handler, modelAndView);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 方法在业务处理器处理请求之前被调用
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        iniTime = System.currentTimeMillis();
        return super.preHandle(request, response, handler);
    }
}
