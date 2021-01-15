package Methods;



public class circle
{
    float radius,pi;
    
    
    public circle()
    {
        pi=3.14f;
    }
    public circle(float R)
    {
        radius = R;
        pi=3.14f;
    }
    
    public float area()
    {
        float answer = pi*radius*radius;
        
        return answer;
    }
    
    public static void main()
    {
        
        circle obj = new circle(5.4f);
        
        float d = obj.area();
        System.out.println("answer "+d);
        
    }
}
