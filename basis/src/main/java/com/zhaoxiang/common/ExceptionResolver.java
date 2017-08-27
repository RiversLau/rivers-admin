package com.zhaoxiang.common;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/6/28 09:30
 */
public class ExceptionResolver extends AbstractHandlerExceptionResolver {

    private Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request,
                                              HttpServletResponse response, Object handler, Exception ex) {

        //得到操作的方法
        int errcode = ReturnCode.SYSTEM_EXCEPTION_CODE;

        String errMsg = "系统错误!";
        if (ex != null) {
            logger.error(ex.getMessage(), ex);
            if (ex instanceof FatalBizException) {
                errcode = ((FatalBizException) ex).getErrorcode();
                logger.info("FatalBizException:" + ex.getMessage());
                errMsg = ex.getMessage();
            }

        }

        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("returnCode", errcode);
        jsonMap.put("message", errMsg);
        writeJson(response, JSON.toJSONString(jsonMap));
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
