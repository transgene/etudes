package net.transgene.etudes.java9.main;

import net.transgene.etudes.java9.service.StrongJavaService;

import java.util.ServiceLoader;

public class Launcher {

    public static void main(String[] args) {
        net.transgene.etudes.java9.calc.Calculator calculator = new net.transgene.etudes.java9.calc.Calculator();

        System.out.println("Launching the launcher");
        System.out.println("Calculating 3+2: " + calculator.sum(3, 2));

        //HiddenCalculator hiddenCalculator = new HiddenCalculator();

        ServiceLoader<StrongJavaService> services = ServiceLoader.load(StrongJavaService.class);
        System.out.println("And now we'll test the services!");
        System.out.println("We have these services:");
        for (net.transgene.etudes.java9.service.StrongJavaService service : services) {
            System.out.println(" - " + service.getClass().getName());
            System.out.println("\t\tNow we're checking it: " + service.doABarrelRoll());
        }
    }
}
