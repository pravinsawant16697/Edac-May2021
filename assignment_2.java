//prg1
class pattern_1
{
   public static void main(String args[])
   {
     for(int i=1;i<=5;i++)
     {
	    for(int j=1;j<=i;j++)
            {
		   System.out.print(" "+j+" " );
	    }
            System.out.println();
     }
   }
} 


//prg2
class pattern_2
{
   public static void main(String args[])
   {   int a=64;
       for(int i=1;i<=5;i++)
       {
	  for(int j=1;j<=i;j++)
          {
	     System.out.print(" "+(char)(a+j)+" " );
	  }
        System.out.println();
       }
   }
}


//prg3
class pattern_3
{
   public static void main(String args[])
   { 
     for(int i=1;i<=5;i++)
     {
	for(int j=1;j<=i;j++)
        {
          System.out.print(" * " );
	}
     System.out.println();
     }
   }
}      


//prg-4
class pattern_4
{
   public static void main(String args[])
   { 
     for(int i=1;i<=5;i++) 
     {
       for(int j=1;j<=i;j++)
       {  
         System.out.print(" "+i+" " );
       }
     System.out.println();
     }
   }
}


//prg-5
class pattern_5
{
   public static void main(String args[])
   { 
      int a=64;
      for(int i=1;i<=5;i++)
      {
	 for(int j=1;j<=i;j++)
	 {
	   System.out.print(" "+(char)(a+i)+" " );
	 }
      System.out.println();
      }
   }
} 


//prg-6
class pattern_6
{
    public static void main(String args[])
    {
	for(int i=1;i<=5;i++)
        { 
	   for(int k=4;k>=i;k--)//for spacing
           {
              System.out.print("  ");
           }
           
           for(int j=1;j<=i;j++)
           {
               System.out.print(" *"); 
           }
        System.out.println();
        }
    }
}


//prg-7
class pattern_7
{
    public static void main(String args[]) 
    {   
       for(int i=1;i<=5;i++)
       { 
         for(int k=4;k>=i;k--)//for spacing 
         {
            System.out.print(" ");
         }
           
         for(int j=1;j<=i;j++)
         {
            System.out.print(" "+j);
         }
       System.out.println();
       }
    }
}
	

//prg-8
class pattern_8
{
	public static void main(String args[])
    {   
	    int c=4;
	    for(int i=1;i<=5;i++)
		{   
		    for(int k=4; k>=i;k--) 
			{
			   System.out.print(" ");
			}	  
			for(int j=1;j<=i;j++)
			{
				int s=c+j; 
				System.out.print(" "+s);
			}
			c--;
           	  System.out.println();
		}
	}
}


/prg-9
class pattern_9
{
    public static void main(String args[])
	{   int a=64;
	    for(int i=1;i<=5;i++)
		{ 
		   for(int k=4;k>=i;k--)//for spacing
		   {
              System.out.print(" ");
           }
           
           for(int j=1;j<=i;j++)
           {
              System.out.print(" "+(char)(a+j));
           }
        System.out.println();
        }
	}
}


//prg-10
class pattern_10
{
	public static void main(String args[])
    {   
	    int c=4;
		int a=64;
	    for(int i=1;i<=5;i++)
		{   
		    for(int k=4; k>=i;k--) 
			{
			   System.out.print(" ");
			}	  
			for(int j=1;j<=i;j++)
			{
				int s=c+j; 
				System.out.print(" "+(char)(s+a));
			}
			c--;
		System.out.println();
		}
	}
}


//prg-11
class pattern_11
{
    public static void main(String args[])
	{  
	   for (int i=1;i<=5;i++)
	   {
	       for(int j=4;j>=i;j--)
		   {
              System.out.print(" ");
           }
            
           for(int k=1; k<=i; k++)	
           {
             System.out.print("*");
             
           }
		   
		   for(int l=2; l<=i;l++)
           {
             	System.out.print("*");
           }		   
		  
            System.out.println();   
	   }
    }
}	


//prg-12
class pattern_12
{
    public static void main(String args[])
	{
	    for(int i=1;i<=5;i++)
		{ 
		   for(int k=4;k>=i;k--)//for spacing
		   {
              System.out.print(" ");
           }
           
           for(int j=1;j<=i;j++)
           {
              System.out.print(" "+i);
           }
        System.out.println();
        }
	}
}


