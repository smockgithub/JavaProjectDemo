package com.springboot.springbootwebdemo1.controller;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import io.jsonwebtoken.Claims;
import jd.union.open.order.query.request.OrderReq;
import jd.union.open.order.query.request.UnionOpenOrderQueryRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.io.UnsupportedEncodingException;
import java.security.Key;

//@ResponseBody //当前类的所有内容都写给浏览器，或者用RestController标注替代ResponseBody和Controller
//@Controller

@RestController
public class HelloController {

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/hello")
    public String hello() {

//        JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret);
//        UnionOpenOrderQueryRequest request=new UnionOpenOrderQueryRequest();
//        OrderReq orderReq=new OrderReq();
//        orderReq.setPageNo(1);
//        request.setOrderReq(orderReq);
//        UnionOpenOrderRowQueryResponse response=client.execute(request);

        String jwt="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiIiwianRpIjoiMTYiLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL2V4cGlyYXRpb24iOiIxMC8xMy8yMDIwIDE5OjU2OjExIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQW5jaG9yIiwibW9iaWxlIjoiMTUyNjcxMzEyMDkiLCJ1c2VyVHlwZSI6IkFuY2hvciIsImlkZW50aXRlZCI6IlRydWUiLCJiYW5rQWNjb3VudElkZW50aXRlZCI6IlRydWUiLCJuYmYiOjE2MDIzMzA5NzEsImV4cCI6MTYwMjQxNzM3MSwiaXNzIjoiUWNMaXZlLkFwaSIsImF1ZCI6ImphIn0.wiicEHrvJBkeAJyFEmHP6cvghASHtXP0_7I3YxGVtGc";
        String key = "sdfsdfsrty45634kkhllghtdgdfss345t678fs";
        try{
            Claims claims = Jwts.parser()
                    .setSigningKey(key.getBytes("UTF-8"))
                    .parseClaimsJws(jwt).getBody();

            return  "验证通过";
        }catch (Exception e){
            return  "验证失败";
        }


        //return "Hello";
    }
}
