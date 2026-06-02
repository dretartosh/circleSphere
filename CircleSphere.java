import java.util.Scanner;

class CircleSphere {
    private String [] resultArr;
    private double [] computeArr;
    private int resultBank = 5;
    public static double radNum = 0.0;
    
    public CircleSphere()
    {
        resultArr = new String [resultBank];
        computeArr = new double [resultBank];
        populateArr(); //intialize and load arrays
    }
    
    public static void main(String[] args) 
    {
        CircleSphere circle = new CircleSphere();
        Scanner scnr = new Scanner (System.in);
                    circleOperations(circle,scnr);
        scnr.close();
    }

    public static void circleOperations(CircleSphere circle, Scanner scnr)
    {
        /**
        * complete the operation of the program
        *@param Object, Scanner
        *
        */
                        circle.displayWelcome();
                        circle.computeCircleNow(circle, scnr);
                        circle.displayResults();
    }
    
    public void displayResults()
    {   
        /**
         * Display output
         */
         
        for(int i = 0; i < resultBank; i++)
        {
        System.out.printf("%s %.2f\n",resultArr[i], computeArr[i]);
        }
    }
    public void displayWelcome()
    {
        
        /**
         * Display output
         */
        System.out.println("Enter radius: ");
    }
    
    public void populateArr()
    {
        /**
         * Populate the arrays resultArr, computeArr
         */
        resultArr[0] = "Circle Circumference = ";
        resultArr[1] = "Circle Area = ";
        resultArr[2] = "Sphere Area (overloaded) = ";
        resultArr[3] = "Sphere Area = ";
        resultArr[4] = "Sphere Circumference = ";
        
        for(int i = 0; i < resultBank; i++)
        {
            computeArr[i] = 0.0;
        }
    }
    
    public double getCircumference(double r)
    {
        /**
         * method calculate Circumference
         * 
         * @param Double x
         * @return the result 2 * PI * r
         */
        return (2 * Math.PI * r);
    }
    public double getCircleArea(double r)
    {
        /**
         * method calculate circle area
         * 
         * @param Double x
         * @return the result of PI * x ^ 2
         */
         
        return (Math.PI * Math.pow(r,2));
    }
    public double getCircleArea(double r, int sphereArea) //overloaded
    {
        
        /**
         * Overloaded method calculate Sphere area
         * 
         * @param Double x, sphere Area
         * @return the result Sphere
         */
        return (sphereArea * Math.PI * Math.pow(r,2));
    }
    
    public double getRadius(Scanner scnr)
    {
        /**
         * gets Radius from input
         * 
         * @param Scanner to get input from user
         * @return input from user
         */
        return scnr.nextDouble();
    }
    
    public double getSphereArea(double r)
    {
        /**
         * xget the result of Sphere Area
         * 
         * @param Double x
         * @return the result of 4 * x
         */
        return (4 * r);
    }
    
    public double getSphereVolume(double r)
    {
        /**
         * xget the result of Sphere volume
         * 
         * @param Double x
         * @return the result of a sphere 4/3 * 3.14159265 * x ^ 2
         */
         
        return (4.0/3.0) *(Math.PI * Math.pow(r,3));
    }
    
    public void computeCircleNow(CircleSphere circle, Scanner scnr)
    {
        /**
         * A method that stores values
         * 
         * @param Scanner, class, CircleSphere
         */
         
        radNum = circle.getRadius(scnr);
        computeArr[0] = circle.getCircumference(radNum);
        computeArr[1] = circle.getCircleArea(radNum);
        computeArr[2] = circle.getCircleArea(radNum, 4);
        computeArr[3] = circle.getSphereArea(computeArr[1]);
        computeArr[4] = circle.getSphereVolume(radNum);
    }
}
