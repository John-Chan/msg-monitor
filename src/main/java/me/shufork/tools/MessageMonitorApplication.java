package me.shufork.tools;

import me.shufork.common.mq.sink.UserActivatedSink;
import me.shufork.common.mq.sink.UserCreatedSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({UserActivatedSink.class,UserCreatedSink.class})
public class MessageMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageMonitorApplication.class, args);
	}
}
