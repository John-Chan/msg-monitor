package me.shufork.tools.mq.comsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import me.shufork.common.mq.consumer.MessageConsumer;
import me.shufork.common.mq.payload.UserCreatedPayload;
import me.shufork.common.mq.sink.UserCreatedSink;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserCreatedConsumer implements MessageConsumer<UserCreatedPayload> {

    private final MessageLogger<UserCreatedPayload> messageLogger = new MessageLogger<>();
    @StreamListener(UserCreatedSink.INPUT)
    @Override
    public void handleMessage(UserCreatedPayload message){
        messageLogger.logMessage(message);
    }
}
