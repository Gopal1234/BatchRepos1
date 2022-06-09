package com.org.Controller;

class Email
{
	String body;

	public Email(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}
	
}
public class TestEncryptString {
	

	public static String bodyEncryption(Email e)
	{
		int s=3;
		String text=e.body;
		StringBuffer result= new StringBuffer();
		for (int i=0; i<text.length(); i++)
		{
			// isWhitespace(char ch)
			//   String str="H123Hello"
			//char[] ch=str.toCharArray();
			//for(int i=0; i<ch.length; i++)
			/*{
				
				
				if(Character.isDigit(ch[i]))
				{
				
				}
			}*/
			if(Character.isWhitespace(text.charAt(i)))
			{
				result.append(" ");
				//i++;
	        }
			// 
			if (Character.isUpperCase(text.charAt(i)))
			{
	char ch=((char)(((int)text.charAt(i)+s)));
				//75-65
				//10
				//char ch = (char)(((int)text.charAt(i) +s - 65) % 26 + 65);
				System.out.println(ch);
				result.append(ch);
			}
			else
			{
				char ch=((char)(((int)text.charAt(i)+s)));
				//char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				System.out.println(ch);
				result.append(ch);
			}
		}
	    return result.toString();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email e=new Email("Hi");
	System.out.println(	bodyEncryption(e));
		

	}

}
