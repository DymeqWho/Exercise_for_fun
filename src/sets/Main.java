package sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);


//        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Venus", 225);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Earth", 365);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new HeavenlyBody("Mars", 687);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Phobos", 0.3);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new HeavenlyBody("Deimos", 1.3);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new HeavenlyBody("Jupiter", 4332);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        tempMoon = new HeavenlyBody("Io", 1.8);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new HeavenlyBody("Europa", 3.5);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new HeavenlyBody("Ganymede", 7.1);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        tempMoon = new HeavenlyBody("Callisto", 16.7);
//        solarSystem.put(tempMoon.getKey(), tempMoon);
//        temp.addSatellite(tempMoon);
//
//        temp = new HeavenlyBody("Saturn", 10759);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Uranus", 30660);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Neptune", 165);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        temp = new HeavenlyBody("Pluto", 248);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        System.out.println("Planets: ");
//        for(HeavenlyBody planet : planets){
//            System.out.println("\t" + planet.getKey());
//        }
//
//        HeavenlyBody body = solarSystem.get("Mars");
//        System.out.println("Moons of " + body.getKey());
//        for (HeavenlyBody jupiterMoon : body.getSatellites()){
//            System.out.println("\t" + jupiterMoon.getKey());
//        }
//        Set<HeavenlyBody> moons = new HashSet<>();
//        for(HeavenlyBody planet : planets){
//            moons.addAll(planet.getSatellites());
//        }
//        System.out.println("All Moons ");
//        for (HeavenlyBody moon : moons){
//            System.out.println("\t" + moon.getKey());
//        }
//
//        //Bad Pluto!
//        temp = new HeavenlyBody("Pluto", 842);
//        solarSystem.put(temp.getKey(), temp);
//        planets.add(temp);
//
//        for(HeavenlyBody planet:planets){
//            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
//        }
//
//        Object o = new Object();
//        o.equals(o);
//        "pluto".equals("");

        System.out.println("Planets: ");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey());

            Set<HeavenlyBody> moons = new HashSet<>();
            for (HeavenlyBody planet : planets) {
                moons.addAll(planet.getSatellites());
            }
            System.out.println("All Moons ");
            for (HeavenlyBody moon : moons) {
                System.out.println("\t" + moon.getKey());
            }

            //Bad Pluto!
            HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
            solarSystem.put(temp.getKey(), temp);
            planets.add(temp);

            for (HeavenlyBody planet : planets) {
                System.out.println(planet);
            }

            HeavenlyBody earth1 = new Planet("Earth", 365);
            HeavenlyBody earth2 = new Planet("Earth", 365);

            System.out.println("earth1.equals(earth2) = " + earth1.equals(earth2));
            System.out.println("earth2.equals(earth1) = " + earth2.equals(earth1));

            solarSystem.put(pluto.getKey(), pluto);
            System.out.println("solarSystem.get(HeavenlyBody.makeKey(\"Pluto\", HeavenlyBody.BodyTypes.PLANET)) = " + solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
            System.out.println("solarSystem.get(HeavenlyBody.makeKey(\"Pluto\", HeavenlyBody.BodyTypes.DWARF_PLANET)) = " + solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

            System.out.println();
            System.out.println("THe solar system contains: ");
            for(HeavenlyBody heavenlyBody : solarSystem.values()){
                System.out.println(heavenlyBody);
            }

        }
    }
}
