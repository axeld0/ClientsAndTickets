package Model;

public class Client {
    private int id;
    private String name;

    private String address;

    private int cuit;


    /**
     * constructors
     */
    public Client()
    {
        id = 0;
        name = "";
        address = "";
        cuit = 0;

    }
    public Client(int id, String name, String address, int cuit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cuit = cuit;
    }

    /**setters and getters**/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    /**toString()**/

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cuit=" + cuit +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        boolean r = false;
        if(o !=null)
        {
            if(o instanceof Client)
            {
                Client aux = (Client) o;

                if(getId() == aux.getId() && getName().equals(aux.getName())) {
                    r = true;
                }
            }
        }
        return r;
    }
}
