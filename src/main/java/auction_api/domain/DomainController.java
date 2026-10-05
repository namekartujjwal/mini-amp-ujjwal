package auction_api.domain;
import auction_api.exception.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/domain")
public class DomainController {
    @GetMapping
    public Page<String>listDomain(Pageable pageable){
        return new PageImpl<>(List.of("example.com", "test.org"), pageable, 2);
    }
    @GetMapping("/{id}")
    public String getDomain(@PathVariable String id){
        throw new ResourceNotFoundException("Domain not Found with id: " + id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createDemoin(@Valid @RequestBody CreateDomainRequest request){
        return "Domain created: " + request.name();
    }
}
