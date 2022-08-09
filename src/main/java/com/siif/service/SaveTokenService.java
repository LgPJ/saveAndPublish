package com.siif.service;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SaveTokenService {

	//Access data defined within the environment
	@Value("${auth.uri}")
	private String uri;

	@Value("${auth.username}")
	private String userName;

	@Value("${auth.password}")
	private String password;

	//Method that retrieves access token
	public String save() throws Exception{

		try {		
			Invocation.Builder so = ClientBuilder
					.newClient()
					.target(uri).request();

			so.header("UserName", userName);
			so.header("Password", password);

			Response post = so.post(Entity.json("{}"));

			String json = post.readEntity(String.class);
			
			JSONObject j = new JSONObject(json);
			
			String token = j.getString("acces_token");

			System.out.println("ESTE ES EL TOKEN: " + token);
			return token;
			
		} catch (Exception e) {
			
			throw new Exception("Error al acceder" + e.toString());
		}
	}

}
