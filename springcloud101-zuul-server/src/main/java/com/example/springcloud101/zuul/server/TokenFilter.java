package com.example.springcloud101.zuul.server;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class TokenFilter extends ZuulFilter {

  @Override
  public int filterOrder() {
    return PRE_DECORATION_FILTER_ORDER - 1;
  }

  @Override
  public String filterType() {
    return PRE_TYPE;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    String token = request.getParameter("token");
    if (token == null) {
      ctx.setSendZuulResponse(false);
      ctx.setResponseStatusCode(401);
      try {
        ctx.getResponse().setCharacterEncoding("UTF-8");
        ctx.getResponse().getWriter().write("禁止访问");
      } catch (IOException e){
        e.printStackTrace();
      }
      return null;
    }
    return null;
  }
}
