package org.judy.silentkiosk.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderTopping is a Querydsl query type for OrderTopping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderTopping extends EntityPathBase<OrderTopping> {

    private static final long serialVersionUID = -1052399610L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderTopping orderTopping = new QOrderTopping("orderTopping");

    public final QOrderMenu omno;

    public final NumberPath<Long> otno = createNumber("otno", Long.class);

    public final org.judy.silentkiosk.store.entity.QStoreTopping tno;

    public final NumberPath<Long> tqty = createNumber("tqty", Long.class);

    public QOrderTopping(String variable) {
        this(OrderTopping.class, forVariable(variable), INITS);
    }

    public QOrderTopping(Path<? extends OrderTopping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderTopping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderTopping(PathMetadata metadata, PathInits inits) {
        this(OrderTopping.class, metadata, inits);
    }

    public QOrderTopping(Class<? extends OrderTopping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.omno = inits.isInitialized("omno") ? new QOrderMenu(forProperty("omno"), inits.get("omno")) : null;
        this.tno = inits.isInitialized("tno") ? new org.judy.silentkiosk.store.entity.QStoreTopping(forProperty("tno"), inits.get("tno")) : null;
    }

}

