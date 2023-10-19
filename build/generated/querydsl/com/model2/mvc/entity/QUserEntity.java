package com.model2.mvc.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = -70729523L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath addr = createString("addr");

    public final StringPath email = createString("email");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final ListPath<PurchaseEntity, QPurchaseEntity> purchaseEntities = this.<PurchaseEntity, QPurchaseEntity>createList("purchaseEntities", PurchaseEntity.class, QPurchaseEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> regDate = _super.regDate;

    public final StringPath role = createString("role");

    public final StringPath ssn = createString("ssn");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata metadata) {
        super(UserEntity.class, metadata);
    }

}

