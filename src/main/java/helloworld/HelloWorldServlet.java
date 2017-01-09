package helloworld;

import com.amazon.speech.speechlet.servlet.SpeechletServlet;
import com.amazon.speech.Sdk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorldServlet extends SpeechletServlet {
	
	private static Log logger = LogFactory.getLog(HelloWorldServlet.class);
	
	static { 
		System.setProperty(Sdk.DISABLE_REQUEST_SIGNATURE_CHECK_SYSTEM_PROPERTY, "true"); 
		System.setProperty(Sdk.SUPPORTED_APPLICATION_IDS_SYSTEM_PROPERTY, ""); 
		System.setProperty(Sdk.TIMESTAMP_TOLERANCE_SYSTEM_PROPERTY, ""); 
	}
	
	public HelloWorldServlet() {		
		
		logger.info("Hello Servlet!");
		this.setSpeechlet(new HelloWorldSpeechlet());
	}
}