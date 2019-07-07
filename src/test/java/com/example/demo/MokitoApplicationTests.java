package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mock.DataProvider;
import com.mock.DataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MokitoApplicationTests {

	@Test
	public void contextLoads() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(55);
		list.add(67);
		list.add(89);
		list.add(99);
		list.add(110);

		DataProvider dp=mock(DataProvider.class);
		when(dp.getData()).thenReturn(list);
		DataService s = new DataService(dp, 55);
		assertEquals("No Data Found", 2, s.searchData());
	}

}