//prg-13
class pattern_13
{
    public static void main(String args[])
	{   int a=64;
	    for(int i=1;i<=5;i++)
		{ 
		   for(int k=4;k>=i;k--)//for spacing
		   {
              System.out.print(" ");
           }
           
           for(int j=1;j<=i;j++)
           {
              System.out.print(" "+(char)(a+i));
           }
        System.out.println();
        }
	}
}


//prg-14
class pattern_14
{
    public static void main(String args[])
	{
      for(int i=5;i>=1;i--)
      {	
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+j+" ");
        }
    	System.out.println();
	  }  
	}
}	


//prg-15
class pattern_15
{
   public static void main(String args[])
   {
     for(int i=1;i<=5;i++)
	 {
	    for(int j=5;j>=i;j--)
		{
		   System.out.print(" "+j+" " );
		}
      System.out.println();
     }
   }
}  

		
//prg-16
class pattern_16
{
	public static void main(String args[])
    {   int c=6;
        for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(c-j));
			}
		System.out.println();
		}
	}
}
     


//prg-17
class pattern_17
{
	 public static void main (String args[])
	 {    int c=1;
		 for(int i=1;i<=5;i++)
	     {   
	       for(int j=1;j<=i;j++)
		   {
		    System.out.print(" "+c);
            c++;			
		   }
		 
		 System.out.println();
		 
     }}
}


//prg-18
class pattern_18
{
    public static void main(String args[])
	{ int a=64;
      for(int i=5;i>=1;i--)
      {	
        for(int j=1;j<=i;j++)
        {
            System.out.print(" "+(char)(a+j)+" ");
        }
    	System.out.println();
	  }  
	}
}


//prg-2.1
class star_1
{
    public static void main(String args[])
	{
	   for(int i=1; i<=5; i++)
	   {
	      for(int j=1; j<=i; j++)
		  {
		     System.out.print("*");
		  }
        System.out.println();
	   }
	}
}	


//prg-2.2
class star_2
{
    public static void main(String args[])
	{
	   for(int i=1; i<=5; i++)
	   {
	     for(int k=4; k>=i; k--)
		 {
		   System.out.print(" ");
         }
		 for(int j=1; j<=i; j++)
		  {
		     System.out.print("*");
		  }
        System.out.println();
	   }
	}
}			 	


//prg2.3
class star_3
{
    public static void main(String args[])
	{
	   for(int i=1; i<=5; i++)
	   {
	      for(int j=5; j>=i; j--)
		  {
		     System.out.print("*");
		  }
        System.out.println();
	   }
	}
}


//prg-2.4
class star_4
{
    public static void main(String args[])
	{
	   for(int i=1; i<=5; i++)
	   {
	     for(int k=2; k<=i; k++)
		 {
			System.out.print(" ");
         }			
		 for(int j=5; j>=i; j--)
		  {
		     System.out.print("*");
		  }
        System.out.println();
	   }
	}
}


//prg-2.5
class star_5
{
   public static void main(String args[])
   {
      for(int i=1;i<=5;i++)
	  { 
	      for(int j=4;j>=i;j--)
		  {
		     System.out.print(" ");
		  }
          
		  for(int k=1;k<=i;k++)
          {
            System.out.print("*");
          }
		  
		  for(int l=2; l<=i;l++)
		  {
		    System.out.print("*");
          }
	    System.out.println();
       }
    }
}


//prg-2.6
class star_6
{
   public static void main(String args[])
   {
      for(int i=1;i<=5;i++)
	  { 
	      for(int j=2;j<=i;j++)
		  {
		     System.out.print(" ");
		  }
          
		  for(int k=5;k>=i;k--)
          {
            System.out.print("*");
          }
		  
		  for(int l=4; l>=i;l--)
		  {
		    System.out.print("*");
          }
	    System.out.println();
       }
    }
}	
		 
	     	
//prg-2.7
class star_7
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{	
			   System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
     			System.out.print("*");
			}
			System.out.println();
		}
		
	    for(int i=4;i>=1;i--)
			{
			for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
			for(int k=1;k<=(i*2)-1;k++)
				{
					System.out.print("*");
				}
			System.out.println();
			}
				
	
	}
}


