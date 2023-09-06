package com.engine.notifications.service;

import com.engine.notifications.models.Notification;

public interface NotificationService {
	
	/**
	 * This method sends notification
	 * @param notification
	 */
	  void sendNotification(Notification notification);	

}
