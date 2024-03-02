package org.esg.exercise.transaformer;

import org.esg.exercise.dto.CustomerDto;
import org.esg.exercise.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class ConvertCustomerEntity {

    public CustomerDto transform(CustomerEntity customerEntity) {
        return CustomerDto.builder()
                .customerRef(customerEntity
                        .getCustomerRef())
                .customerName(customerEntity.getCustomerName())
                .addressLineOne(customerEntity.getAddressLineOne())
                .addressLineTwo(customerEntity.getAddressLineTwo())
                .town(customerEntity.getTown())
                .county(customerEntity.getCounty())
                .country(customerEntity.getCountry())
                .postcode(customerEntity.getPostcode())
                .build();
    }
}
