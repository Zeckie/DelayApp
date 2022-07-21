package org.github.zeckie.delays;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/*")
public class DelayFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if (servletRequest instanceof HttpServletRequest && servletResponse instanceof HttpServletResponse) {
            String delay= servletRequest.getParameter("delay");
            if (delay!=null) {
                try {
                    long delay_ms=Long.parseLong(delay);
                    Thread.sleep(delay_ms);
                    ((HttpServletResponse) servletResponse).setHeader("x-delay-ms",""+delay_ms);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                ((HttpServletResponse) servletResponse).setHeader("x-delay","not specified");
            }
            ((HttpServletResponse) servletResponse).setHeader("Cache-Control","no-store");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

/*
 * This file is part of DelayApp - https://github.com/Zeckie/DelayApp
 * DelayApp is Copyright (c) 2022 Zeckie
 *
 * DelayApp is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation, version 3.
 *
 * DelayApp is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with DelayApp. If you have the source code, this is in a file called
 * LICENSE. If you have the DelayApp built and deployed to a server, you
 * can find the licence in a file called LICENCE
 * (eg <http://localhost:8080/DeployApp/LICENCE>).
 * Otherwise, see <https://www.gnu.org/licenses/>.
 */