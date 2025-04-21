public class APLine
{
 private int a1 = 0;
 private int a2 = 0;
 private int a3 = 0;
 public APline(int a, int b, int c){
   a1 = a;
   a2 = b;
   a3 = c;
 }
 public double getSlope(){
   return(-1.0*a1/a2);
 }
 public boolean isOnLine(int x, int y){
   return(a1*x + a2*y + a3 == 0);
 }
}
