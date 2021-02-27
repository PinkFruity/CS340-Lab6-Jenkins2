from openjdk
COPY ./src/main/java/*.java /
RUN javac /Calculator.java
RUN javac /Main.java
ENTRYPOINT ["java", "Main"]
