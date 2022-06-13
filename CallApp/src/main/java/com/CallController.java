package com;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;


public class CallController implements ApplicationRunner{

	private final static String SID_ACCOUNT= "AC50a1177ffcf05d35ae3736d6bb7c4fbb";
	private final static String AUTH_ID= "7975143e532576757641fbd18a849cc3";
	private final static String FROM_NUMBER= "+17792527507";
	private final static String TO_NUMBER= "+919629403196";
	
	static {
	      Twilio.init(SID_ACCOUNT, AUTH_ID);
	   }

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber("TO_NUMBER"), new PhoneNumber("FROM_NUMBER"),
		         new URI("http://demo.twilio.com/docs/voice.xml")).create();
	}
		
}
