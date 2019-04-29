package com.auquall.Auquallform.serviceinterface;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("service")
public class Mailservice implements service {

	@Autowired
	  JavaMailSender javaMailSender;
	@Override
	public void send(String fromaddress, String toaddress, String subject, String content) throws Exception {  
      MimeMessage mimeMessage=javaMailSender.createMimeMessage();
  MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage, true);
  mimeMessageHelper.setFrom(fromaddress);
  mimeMessageHelper.setTo(toaddress);
  mimeMessageHelper.setTo(subject);
  mimeMessageHelper.setText(content,true);
  mimeMessageHelper.setSentDate(new Date());
  javaMailSender.send(mimeMessage);
	}

}
