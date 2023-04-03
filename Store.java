public class Store {
    String Name ;

    Double Price;
    Store(String Name, Double Price  ){
        this.Name = Name;
        this.Price = Price;
 
        System.out.println(Name + " created "  );
        System.out.println("PHP. " + Price );
     }
}
