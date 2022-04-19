public class TowerOfHanoi1
{	
    public void run()
	{
	    moveTowers(3,'A','B','C');//runninf program(n, A,B,C )	
	}
	
	public void	moveTowers(int	n,	char	A,	char	B,	char	C)///public method for moving towers
  { if	(n==1)
  System.out.println("Move a disk from rod "+A+" to	rod	"+C);
	else
	{		
        moveTowers(n-1,	A,	C,	B);
																
        System.out.println("Move a disk from rod "+A+" to rod "+B);
																
        moveTowers(n-1,	B,	A,	C);
			}
	}
	public	static	void	main(String[]	args)
		{ TowerOfHanoi1	objct = new TowerOfHanoi1();
            objct.run();
								}
}