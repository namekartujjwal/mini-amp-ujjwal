package auction_api.auction;

import auction_api.domain.Domain;
import auction_api.registrar.Registrar;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "auctions")
public class Auction {
    @Id
    private String id;
    private String externalId;
    private BigDecimal currentProce;
    private Instant endsAt;

    @Column(name = "status_code")
    private String status;

    @Version
    private Long version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domain_id")
    private Domain domain;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registrar_id")
    private Registrar registrar;

    public  Auction(){}
}
