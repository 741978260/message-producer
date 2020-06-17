package com.mumu.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * <p>
 * </p>
 *
 * @author cailin
 * @since 2020/6/17
 */
public interface TestChannel {

    String TEST_OUTPUT = "testOutput";

    /**
     * @return output channel
     */
    @Output(TEST_OUTPUT)
    MessageChannel testOutput();
}
