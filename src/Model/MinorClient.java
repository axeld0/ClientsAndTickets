package Model;

public class MinorClient extends Client{


    public MinorClient (int id, String name , String address, int cuit)
    {
        super(id, name, address, cuit);
    }


    @Override
    public String toString() {
        return  super.toString() +
                "MinorClient{}";
    }
}
