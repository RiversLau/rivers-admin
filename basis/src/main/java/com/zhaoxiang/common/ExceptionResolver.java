package com.zhaoxiang.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: Rivers
 * Date: 2017/6/28 09:30
 */
public class ExceptionResolver extends AbstractHandlerExceptionResolver {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request,
                                              HttpServletResponse response, Object handler, Exception ex) {

        return null;
    }

    /**
     * 响应Json信息
     *
     * @param response
     * @param jsonString
     */
    private void writeJson(HttpServletResponse response, String jsonString) {

        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        response.setContentType("text/plain;charset=utf-8");
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            pw.println(jsonString);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
