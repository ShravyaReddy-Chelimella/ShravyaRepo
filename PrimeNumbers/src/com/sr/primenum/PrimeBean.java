package com.sr.primenum;

public class PrimeBean {
	PrimeBean(int a, int b) {
		for(int i=a;i<=b;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c=c+1;
			}
			if(c==2)
				System.out.println(i);
		}
	}
}
