package com.pressassociation.qa_technical_test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.ResponseContent;

public class SongAPIs {

 
    public static final Charset UTF_8 = Charset.forName("UTF-8");

 
public HashMap<String,String>  postCreeateVideoAPI() throws ClientProtocolException, IOException{
	HashMap<String,String> result=new HashMap<String,String>();

	HttpResponse response	=Request.Post("http://turing.niallbunting.com:3002/api/video/")
              .addHeader("Content-Type", "application/json")
             . bodyString("{ \"artist\": \"Lady Gaga\", \"song\": \"Poker face\", \"publishDate\": \"2017-09-01\" }", null)
           .execute().returnResponse();
	 HttpEntity entity=response.getEntity();
     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );

     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
     System.out.println("String reponse --->"+ theString);

     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));
	return result;

	}
	
	public HashMap<String,String> getVideoInfoAPI()  {
		HashMap<String,String> result=new HashMap<String,String>();
		try {
				 
			HttpResponse response=Request.Get("http://turing.niallbunting.com:3002/api/video/")
			.execute().returnResponse();
			
		  HttpEntity entity=response.getEntity();
	     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );
 
	     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
	     System.out.println("String reponse --->"+ theString);

	     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
	     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));

		} catch (Exception e) {
			System.out.println("Exception e");

		}
		return result;
	}
	//GET /api/video/(id)
	//Returns data about a single video.
	public HashMap<String,String> getVideoAPI()  {
		HashMap<String,String> result=new HashMap<String,String>();
		try {
				 
			HttpResponse response=Request.Get("http://turing.niallbunting.com:3002/api/playlist/(id)")
			.execute().returnResponse();
			
		  HttpEntity entity=response.getEntity();
	     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );
 
	     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
	     System.out.println("String reponse --->"+ theString);

	     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
	     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));

		} catch (Exception e) {
			System.out.println("Exception e");

		}
		return result;
	}
	public HashMap<String,String> patchUpdatedVideoAPI(){
		
		HashMap<String,String> result=new HashMap<String,String>();

		try {
				 
			HttpResponse response=Request.Patch("http://turing.niallbunting.com:3002/api/video/(id)")
			.execute().returnResponse();
			 HttpEntity entity=response.getEntity();
		     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );
	 
		     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
		     System.out.println("String reponse --->"+ theString);

		     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
		     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));
	
	 
		} catch (Exception e) {
			System.out.println("Exception e");

		}
		return result;
	}
public HashMap<String,String> deleteVideoAPI(){
		
		HashMap<String,String> result=new HashMap<String,String>();

		try {
				 
			HttpResponse response=Request.Delete("http://turing.niallbunting.com:3002/api/video/(id)")
			.execute().returnResponse();
			 HttpEntity entity=response.getEntity();
		     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );
	 
		     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
		     System.out.println("String reponse --->"+ theString);

		     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
		     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));
	
	 
		} catch (Exception e) {
			System.out.println("Exception e");

		}
		return result;
	}
	public static void main(String[] args) throws ClientProtocolException, IOException {

		SongAPIs api = new SongAPIs();
		// api.postAPIMethod();
		api.getVideoInfoAPI();
		System.out.println("Executed");
	}

}
