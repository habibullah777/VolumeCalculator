package VolTest;

import Volume.Volume;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest
{
    @Test
    public void correctVolume()
    {
      Volume vol = new Volume(5);

      double expectedSphere = 523.81;
      double expectedCube = 125.00;
      double expectedTetra = 14.73;

      double actualSphere = vol.calculateSphereVolume();
      double actualCube = vol.calculateCubeVolume();
      double actualTetra = vol.calculateTetrahedronVolume();

      assertEquals (expectedSphere, actualSphere, 0.01);
      assertEquals (expectedCube, actualCube,0);
      assertEquals (expectedTetra, actualTetra,0.01);
    }
}
