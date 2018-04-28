package me.shufork.tools.mq.comsumer;

import lombok.extern.slf4j.Slf4j;
import me.shufork.common.mq.consumer.MessageConsumer;
import me.shufork.common.mq.payload.UserActivatePayload;
import me.shufork.common.mq.sink.UserActivatedSink;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserActivatedConsumer implements MessageConsumer<UserActivatePayload> {

    private final MessageLogger<UserActivatePayload> messageLogger = new MessageLogger<>();

    @StreamListener(UserActivatedSink.INPUT)
    @Override
    public void handleMessage(UserActivatePayload message) {
        messageLogger.logMessage(message);
    }
}
