/*13020210190
Putri Elsa Musati. M
Minggu, 19 Maret 2023*/

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import javax.swing.*;
 
public class BacaString 
{

	public static void main(String[] args) throws IOException 
	{
		String str;
		Integer num;
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print ("\nBaca string dan Integer: \n"); 
		System.out.print("masukkan sebuah string: ");
		str = dataIn.readLine();
		System.out.print ("String yang dibaca : "+ str);

		System.out.print("\nmasukkan sebuah integer: ");
		num = Integer.parseInt(dataIn.readLine());
		System.out.print("Integer yang dibaca : " + num);
	}
}

