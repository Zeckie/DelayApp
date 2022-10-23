
DelayApp is a simple, no frills web app was primarily created to help troubleshoot an 
[issue with Playwright taking screenshots](https://github.com/microsoft/playwright-python/issues/1420). 
It simulates a slow loading page, by introducing delays between when resources were requested, 
and the server sending a response to those requests.
The length of the delay is configurable using URL parameters.

| Parameter | Description                                                                          |
|-----------|--------------------------------------------------------------------------------------|
| delay     | Number of milliseconds to wait before sending response. Can be used for any request. |
| css       | Delay to use for stylesheet. Can be used with `page.jsp` only.                       |
| img       | Delay to use for image. Can be used with `page.jsp` only.                            |

## Running

### With Gradle (Gretty)

Requires Java 11 - 18 
(Java 8 - 18 for [Gradle 7.5](https://docs.gradle.org/7.5/userguide/compatibility.html), 
Java 11+ for [Jetty 11](https://www.eclipse.org/jetty/)
and [Gretty 4](https://github.com/gretty-gradle-plugin/gretty#readme))

The following command uses Gradle to build DelayApp from source and runs it using Jetty.

```
gradlew appRun
```

Output should be similar to:

```
C:\Zeckie\DelayApp>gradlew appRun
12:34:56 INFO  Jetty 11.0.11 started and listening on port 8080
12:34:56 INFO  DelayApp runs at:
12:34:56 INFO    http://localhost:8080/DelayApp

> Task :appRun
Press any key to stop the server.
<===========--> 87% EXECUTING [59s]
> :appRun
```

Navigate to that URL using a browser

### With Tomcat

Requires an existing installation of Tomcat 10.0
(version [10.0.x is compatible with Servlet 5.0](https://tomcat.apache.org/whichversion.html)).

These instructions assume default Tomcat settings.

Copy DelayApp war file (such as `DelayApp-0.0.1.war`) to tomcat `webapps` directory.
DelayApp will be available at http://localhost:8080/DelayApp-0.0.1/

# Building
See [CONTRIBUTING.md](CONTRIBUTING.md)

# Licence

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