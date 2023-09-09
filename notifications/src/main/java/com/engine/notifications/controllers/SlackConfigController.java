package com.engine.notifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.notifications.models.SlackConfig;
import com.engine.notifications.service.SlackConfigService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from localhost:4200
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
