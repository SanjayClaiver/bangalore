package com.java;

import java.util.ArrayList;

public class Pojo {
	
	private String item1;
    private String item2;

	
	public String getItem1() {
		return item1;
	}
	public void setItem1(String item1) {
		this.item1 = item1;
	}
	public String getItem2() {
		return item2;
	}
	public void setItem2(String item2) {
		this.item2 = item2;
	}
}	
	class Data
	{
	    private Pojo data;

		public Pojo getData() {
			return data;
		}

		public void setData(Pojo data) {
			this.data = data;
		}

	}

	class MyData
	{
		private ArrayList<Data> dataList;

	    public ArrayList<Data> getDataList() {
			return dataList;
		}

		public void setDataList(ArrayList<Data> dataList) {
			this.dataList = dataList;
		}


	}
	

		
