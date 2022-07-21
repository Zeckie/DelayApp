<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Page</title>
<%
    String css=request.getParameter("css");
    if (css!=null) {
        response.getWriter().println("    <link rel=\"stylesheet\" href=\"stylesheet.css?delay="+css+"\" />");
    }
%>
    <script>
        timer=0;
        window.setInterval(function(){timer+=1;document.getElementById("count").innerHTML=timer/10},100)
    </script>
</head>
<body>
    <h1>Heading</h1>
    <div id="count"></div>
    <%
        String img=request.getParameter("img");
        if (img!=null) {
            response.getWriter().println("<img src=\"square.gif?delay="+img+"\" />");
        }
    %>
</body>
</html>
<!--
This file is part of DelayApp - https://github.com/Zeckie/DelayApp
DelayApp is Copyright (c) 2022 Zeckie

DelayApp is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License as published by the Free
Software Foundation, version 3.

DelayApp is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 for more details.

You should have received a copy of the GNU General Public License along
with DelayApp. If you have the source code, this is in a file called
LICENSE. If you have the DelayApp built and deployed to a server, you
can find the licence in a file called LICENCE
(eg <http://localhost:8080/DeployApp/LICENCE>).
Otherwise, see <https://www.gnu.org/licenses/>.
-->