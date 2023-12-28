public class k12
{
    public static void main(String[] args)
    {
        int x,y,z;
        x=4;
        y=5;
        z=y+6;
        while ((z-x) % 4 !=0){
            System.out.println(z + "");
            z = z+7;
        }
        System.out.println(z + "");
    }
}
