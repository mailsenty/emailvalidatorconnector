package org.mule.modules.emailvalidator;

import org.mule.api.annotations.Config;

import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.modules.emailvalidator.config.ConnectorConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


@Connector(name="email-validator", friendlyName="EmailValidator")
public class EmailValidatorConnector {
	
	private final String USER_AGENT = "Mozilla/5.0";
	private final String MASHAPE_KEY = "gSu3q2y5yymshH0OMkuExkKEOvFkp10qqQ4jsnK9a7OM0HzuPY";
	String EMAIL_URL="https://pozzad-email-validator.p.mashape.com/emailvalidator/validateEmail/";

	
    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
   
    
    @Processor
public String validateEmailId(String emailId) {
		
    	
		StringBuffer response = new StringBuffer();
		String resp;
		try {
			String url = EMAIL_URL+URLEncoder.encode(emailId, "UTF-8");
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("X-Mashape-Key",MASHAPE_KEY);
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			resp=response.toString();
		} catch (Exception e) {
			resp="Error validating the email";
			e.printStackTrace();
		}
		
		return resp;
	}


    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}