package com.engine.notifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.notifications.exceptions.CustomException;
import com.engine.notifications.models.Notification;
import com.engine.notifications.service.NotificationService;
import com.engine.notifications.service.SlackIntegrationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from localhost:4200
@RequestMapping("/api/notifications")
public class NotificationController {
	@Autowired
	private  NotificationService notificationService;
	@Autowired
    private SlackIntegrationService slackIntegrationService;
	
	
	 @PostMapping("/send-notification")
	    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
		 try {
	            // Your notification sending logic here
			 notificationService.sendNotification(notification);
			// Implement logic to send the notification to Slack using an API integration here
 slackIntegrationService.sendSlackMessage("#notifications-engine channel", notification.getMessage());
	            
	            return ResponseEntity.ok("Notification sent successfully.");
	        } catch (Exception e) {
	            throw new CustomException("An error occurred while sending the notification.");
	        }
	    }



	


	        
	        
	       // return ResponseEntity.ok().build();
	 }

