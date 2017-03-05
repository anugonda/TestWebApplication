package test;


public class Codingbat {

	public static String main(String[] args)
	{
		Codingbat testClass = new Codingbat();
		return testClass.makeTags("%","sravani");
	}
		 
	
	 public String makeTags(String tag, String word) {
			  return("<"+tag+">"+word+"<"+tag+">");
		 }
	}