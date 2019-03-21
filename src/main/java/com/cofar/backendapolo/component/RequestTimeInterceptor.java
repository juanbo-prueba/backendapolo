package com.cofar.backendapolo.component;

import com.cofar.backendapolo.component.model.Log;
import com.cofar.backendapolo.component.repository.LogRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LogManager.getLogger(RequestTimeInterceptor.class);

    @Autowired
    @Qualifier("logRepository")
    private LogRepository logRepository;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long starTime = (long) request.getAttribute("startTime");
        String url = request.getRequestURL().toString();
        Long tiempoRespuestta = System.currentTimeMillis() - starTime;
        Log log = new Log( new Date(), "","", url, tiempoRespuestta.toString() );
        logRepository.guardarLog( log );
        LOG.info("--REQUEST URL: '" + url + "' -- TOTAL TIEMPO: '" + (System.currentTimeMillis() - starTime) + "'ms");
    }
}
