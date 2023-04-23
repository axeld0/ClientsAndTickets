package Model;

import java.util.ArrayList;

public class Ticket {
    private int id ;
    private String date;
    private Client clientsCuit;
    private ArrayList<Line> line;
    private double total;

    private double discount;

    /**CONSTRUCTORS**/

    public Ticket()
    {
        id = 0;
        date = "";
        clientsCuit = new Client();
        line = new ArrayList<>();
        total = 0;
    }

    public Ticket(int id, String date, Client clientsCuit, ArrayList<Line> line) {
        this.id = id;
        this.date = date;
        this.clientsCuit = clientsCuit;
        this.line = line;
        this.total = getTotal(line);
    }

    /**GET TOTAL AMOUNT TICKET**/

    public double getTotal(ArrayList<Line>line)
    {
        double total= 0;
        for( Line l : line)
        {
            total+= l.getTotalPrice();
        }
        if(clientsCuit instanceof MayorClient)
        {
            total -= total *discount;
        }
        return  total;
    }

    /**GETTERS**/
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Client getClientsCuit() {
        return clientsCuit;
    }

    public ArrayList<Line> getLine() {
        return line;
    }

    public double getDiscount() {
        double discount = 0;
        if(clientsCuit instanceof MayorClient)
        {
            discount =((MayorClient) clientsCuit).getDiscount();
        }
        return  discount;
    }

    public double getTotalDiscount(){
        double total= 0;
        for( Line l : line)
        {
            total+= l.getTotalPrice();
        }
        if(clientsCuit instanceof MayorClient)
        {
            total = total * getDiscount();
        }
        return  total;
    }


    /**TOSTRING**/
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", clientsCuit=" + clientsCuit.getCuit() +
                ", line=" + line.toString() +
                ", \t\t\t\t\t\t\t\t\t\t\t\t\t\tdiscount=" + getDiscount() +
                ", \n\\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tt\t\t\t\t\t\t\t\t\t\t\t\t\tTotal discount=" + getTotalDiscount() +
                ", \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttotal=" + getTotal(line) +
                '}';
    }
}
