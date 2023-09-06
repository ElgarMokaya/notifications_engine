package com.engine.notifications.service;

import com.engine.notifications.models.SlackConfig;

public interface SlackConfigService {
	SlackConfig getSlackConfig();
    void saveSlackConfig(SlackConfig slackConfig);
}
