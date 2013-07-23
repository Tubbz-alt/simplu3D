package fr.ign.cogit.simplu3d.test.rjmcmc.cuboid.energy.cuboid;

import fr.ign.cogit.simplu3d.test.rjmcmc.cuboid.geometry.Cuboid;
import fr.ign.rjmcmc.energy.UnaryEnergy;

public class VolumeUnaryEnergy<T> implements UnaryEnergy<T> {

  @Override
  public double getValue(T t) {
    if (!(t instanceof Cuboid)) {
      return 0;
    }
    Cuboid c = (Cuboid) t;

    return c.toGeometry().getArea() * c.height;

  }

}
