package service;

import model.SlackConfig;

public interface SlackConfigService {
	SlackConfig getSlackConfig();
    void saveSlackConfig(SlackConfig slackConfig);
}
