////package com.retailapp.checkOutService.Service;
////
////public class CheckoutServiceImplTest {
////
////}
//
//
//package com.retailapp.checkOutService.Service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import com.retailapp.checkOutService.CheckoutDao.CheckoutServiceDao;
//import com.retailapp.checkOutService.CheckoutDao.TokenDao;
//import com.retailapp.checkOutService.POJO.Token;
//
//public class CheckoutServiceImplTest {
//
//	@Test
//	public void testCheckOut() {
//		// Create a mock RestTemplate
//		RestTemplate restTemplate = mock(RestTemplate.class);
//
//		// Create mock DAOs
//		TokenDao tokenDao = mock(TokenDao.class);
//		CheckoutServiceDao checkOutDao = mock(CheckoutServiceDao.class);
//
//		// Create an instance of CheckoutServiceImpl
//		CheckoutServiceImpl checkoutService = new CheckoutServiceImpl();
//		checkoutService.restTemplate = restTemplate;
//		checkoutService.tokenDao = tokenDao;
//		checkoutService.checkOutDao = checkOutDao;
//
//		// Create a mock response from the cart service
//		Map<String, Object> cartItem = new HashMap<>();
//		cartItem.put("cartItemId", 1);
//		cartItem.put("prod_id", 1);
//		cartItem.put("prod_price", 100);
//		cartItem.put("prod_quantity", 2);
//
//		ResponseEntity<Map> cartResponse = new ResponseEntity<>(cartItem, HttpStatus.OK);
//		when(restTemplate.getForEntity(Mockito.anyString(), Mockito.eq(Map.class))).thenReturn(cartResponse);
//
//		// Create a mock response from the payment service
//		ResponseEntity<String> paymentResponse = new ResponseEntity<>("Payment success", HttpStatus.OK);
//		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(String.class))).thenReturn(paymentResponse);
//
//		// Create a mock token
//		Token token = new Token();
//		token.setOrderID(1);
//
//		when(tokenDao.save(Mockito.any())).thenReturn(token);
//
//		// Create a mock request map
//		Map<String, String> requestMap = new HashMap<>();
//		requestMap.put("userId", "1");
//		requestMap.put("name", "John Doe");
//		requestMap.put("address", "123 Main St");
//		requestMap.put("pinCode", "12345");
//
//		ResponseEntity<String> response = checkoutService.checkOut(requestMap);
//
//		// Check that the response is as expected
//		assertEquals(HttpStatus.OK, response.getStatusCode());
//		assertEquals("CheckedOut SucessFully", response.getBody());
//	}
//
//}
