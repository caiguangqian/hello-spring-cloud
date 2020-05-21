package com.funtl.hello.spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.ResponseContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/20 12:23
 **/

@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currrentContext= RequestContext.getCurrentContext();
        HttpServletRequest request=currrentContext.getRequest();
        String token=request.getParameter("token");
        //token为空，不发相应
        if(token==null){
            currrentContext.setSendZuulResponse(false);
            currrentContext.setResponseStatusCode(401);
            try {
                HttpServletResponse response=currrentContext.getResponse();
                response.setContentType("text/html;charset=utf-8");
                currrentContext.getResponse().getWriter().write("非法请求");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
