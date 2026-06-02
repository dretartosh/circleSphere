# CircleSphere - Java Geometry Calculator

CircleSphere is a simple Java program that calculates several geometric values based on 
a user‑provided radius. It demonstrates core Java concepts such as method overloading, 
array initialization, user input handling, and formatted output.

# Features

    This program computes:
    
                  -> Circle Circumference
                  -> Circle Area
                  -> Sphere Area (using overloaded method)
                  -> Sphere Area
                  -> Sphere Volume

    All results are stored in arrays and displayed with two decimal places.

  # Key Concepts Demonstrated

    A. This shows how Java can use the same method name with different parameters to performs related 
       calculations (method overloading):
       
                   ~    getCircle(); 
                   ~    getCircleArea(double r)
                   ~    getCircleArea(double r, int sphereArea). 
       
           This shows how Java can use the same method name with different parameters to performs 
           related calculations.

    B. Array Initialization and Storage: Two arrays are used: 
    
                   ~  resultArr [ ] and computeArr [ ]
                          
            Respectfully storing labels for each compound value and results. Both arrays are 
            initialized and populated in populateArr().

    C. User Input with Scanner: The program prompts the user for a radius
                    
                   ~  public double getRadius(Scanner scnr)
                    
    D. Clean Output Formatting: Results are printed the following to ensure consistent, readable output.
                    
                   ~  System.out.printf("%s %.2f\n", resultArr[i], computeArr[i]);

  # Program Flow

    The program starts and create a CircleSphere Object, then the Arrays are initialized. Once completed the 
    user is prompted to enter a radius.
    
    All geometric values are computed and stored an array and then the results are diplayed in a formatted list.

  # How to Run
    You can run this program in any Java Environment. When prompted, enter a radius value ( e.g. 5.2)

                   ~    javac CircleSphere.java
                   ~    java CircleSphere

  # Example Output 
            line 01>   Enter radius:
            line 02>   5.2
            line 03>   Circle Circumference = 32.67
            line 04>   Circle Area = 84.95
            line 05>   Sphere Area (overloaded) = 339.82
            line 06>   Sphere Area = 339.82
            line 07>   Sphere Circumference = 588.77
                    
    (Values shown are examples; actual results depend on input)

  # Project Purpose and Code Overview
    The program is a redesign on a request to create a geometry toolkit. It can be used as a teaching example. 
    
    It practices the following:

                  i.  Fundamentals of Java
                 ii.  Method overloading
                iii.  Array handling
                 iv.  Input/Output formatting
                  v.  Basic geometry formulas

  The main methods include:
      
                  i.  getCircumference(double r)
                 ii.  getCircleArea(double r)
                iii.  getCircleArea(double r, int sphereArea) (overloaded)
                 iv.  getSphereArea(double r)
                  v.  getSphereVolume(double r)
                 vi.  computeCircleNow() — orchestrates all calculations


