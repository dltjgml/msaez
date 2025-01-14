package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "delieveries",
    path = "delieveries"
)
public interface DelieveryRepository
    extends PagingAndSortingRepository<Delievery, Long> {}
