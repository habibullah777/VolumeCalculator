public class Volume
{
    private final int input;
    double pie = 3.14285714286;
    public Volume(int input1)
    {
        this.input =  input1;
    }

    private int getInput()
    {
        return input;
    }

    void PrintVolumes()
    {
        calculateSphereVolume();
        calculateCubeVolume();
        calculateTetrahedronVolume();
    }

    void calculateSphereVolume()
    {
        double volume=(4.0/3.0)* pie *(Math.pow(getInput(), 3));
        System.out.printf("A sphere of radius " +getInput()+ " has a volume of: %,.2f", volume);
        System.out.println();


    }
    void calculateCubeVolume()
    {
        double volume= Math.pow(getInput(),3);
        System.out.printf("A cube of width " +getInput()+ " has a volume of: %,.2f", volume);
        System.out.println();

    }
    void calculateTetrahedronVolume() {
        double volume3 = (Math.pow(getInput(), 3) / (6 * Math.sqrt(2)));
        System.out.printf("A regular tetrahedron with edge " + getInput() + " has a volume of: %,.2f", volume3);
        System.out.println();


    }


}
