package com.model2.mvc.mapper;

import com.model2.mvc.entity.PurchaseEntity;
import com.model2.mvc.service.domain.Purchase;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-18T19:48:55+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 17.0.8.1 (JetBrains s.r.o.)"
)
@Component
public class PurchaseMapperImpl implements PurchaseMapper {

    @Override
    public PurchaseEntity purchaseToPurchaseEntity(Purchase purchase) {
        if ( purchase == null ) {
            return null;
        }

        PurchaseEntity.PurchaseEntityBuilder purchaseEntity = PurchaseEntity.builder();

        purchaseEntity.userEntity( getBuyerId( purchase.getBuyer() ) );
        purchaseEntity.productEntity( getProdNo( purchase.getPurchaseProd() ) );
        purchaseEntity.tranNo( purchase.getTranNo() );
        purchaseEntity.paymentOption( purchase.getPaymentOption() );
        purchaseEntity.receiverName( purchase.getReceiverName() );
        purchaseEntity.receiverPhone( purchase.getReceiverPhone() );
        purchaseEntity.divyAddr( purchase.getDivyAddr() );
        purchaseEntity.divyRequest( purchase.getDivyRequest() );
        purchaseEntity.tranCode( purchase.getTranCode() );
        purchaseEntity.orderDate( purchase.getOrderDate() );
        purchaseEntity.divyDate( purchase.getDivyDate() );

        return purchaseEntity.build();
    }

    @Override
    public Purchase purchaseEntityToPurchase(PurchaseEntity purchaseEntity) {
        if ( purchaseEntity == null ) {
            return null;
        }

        Purchase.PurchaseBuilder purchase = Purchase.builder();

        purchase.buyer( getBuyer( purchaseEntity.getUserEntity() ) );
        purchase.purchaseProd( getProduct( purchaseEntity.getProductEntity() ) );
        purchase.divyAddr( purchaseEntity.getDivyAddr() );
        purchase.divyDate( purchaseEntity.getDivyDate() );
        purchase.divyRequest( purchaseEntity.getDivyRequest() );
        purchase.orderDate( purchaseEntity.getOrderDate() );
        purchase.paymentOption( purchaseEntity.getPaymentOption() );
        purchase.receiverName( purchaseEntity.getReceiverName() );
        purchase.receiverPhone( purchaseEntity.getReceiverPhone() );
        purchase.tranCode( purchaseEntity.getTranCode() );
        purchase.tranNo( purchaseEntity.getTranNo() );

        return purchase.build();
    }
}
