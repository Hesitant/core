package src.ares.core.effect;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.World;

public class Animation
{
	public static ArrayList<Location> getCircle(Location center, double radius, int amount)
	{
		World world = center.getWorld();
		double increment = (2 * Math.PI) / amount;
		ArrayList<Location> locations = new ArrayList<>();

		for (int i = 0; i < amount; i++)
		{
			double angle = i * increment;
			double x = center.getX() + (radius * Math.cos(angle));
			double z = center.getZ() + (radius * Math.sin(angle));
			locations.add(new Location(world, x, center.getY(), z));
		}

		return locations;
	}
}
