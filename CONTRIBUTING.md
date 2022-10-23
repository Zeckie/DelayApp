## Contributing

To find our what this project is about, read the [README.md](README.md)

Contribute via [discussions](https://github.com/Zeckie/DelayApp/discussions), issues and pull requests

I am not currently planning to put much effort into this project.

Significant changes / new features should be [discussed first](https://github.com/Zeckie/DelayApp/discussions) before
implementing.

## Building

### With Gradle

Requires Java 11 - 18 (Java 8 - 18 for Gradle, Java 11+ for Gretty)

DelayApp can be built using Gradle, and includes the
[Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). Note that Gradle has
[separate requirements](https://docs.gradle.org/current/userguide/compatibility.html), such as often not supporting the 
latest version of Java.

If you are building in an environment where internet access is via a proxy, you will most likely need
to [configure Gradle's proxy settings](https://docs.gradle.org/current/userguide/build_environment.html#sec:accessing_the_web_via_a_proxy)

To do a full build (compiles and generates war file), run:

- On Windows:

```
gradlew build
```

- On Linux / Unix:

```bash
./gradlew build
```

This will create the war file in `build/libs

## Design

The main natural language of the project is English (Australian). However, some of the components we use, such as the
licence, and many of the APIs are in English (USA).

The main programming language of the project is Java (NOT Kotlin!). Other programming (or scripting) languages should
only be used in cases where Java cannot be used.

### Dependencies

This project is designed to run on Tomcat 10.0, with minimal or no third party dependencies.

Build dependencies are managed using Gradle. Any dependencies should be current, stable (not pre-release)
versions.