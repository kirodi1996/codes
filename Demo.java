import java.lang.System;
import java.lang.String;
class Demo
{
	public static void main(String args[])
	{
		boolean x=true;
		bl:
		{
			bl2:{
				bl3:{
					System.out.println("block3");
					if(x) break bl2;
				}
				System.out.println("block2");
			}
			System.out.println("block2");
		}
		System.out.println("out of all blocks");
	}
}