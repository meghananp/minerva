//package com.stackroute.service;
//
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//import com.stackroute.redisson.FetchUrl;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FetchServiceIntegrationTest {
//
//	@Autowired
//	FetchNeoUrl fetchNeoUrl;
//	
//	ArrayList<FetchUrl> actualList= new ArrayList<>();
//	
//	@Test
//	public void test() {
////		Arrange
//	
//	String domain = "Java";
//	String concept="Bit Array";
//	String intent = "Beginner";
//	boolean illustration = false;
//	
////		Act
//		actualList = fetchNeoUrl.fetchedUrl(domain,concept,intent,illustration);		
//		
////		Asserts
//	
//		assertTrue(!actualList.isEmpty());
//	}
//	@After
//	public void teardown(){
//		actualList.clear();
//		
//		
//	}
//
//}