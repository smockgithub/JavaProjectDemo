package com.springboot.springbootwebdemo1.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerIntercept implements HandlerInterceptor {
    //执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        return  true;
//        if(loginUser==null){
//            //未登录
//            //getRequestDispatcher 是转发器。forward转发出去
//            request.setAttribute("msg","没用权限，请登录");
//            request.getRequestDispatcher("/index.html").forward(request,response);
//
//            return  false;
//        }else{
//            return  true;
//        }
        //return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
