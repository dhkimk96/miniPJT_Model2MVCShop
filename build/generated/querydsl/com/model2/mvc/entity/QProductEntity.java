package com.model2.mvc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductEntity is a Querydsl query type for ProductEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductEntity extends EntityPathBase<ProductEntity> {

    private static final long serialVersionUID = 1139451923L;

    public static final QProductEntity productEntity = new QProductEntity("productEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath fileName = createString("fileName");

    public final DatePath<java.sql.Date> manuDate = createDate("manuDate", java.sql.Date.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath prodDetail = createString("prodDetail");

    public final StringPath prodName = createString("prodName");

    public final NumberPath<Integer> prodNo = createNumber("prodNo", Integer.class);

    public final ListPath<PurchaseEntity, QPurchaseEntity> purchaseEntities = this.<PurchaseEntity, QPurchaseEntity>createList("purchaseEntities", PurchaseEntity.class, QPurchaseEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> regDate = _super.regDate;

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public QProductEntity(String variable) {
        super(ProductEntity.class, forVariable(variable));
    }

    public QProductEntity(Path<? extends ProductEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductEntity(PathMetadata metadata) {
        super(ProductEntity.class, metadata);
    }

}

