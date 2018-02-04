package com.sac.spring.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

	private static final String GET_URL = "http://localhost:8080/SpringRestExample/PostData";

	public static void main(String[] args) throws IOException {

		sendGET();

		System.out.println("GET DONE");

	}

	private static void sendGET() throws IOException {


		URL obj = new URL(GET_URL);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("POST");

		int responseCode = con.getResponseCode();

		System.out.println("GET Response Code :: " + responseCode);

		if (responseCode == HttpURLConnection.HTTP_OK) { // success

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String inputLine;

			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {

				response.append(inputLine);
			}
			in.close();

			System.out.println(response.toString());
		} else {
			System.out.println("GET request not worked");
		}

	}

}