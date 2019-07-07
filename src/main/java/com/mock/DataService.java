package com.mock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataService {
	@Autowired
	private DataProvider dp;
	@Value("55")
	private Integer searchKey;

	public DataService(DataProvider dp, Integer searchKey) {
		this.dp = dp;
		this.searchKey = searchKey;
	}
	public DataProvider getDp() {
		return dp;
	}
	public Integer getSearchKey() {
		return searchKey;
	}


	public int searchData() {
		List<Integer> arr = dp.getData();
//		ListIterator l = arr.listIterator();
//		while (l.hasNext()) {
//			System.out.println(l.next());
//		}
		int low = 0;
		int high = arr.size() - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int cmp = arr.get(mid).compareTo(getSearchKey());
			if (cmp < 0)
				low = mid + 1;
			else if (cmp > 0)
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
