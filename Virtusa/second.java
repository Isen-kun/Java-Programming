import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
  
class second {
    static double eps = 1e-9;
     static int n;
    static double[]  x = new double[200];
    static double[]  y = new double[200];
    static double  H;
    static double[][] dist = new double[200][200];
     
    static double gd(double x1,double y1,double x2,double y2)
    {
    	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
     
    static boolean check(int l,int r,double Y)
    {
    	for (int i=l;i<=r;i++)
    		if (Y<y[i]-eps||Y>y[i]+H+eps)
    			return false;
    	return true;
    }
     
    static boolean valid(double x1,double y1,double x2,double y2,int l,int r)
    {
    	for (int i=l;i<=r;i++)
    	{
    		double cx=x[i];
    		double qy=(cx-x1)*(y2-y1)/(x2-x1)+y1;
    		if (qy<y[i]-eps||qy>y[i]+H+eps)
    			return false;
    	}
    	return true;
    }
     
   
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
    for (int i=0;i<=n;i++)
    {
    	line = br.readLine();
    	String[] ar = line.split("\\s+");
    	     x[i] = Integer.parseInt(ar[0]);
    	     y[i] = Integer.parseInt(ar[1]);
    }
        line = br.readLine();
       H =   Integer.parseInt(line);
    
    
     
     
    for (int i=0;i<=n;i++)
    	dist[i][0]=dist[i][1]=1e9;
     
    dist[0][0]=dist[0][1]=0;
     
    for (int i=1;i<=n;i++)
    {
    	if (check(0,i-1,y[i]))
    		dist[i][0]=Math.min(dist[i][0],x[i]-x[0]);
    	if (check(0,i-1,y[i]+H))
    		dist[i][1]=Math.min(dist[i][1],x[i]-x[0]);
    }
     
    for (int i=0;i<n;i++)
    	for (int j=0;j<=1;j++)
    		for (int q=i+1;q<=n;q++)
    			for (int w=0;w<=1;w++)
    			{
    				double x1,y1,x2,y2;
    				
    				x1=x[i];
    				y1=y[i]+H*j;
    				x2=x[q];
    				y2=y[q]+H*w;
    				if (valid(x1,y1,x2,y2,i+1,q-1))
    					dist[q][w]=Math.min(dist[q][w],dist[i][j]+gd(x1,y1,x2,y2));
    			}
    			
    double ans=1e9;
    for (int i=0;i<=n;i++)
    {
    	if (check(i+1,n,y[i]))
    		ans=Math.min(ans,dist[i][0]+x[n]-x[i]);
    	if (check(i+1,n,y[i]+H))
    		ans=Math.min(ans,dist[i][1]+x[n]-x[i]);
    }
    System.out.println(String.format("%.10f",ans));
    }
}
