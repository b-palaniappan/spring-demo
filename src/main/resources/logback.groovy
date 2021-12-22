import ch.qos.logback.classic.encoder.PatternLayoutEncoder

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS}  %highlight(%-5level) [%12.12thread] %cyan(%-40.40logger{40}) - [%X] : %msg %n"
    }
}

root(INFO, ['STDOUT'])