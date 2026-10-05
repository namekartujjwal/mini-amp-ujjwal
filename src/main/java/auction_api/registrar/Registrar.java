package auction_api.registrar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrars")
public class Registrar {
    @Id
    private String id;

    private String name;
    private String baseUrl;

    public Registrar(){}

    public Registrar(String id, String name, String baseUrl){
        this.id = id;
        this.name = name;
        this.baseUrl = baseUrl;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getBaseUrl(){
        return baseUrl;
    }
}
