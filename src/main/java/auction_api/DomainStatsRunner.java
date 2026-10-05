package auction_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DomainStatsRunner implements CommandLineRunner {

    private final ObjectMapper om;

    public DomainStatsRunner(ObjectMapper om) {
        this.om = om;
    }

    @Override
    public void run(String... a) throws Exception {
        if (a.length > 0 && "stats".equals(a[0])) {
            InputStream is = getClass().getResourceAsStream("/domain.json");
            List<DomainRecord> d = om.readValue(is, new TypeReference<>() {});

            Map<String, Long> g = d.stream()
                    .collect(Collectors.groupingBy(DomainRecord::tld, Collectors.counting()));

            System.out.println(d.size());
            System.out.println(g);

            System.exit(0);
        }
    }
}