//Prg-2.8
class star_8
{
   public static void main(String args[])
   {
      for(int i=1;i<=5;i++)
	  {
	     for(int j=1;j<=i;j++)
		 {
		    System.out.print("*");
		 }
	    System.out.println(); 
	  }
   
	  for(int k=4; k>=1; k--)
      { 
         for(int l=1; l<=k; l++)
         {
           System.out.print("*");
	     }
	   System.out.println();
	  }
   }
}


//prg-2.9
class star_9
{
   public static void main(String args[])
   {
      for(int i=1;i<=5;i++)
	  {
	     for(int s=4;s>=i;s--)
		 {
		    System.out.print(" ");
		 }
		 
		 for(int j=1;j<=i;j++)
		 {
		    System.out.print("*");
		 }
	    System.out.println(); 
	  }
   
	  for(int k=1; k<=4; k++)
      { 
        for(int s1=1;s1<=k;s1++)
		{
		   System.out.print(" ");
		}
		 
		 for(int l=4; l>=k; l--)
         {
           System.out.print("*");
	     }
	   System.out.println();
	  }
   }
}
	  			 
	     		
//prg-2.10
class star_10
{
   public static void main(String args[])
   {
      for(int i=1; i<=5;i++)
	  {  
	     for(int k=4; k>=i;k--) 
		 {
		    System.out.print(" ");
		 }	
		 
	     for(int j=1; j<=5;j++)
		 {
		   System.out.print("*");
		 }  
	   System.out.println();
      }	 
   }
 }


//prg-2.11
class star_11
{
   public static void main(String args[])
   {
      for(int i=1; i<=5;i++)
	  {  
	     for(int k=1; k<=i;k++) 
		 {
		    System.out.print(" ");
		 }	
		 
	     for(int j=1; j<=5;j++)
		 {
		   System.out.print("*");
		 }  
	   System.out.println();
      }	 
   }
 }


//prg-2.12
class star_12
{
   public static void main(String args[])
   {
      for(int i=1; i<=5;i++)
	  {  
	     for(int k=5; k>=i;k--) 
		 {
		    System.out.print("*");
		 }	
		 
		 System.out.println();
      }	
	    for(int j=2; j<=5;j++)
		{
		   for(int l=1; l<=j;l++)	
		    System.out.print("*");
		 
		 System.out.println();
		 
		}  
   }
 }


//prg-2.13
class star_13
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


//prg-2.14
class star_14
{
   public static void main(String args[])
   {
      
	  for(int i=1;i<=5;i++)
	  {
	      for(int k=1;k<i;k++)
          { 
            System.out.print(" ");
          }
   		  
		  for(int j=i;j<=5;j++)
          { 
            System.out.print("* ");
          }
		System.out.println();
      }
	  
	  for(int i=4;i>=1;i--)
	  {
	      for(int k=1;k<i;k++)
          { 
            System.out.print(" ");
          }
   		  
		  for(int j=i;j<=5;j++)
          { 
            System.out.print("* ");
          }
		System.out.println();
      }
   }
}


//prg-2.15
class star_15
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}


//prg-2.16
class star_16
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			if (k==1 || k==i || i==5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}


//prg-3.1
class pyrapat1
{
   public static void main(String args[])
   {
      for(int i=1; i<=9; i++)
	  {
	     for(int s=8; s>=i; s--)
		 {
		    System.out.print(" ");
		 }	
		 
		 for(int j=1; j<=i; j++)
		 {
		   System.out.print(" "+i);
		 }
		System.out.println();
	  }
   }
}  
		 
		  
//prg-3.2
class pyrapat2
{
   public static void main(String args[])
   {
      for(int i=1; i<=9; i++)
	  {
	     for(int s=8; s>=i; s--)
		 {
		    System.out.print(" ");
		 }	
		 
		 for(int j=1; j<=i; j++)
		 {
		   System.out.print(" "+j);
		 }
		System.out.println();
	  }
   }
}  


//prg-3.3
class pyrapat3
{
   public static void main(String args[])
   {
      for(int i=1; i<=9; i++)
	  {
	     for(int s=8; s>=i; s--)
		 {
		    System.out.print(" ");
		 }	
		 
		 for(int j=1; j<=i; j++)
		 {
		   System.out.print(" "+"*");
		 }
		System.out.println();
	  }
   }
}


