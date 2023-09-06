package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.SlackConfig;
import service.SlackConfigService;

@RestController
@RequestMapping("/api/slack-config")
public class SlackConfigController {
	@Autowired
	private  SlackConfigService slackConfigService;
	
	
	 @GetMapping("/get_slack")
	    public ResponseEntity<SlackConfig> getSlackConfig() {
	        SlackConfig slackConfig = slackConfigService.getSlackConfig();
	        if (slackConfig != null) {
	            return ResponseEntity.ok(slackConfig);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 
	 @PostMapping("/send_slack")
	    public ResponseEntity<Void> saveSlackConfig(@RequestBody SlackConfig slackConfig) {
	        slackConfigService.saveSlackConfig(slackConfig);
	        return ResponseEntity.ok().build();
	    }
	
	

}
