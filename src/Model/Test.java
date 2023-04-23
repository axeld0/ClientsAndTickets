package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    ArrayList<Line>line = new ArrayList<>();
    public void newLine()
    {

        Line l1 = new Line("Martillo", 23, 3);
        Line l2 = new Line ("Serrucho", 3, 50);
        line.add(l1);
        line.add(l2);

    }

    public void newClients(){
        Client c1 = new MayorClient(36617165, "axeldo", "Mexico 1483", 2036617168, 0.20);
        Client c2 = new MinorClient(38765365, "Carla Peterson", "Cochabamba 123", 383654563);
        Ticket t1 = new Ticket(1, "20/2/23", c2,line);
        Ticket t2 = new Ticket(2, "21/2/23", c1,line);

        System.out.println((t1));
        System.out.println(t2);
    }

}
