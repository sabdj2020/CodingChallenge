	package Bench;
	
	/*
	 * Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.
	
	Examples
	actualMemorySize("32GB") --> "29.76GB"
	
	actualMemorySize("2GB") --> "1.86GB"
	
	actualMemorySize("512MB") --> "476MB"
	
	Notes
	-The actual storage loss on a USB device is 7% of the overall memory size!
	-If the actual memory size was greater than 1 GB, round your result to two decimal places.
	-If the memory size after adjustment is smaller then 1 GB, return the result in MB.*/
	
	public class MemorySize {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(actualMemorySize("32GB"));
			System.out.println(actualMemorySize("2GB"));
			System.out.println(actualMemorySize("512MB"));
			}
	
	public static String actualMemorySize(String ms){
		double actualMemoSize;
		
		if (ms.contains ("GB")) {
	actualMemoSize = Double.parseDouble (ms.replace ("GB", ""))* 1024;
	}
	
	else {
		actualMemoSize = Double.parseDouble (ms.replace ("MB", "")); 
	}
	
	actualMemoSize = (double) (actualMemoSize * 0.93);
	
	if (actualMemoSize > 1024) {
		return (double) Math.round (actualMemoSize * 100) / 100 / 1024 + "GB";
	}else{
		return (double) actualMemoSize + "MB";
			}
			}
	}
