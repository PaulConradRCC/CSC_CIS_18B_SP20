public class MaxDemo {
    
    public static void main(String[] args) {
        
        double a=3.4, b=2.1, c=1.1;       
        System.out.printf("max(%f,%f)=%f\n",a,b,max(a,b));
        System.out.printf("max(%f,%f,%f)=%f\n",a,b,c,max(a,b,c));
        
        double aa=3.4, bb=3.4, cc=4.3;
        System.out.printf("max(%f,%f)=%f\n",aa,bb,max(aa,bb));
        System.out.printf("max(%f,%f,%f)=%f\n",aa,bb,cc,max(aa,bb,cc));
        
        double aaa=3.4, bbb=3.4005, ccc=3.400505;
        System.out.printf("max(%f,%f)=%f\n",aaa,bbb,max(aaa,bbb));
        System.out.printf("max(%f,%f,%f)=%f\n",aaa,bbb,ccc,max(aaa,bbb,ccc));
        
        long laaa=34L, lbbb=34005L, lccc=3400505L;
        System.out.printf("max(%d,%d)=%d\n",laaa,lbbb,max(laaa,lbbb));
        System.out.printf("max(%d,%d,%d)=%d\n",laaa,lbbb,lccc,max(laaa,lbbb,lccc));
    }

    public static long max(long x, long y, long z)
    {
        return max(x,max(y,z));
    }
    
    public static long max(long x, long y)
    {
        return (long)max((double)x, (double)y);
    }
    
    public static double max(double x, double y)
    {        
        return x > y ? x : y;
    }
    
    public static double max(double x, double y, double z)
    {
        return max(x, max(y,z));
    }
}
