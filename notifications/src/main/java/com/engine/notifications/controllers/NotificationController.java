package com.engine.notifications.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.notifications.models.Notification;
import com.engine.notifications.service.NotificationService;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
	@Autowired
	private  NotificationService notificationService;
	
	
	 @PostMapping("/send")
	    public ResponseEntity<Void> sendNotification(@RequestBody Notification notification) {
	        notificationService.sendNotification(notification);
	        // Implement logic to send the notification to Slack using an API integration here
	        return ResponseEntity.ok().build();
	 }
}
