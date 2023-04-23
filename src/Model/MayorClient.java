package Model;

public class MayorClient extends Client{
     private double discount;



     /**CONSTRUCTORS**/
     public MayorClient()
     {
          discount = 0;
     }

     public MayorClient(int id , String name , String address, int cuit, double discount)
     {
          super(id, name, address, cuit);
          this.discount = discount;
     }

     /**SETTERS AND GETTERS**/

     public double getDiscount() {
          return discount;
     }

     public void setDiscount(double discount) {
          this.discount = discount;
     }

     /**TOSTRING*/

     @Override
     public String toString() {
          return  super.toString() +
                  "MayorClient{" +
                  "discount=" + discount +
                  '}';
     }
}
