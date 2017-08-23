package com.pressassociation.qa_technical_test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class PlayListAPIs {

	
	

    public static final Charset UTF_8 = Charset.forName("UTF-8");
//POST /api/playlist
 //Create a playlist
public HashMap<String,String>  postCreeatePlaylistAPI() throws ClientProtocolException, IOException{
	HashMap<String,String> result=new HashMap<String,String>();

	HttpResponse response	=Request.Post("http://turing.niallbunting.com:3002/api/playlist")
              .addHeader("Content-Type", "application/json")
             . bodyString("{\"desc\": \"My first playlist.\", \"title\": \"My List\"}", null)
           .execute().returnResponse();
	 HttpEntity entity=response.getEntity();
     System.out.println("String reponse --->"+ response.getStatusLine().getStatusCode()  );

     String theString = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8); 
     System.out.println("String reponse --->"+ theString);

     result.put("HTTPCODE",  String.valueOf(response.getStatusLine().getStatusCode()));
     result.put("HTTPResponse",IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8));
	return result;

	}
	//GET /api/playlist/(id)
    //Return a single playlist.
	public HashMap<String,String> getPlayListInfoAPI()  {
		HashMap<String,String> result=new HashMap<String,String>();
		try {
				 
			HttpResponse response=Request.Get("http://turing.niallbunting.com:3002/api/playlist")
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
	
	//GET /api/playlist/(id)
    //Return a single playlist.
	public HashMap<String,String> getPlayListAPI()  {
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
	//PATCH /api/playlist/(id)
	//Add and remove song from the playlist.

	public HashMap<String,String> patchUpdatedVideoAPI(){
		
		HashMap<String,String> result=new HashMap<String,String>();

		try {
				 
			HttpResponse response=Request.Patch("http://turing.niallbunting.com:3002/api/playlist/(id)")
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
	//DELETE /api/playlist/(id)
	//Delete a playlist

public HashMap<String,String> deleteVideoAPI(){
		
		HashMap<String,String> result=new HashMap<String,String>();

		try {
				 
			HttpResponse response=Request.Delete("http://turing.niallbunting.com:3002/api/playlist/(id)")
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
