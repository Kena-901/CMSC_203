/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Write a Java program to encrypt and decrypt a phrase using caesar cipher and 
 * 				bellaso cipher approaches, each insecure by modern standards. 
 * Due: 10/16/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/


/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE +1;
	

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) 
	{
		boolean result= true;
		int index= 0;
		
		for(int i =0; i < plainText.length(); i++)
		{
			if(plainText.charAt(index) > UPPER_RANGE || plainText.charAt(index)< LOWER_RANGE)
			{
				return false;
			}
			index++;
		}			
		return result;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) 
	{
		boolean capital= isStringInBounds(plainText);
		
		if(key > UPPER_RANGE)
		{
			while(key > UPPER_RANGE)
			key = (key -RANGE);
		}
		
		if (capital)
		{
			StringBuilder encrypted = new StringBuilder();
			char  next;
			
			for(int i =0; i < plainText.length(); i++)
			{
				next = (char) ((plainText.charAt(i)- 32+ key + RANGE) % RANGE + 32);
				encrypted.append(next) ;		
			}
			return encrypted.toString();
		}
		else
		{
			return "The selected string is not in bounds, Try again.";
		}
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) 
	{
		 StringBuilder encrypted = new StringBuilder();
		 char next;
		 int key = bellasoStr.length();
		 int i = 0;

		 while (i < plainText.length()) 
		 {
			 for (int z = 0; z < key; z++) 
		     {
				 if (i >= plainText.length()) 
		         {
		            break; 
		         }
				 
				 int charValue = (plainText.charAt(i) + bellasoStr.charAt(z));

		         if (charValue > UPPER_RANGE) 
		         {
		            while (charValue > UPPER_RANGE) 
		            {
		            	charValue = charValue - RANGE;
		            }
		         }

		         next = (char) (charValue);
		         encrypted.append(next);
		         i++;
		     }
		 }
		 return encrypted.toString();
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) 
	{
		if(key > UPPER_RANGE)
		{
			while(key > UPPER_RANGE)
			key = (key -RANGE);
		}

		StringBuilder decrypted = new StringBuilder();
		char  next;
			
		for(int i =0; i < encryptedText.length(); i++)
		{
			next = (char) ((encryptedText.charAt(i)-32 - key + RANGE)%RANGE + 32);
			if(next == '`' )
			{
				next = ' ';
			}
			decrypted.append(next) ;		
		}
		return decrypted.toString();
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) 
	{
		 StringBuilder decrypted = new StringBuilder();
		 char next;
		 int key = bellasoStr.length();
		 int i = 0;
		 
		 while (i < encryptedText.length()) 
		 {
			 for (int z = 0; z < key; z++) 
			 {
				 if (i >= encryptedText.length()) 
				 {
					 break; 
				 }

		         int charValue = (encryptedText.charAt(i) - bellasoStr.charAt(z));

		         if (charValue < LOWER_RANGE) 
		         {
		        	 while (charValue < LOWER_RANGE) 
		        	 {
		        		 charValue = charValue + RANGE;
		             }
		         }

		         next = (char) (charValue);
		         decrypted.append(next);
		         i++;
			 }
		 }
		 return decrypted.toString();
	}
}