//prg-3.4
class pyrapat4
{
   public static void main(String args[])
   {
      int f=1;
	  for(int i=9;i>0;i--)
	  {
	      for(int k=1;k<=i*2;k++)
          { 
            System.out.print(" ");
          }
   		  
		  for(int j=1;j<=f;j++)
          { 
            System.out.print(j+" ");
          }
		  
		  for(int l=f-1;l>=1;l--)
          { 
            System.out.print(l+" ");
          }
		  
		  System.out.println();
		  f++;
	  }
   }
}


//prg-3.5
class pyrapat5
{
   public static void main(String args[])
   {
      int f=1;
	  for(int i=9;i>0;i--)
	  {
	      for(int k=1;k<=i*2;k++)
          { 
            System.out.print(" ");
          }
   		  
		  for(int j=i;j<=9;j++)
          { 
            System.out.print(j+" ");
          }
		  
		  for(int l=8;l>=i;l--)
          { 
            System.out.print(l+" ");
          }
		  
		  System.out.println();
		  f++;
	  }
   }
}


//prg-3.6
class invpyr6
{
   public static void main(String args[])
   {
      for(int i=1; i<=9; i++)
	  {
	     for(int s=1; s<=i; s++)
		 {
		    System.out.print(" ");
		 }	
		 
		 for(int j=9; j>=i; j--)
		 {
		   System.out.print(" "+"*");
		 }
		System.out.println();
	  }
   }
}  


//prg-3.7
class invpyr7
{
   public static void main(String args[])
   {  
      for(int i=9; i>=1; i--)
	  {
	     for(int s=8; s>=i; s--)
		 {
		    System.out.print(" ");
		 }	
		  int c=9; 
		 for(int j=1; j<=i; j++)
		 {
		   System.out.print(" "+(i));
		 }
		
		
		System.out.println();
	  }
	  
   }
} 


//prg-4.1
class hapy
{
   public static void main(String args[])
   {
     for(int i=1;i<=6;i++)
	 {
	    for(int j=1;j<=i;j++)
		{
		   System.out.print("* " );
		}
      System.out.println();
     }
   }
}   


//prg-4.2
class inhapy
{
    public static void main(String args[])
	{
      for(int i=6;i>=1;i--)
      {	
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
    	System.out.println();
	  }  
	}
}


//prg-4.3
class hollow
{
   public static void main(String args[])
   { 
      for(int i=1; i<=6; i++)
      {
      	for(int k=6; k>=i; k--)	  
	    {  
	      if(i==1 || k==i || k==6 )
             System.out.print("*");
          else
             System.out.print(" ");		
        }
      
	    for(int j=1; j<i; j++)
        {
           System.out.print(" ");
	    }
	 System.out.println();
     }
   } 
}


//prg-4.4
class fullpyra
{
    public static void main(String args[])
	{
	    for(int i=1;i<=6;i++)
		{ 
		   for(int k=5;k>=i;k--)//for spacing
		   {
              System.out.print(" ");
           }
           
           for(int j=1;j<=i;j++)
           {
              System.out.print(" *");
           }
        System.out.println();
        }
	}
}


//prg-4.5
class invfullpyra
{
   public static void main(String args[])
   {
      for(int i=1; i<=6; i++)
	  {
	     for(int s=1; s<=i; s++)
		 {
		    System.out.print(" ");
		 }	
		 
		 for(int j=6; j>=i; j--)
		 {
		   System.out.print(" "+"*");
		 }
		System.out.println();
	  }
   }
}  



//prg-4.6
class fullhollow
{
	public static void main(String args[])
	{
		for (int i=1;i<=6;i++)
		{
			if(i==1)
			  System.out.println("     * ");
			if(i==2)
			  System.out.println("    * *");
                        if(i==3)
			  System.out.println("   *   *");			  
			if(i==4)
			  System.out.println("  *     *");
                        if(i==5)
	 		  System.out.println(" *       *");	
                        if(i==6)
			  System.out.println("* * * * * *");			  
		}
	}
}
	
			
	   
	
	   	      		        
