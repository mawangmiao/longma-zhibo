//package com.pengshuang.longma.gateway.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.http.HttpStatus;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Slf4j
//public class AuthenticationFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//
//        if (!requestIsAuthorized(request)) {
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//            ctx.setResponseBody("Request is not authorized");
//            return null;
//        }
//        return null;
//    }
//
//    private boolean requestIsAuthorized(HttpServletRequest request) {
//        String token = request.getParameter("token");
//        if (StringUtils.isBlank(token)) {
//            log.info("token为空");
//            return false;
//        }
//        return true;
//    }
//}
