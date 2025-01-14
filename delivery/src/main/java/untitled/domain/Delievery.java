package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.DeliveryApplication;
import untitled.domain.DeliveryStarted;

@Entity
@Table(name = "Delievery_table")
@Data
//<<< DDD / Aggregate Root
public class Delievery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private Long productId;

    private String productName;

    private Integer qty;

    private String address;

    private String status;

    public static DelieveryRepository repository() {
        DelieveryRepository delieveryRepository = DeliveryApplication.applicationContext.getBean(
            DelieveryRepository.class
        );
        return delieveryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startShipping(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Delievery delievery = new Delievery();
        repository().save(delievery);

        DeliveryStarted deliveryStarted = new DeliveryStarted(delievery);
        deliveryStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        // if orderPlaced.pgId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> orderMap = mapper.convertValue(orderPlaced.getPgId(), Map.class);

        repository().findById(orderPlaced.get???()).ifPresent(delievery->{
            
            delievery // do something
            repository().save(delievery);

            DeliveryStarted deliveryStarted = new DeliveryStarted(delievery);
            deliveryStarted.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
