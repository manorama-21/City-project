package com.sbproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(Email email)
	{
		try {
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			
			helper.setFrom("manorama210688@gmail.com");
			helper.setTo(email.getTo());
			helper.setSubject(email.getSubject());
			helper.setText(email.getMessage());
			
			javaMailSender.send(message);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
