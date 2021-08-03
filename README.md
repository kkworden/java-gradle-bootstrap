# Java Gradle Bootstrap App

A Java project that uses Gradle for dependency management. It is intended to be cloned
and used as a starting point!

## Usage

This project makes use of Gradle to build, run, and execute tests.

### Run the project

To run the project from the command line:

```./gradlew run```

Although the bootstrap app does not take arguments, you can provide them like so: 

```./gradlew run --args='--arg value'```

The weird syntax is because Gradle is the program being run. You can generate
a more traditional application, see **Building the application** below.

### Running tests

Use the `test` Gradle task:

```./gradlew test```

### Building the application

This project can generate an executable:

```./app```

To build this, run:

```./gradlew installDist```

This should generate a `app` executable shell script in `build/install/app/bin/`
which can be run as its own application.

To simply compile classes, a normal build will do:

```./gradlew build```

## External libraries

I used JUnit and Mockito for testing. I also use Apache commons libraries for the CLI and for HTTP request handling.