package com.engine.notifications.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "slack_configs")
public class SlackConfig {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String webhookUrl;

	    

	    // Constructors
	    public SlackConfig() {
	    }

	    public SlackConfig(String webhookUrl) {
	        this.webhookUrl = webhookUrl;
	    }

	    // Getters and setters
	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getWebhookUrl() {
	        return webhookUrl;
	    }

	    public void setWebhookUrl(String webhookUrl) {
	        this.webhookUrl = webhookUrl;
	    }

}
