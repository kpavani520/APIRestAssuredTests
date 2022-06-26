package com.api.reqres.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetAPI {
	@Test
	public void getAPi() {
		
		Response response= RestAssured.get("https://reqres.in/");
		System.out.println(response.getBody().asString());
		Assert.assertEquals(200, response.getStatusCode());
		
	}

}
