package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Notification;
import repository.NotificationRepository;
import service.NotificationService;
@Service
public class NotificationServiceImpl implements NotificationService{
    @Autowired
	private  NotificationRepository notificationRepository;
	@Override
	public void sendNotification(Notification notification) {
		  // Implement the logic to send the notification here
        // For simplicity, we'll save the notification to the database
        notificationRepository.save(notification);
		
	}

}
