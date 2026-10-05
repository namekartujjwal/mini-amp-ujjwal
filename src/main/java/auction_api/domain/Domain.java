package auction_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "domains")
public class Domain {
    @Id
    private String id;

    @Column(unique = true, nullable = false)
    private  String name;

    private String tld;
    private int length;
    private Instant createdAt = Instant.now();

    public Domain(){}

    public Domain(String id, String name, String tld, int length){
        this.id = id;
        this.name = name;
        this.tld = tld;
        this.length = length;
    }
    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getLength(){
        return length;
    }
    public Instant getCreatedAt(){
        return createdAt;
    }
}
