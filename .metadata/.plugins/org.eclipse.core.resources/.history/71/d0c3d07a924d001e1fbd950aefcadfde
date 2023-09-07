package com.engine.notifications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.notifications.models.SlackConfig;
import com.engine.notifications.repository.SlackConfigRepository;

@Service
public class SlackConfigServiceImpl implements SlackConfigService{
    @Autowired
	private  SlackConfigRepository slackConfigRepository;
	@Override
	public SlackConfig getSlackConfig() {
		 // Implement logic to retrieve Slack configuration
        // Example: Retrieve the configuration with ID 1
        return slackConfigRepository.findById(1L).orElse(null);
	}

	@Override
	public void saveSlackConfig(SlackConfig slackConfig) {
		slackConfigRepository.save(slackConfig);
		
	}

}
