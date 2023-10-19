package com.model2.mvc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPurchaseEntity is a Querydsl query type for PurchaseEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPurchaseEntity extends EntityPathBase<PurchaseEntity> {

    private static final long serialVersionUID = -444603901L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPurchaseEntity purchaseEntity = new QPurchaseEntity("purchaseEntity");

    public final StringPath divyAddr = createString("divyAddr");

    public final DatePath<java.sql.Date> divyDate = createDate("divyDate", java.sql.Date.class);

    public final StringPath divyRequest = createString("divyRequest");

    public final DatePath<java.sql.Date> orderDate = createDate("orderDate", java.sql.Date.class);

    public final StringPath paymentOption = createString("paymentOption");

    public final QProductEntity productEntity;

    public final StringPath receiverName = createString("receiverName");

    public final StringPath receiverPhone = createString("receiverPhone");

    public final StringPath tranCode = createString("tranCode");

    public final NumberPath<Integer> tranNo = createNumber("tranNo", Integer.class);

    public final QUserEntity userEntity;

    public QPurchaseEntity(String variable) {
        this(PurchaseEntity.class, forVariable(variable), INITS);
    }

    public QPurchaseEntity(Path<? extends PurchaseEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPurchaseEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPurchaseEntity(PathMetadata metadata, PathInits inits) {
        this(PurchaseEntity.class, metadata, inits);
    }

    public QPurchaseEntity(Class<? extends PurchaseEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productEntity = inits.isInitialized("productEntity") ? new QProductEntity(forProperty("productEntity")) : null;
        this.userEntity = inits.isInitialized("userEntity") ? new QUserEntity(forProperty("userEntity")) : null;
    }

}

