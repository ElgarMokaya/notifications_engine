package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.SlackConfig;
import repository.SlackConfigRepository;
import service.SlackConfigService;

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
