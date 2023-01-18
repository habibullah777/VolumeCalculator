package Volume;
public class Volume
{
    private final int input;
    public Volume(int input1)
    {
        this.input =  input1;
    }            // constructor
    private int getInput()                                        //  getter
    {
        return input;
    }

    public double calculateSphereVolume()                       // function to calculate volume of sphere from radius
    {
        double pie = 3.14285714286;                             // using formula V = (4/3)*π*(radius^3)
        return (4.0/3.0)* pie *(Math.pow(getInput(), 3));
    }
    public double calculateCubeVolume()                        // function to calculate volume of cube from width
    {
        return Math.pow(getInput(),3);                         // using formula V = (width*3) i.e LxWxH
    }
    public double calculateTetrahedronVolume()                 // function to calculate tetrahedron's volume from width
    {
       return (Math.pow(getInput(), 3) / (6 * Math.sqrt(2)));   // using formula V = (edge^3)/(6*√2)


    }
    void PrintVolumes()
    {
        System.out.printf("A sphere of radius " +getInput()+ " has a volume of: %,.2f",calculateSphereVolume());
        System.out.println();
        System.out.printf("A cube of width " +getInput()+ " has a volume of: %,.2f",  calculateCubeVolume());
        System.out.println();
        System.out.printf("A regular tetrahedron with edge " + getInput() + " has a volume of: %,.2f", calculateTetrahedronVolume());
        System.out.println();

    }


}