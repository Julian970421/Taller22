package Vigenere;
import java.util.Scanner;
public class Vigenere
{
	public static void main (String g[])
	{
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int [26][26];
		char abecedarioM[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char abecedariom[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String texto;
		//String texto2;
		String clave;


		int numero=1;
		int numero2=1;
		for (int i=0;i<26;i++) 
		{
			for (int j=0; j<26; j++) 
				{
					matriz[i][j]= numero;
					numero++;
					if(numero>26)
					{
						numero=1;
					}
				}
			numero++;
			if(numero>26) 
			{
				numero=1;
			}

		}
		for (int x=0;x<26;x++) 
		{
			for (int y=0; y<26;y++ ) 
			{
				System.out.print(matriz[x][y] + " ");

			}
			System.out.println(" ");
		}
		System.out.println("Ingresa el texto a cifrar:");
		texto= sc.next();
		System.out.println("Ingresa la clave para cifrar");
		clave=sc.next();
                //char[] texto2= new char[texto.length()];
                String texto2="";
		 for(int c=0;c<=texto.length();c++)
                {
                        if(texto.charAt(c)!=' ')
                        {
                                texto2+=texto.charAt(c);

                        }
                }
        System.out.println(texto2);
		char [] textoC= new char[texto.length()];
		char [] claveC= new char[clave.length()];
		int [] cifrado= new int[texto.length()];

		for (int a=0; a<=texto.length(); a++) 
		{	
			textoC[a]=texto.charAt(a);
		}
		for (int b=0; b<=clave.length(); b++) 
		{	
			claveC[b]=texto.charAt(b);
		}



	}
} 