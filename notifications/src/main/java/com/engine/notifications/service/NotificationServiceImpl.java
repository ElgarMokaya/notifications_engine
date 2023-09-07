package com.engine.notifications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.notifications.models.Notification;
import com.engine.notifications.repository.NotificationRepository;
@Service
public class NotificationServiceImpl implements NotificationService{
    @Autowired
	private  NotificationRepository notificationRepository;
	@Override
	public void sendNotification(Notification notification) {
		// save the notification to the database
        notificationRepository.save(notification);
		
	}

}
