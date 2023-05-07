![github-frame](https://user-images.githubusercontent.com/28309837/236691630-e181a539-9d15-4343-951f-c518668b1570.png)

A simple, CLI based program to register and execute code snippets made for the DAM M03 course. Its purpose is merely educational and for
commodity.

This repository already includes some snippets that were present in the course, but you are free to easily add your own.

The program is **intentionally simple** and **purposefully CLI based**.

## How to run

This is a maven project. In order to execute it, clone and compile this repository with the following commands:

```bash
git clone https://github.com/lutzseverino/dam-m03-snippet-runner.git
cd dam-m03-snippet-runner
mvn clean install
```

Then, run the program:

```bash
java -jar target/dam-m03-snippet-runner-1.0-SNAPSHOT.jar
```

## Requirements

- Java 11
- Maven
