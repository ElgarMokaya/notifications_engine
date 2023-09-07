package com.engine.notifications.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
@Service
public class SlackIntegrationService {
	 @Value("${slack.api.token}")
    private String slackApiToken;

    public boolean sendSlackMessage(String channel, String message) {
        Slack slack = Slack.getInstance();
        MethodsClient methods = slack.methods(slackApiToken);
        ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                .channel(channel)
                .text(message)
                .build();
                try {
            ChatPostMessageResponse response = methods.chatPostMessage(request);
            if (response.isOk()) {
                System.out.println("Message sent successfully!");
            } else {
                System.err.println("Failed to send message: " + response.getError());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to send message: " + e.getMessage());
        }
				return false;
    }

}
