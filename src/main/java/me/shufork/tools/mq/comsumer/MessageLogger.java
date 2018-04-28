package me.shufork.tools.mq.comsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageLogger<T> {

    private final ObjectMapper mapper = new ObjectMapper();
    public void logMessage(T message) {
        try {
            final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(message);
            log.info("{}{}{}",message.getClass().getSimpleName(),System.lineSeparator(), json);
        } catch (JsonProcessingException e) {
            log.error(e.getMessage(),e);
        }
    }
}
