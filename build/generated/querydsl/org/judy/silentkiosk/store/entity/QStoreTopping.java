package org.judy.silentkiosk.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreTopping is a Querydsl query type for StoreTopping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStoreTopping extends EntityPathBase<StoreTopping> {

    private static final long serialVersionUID = 871613734L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreTopping storeTopping = new QStoreTopping("storeTopping");

    public final QStore sno;

    public final StringPath tImg = createString("tImg");

    public final StringPath tName = createString("tName");

    public final NumberPath<Long> tno = createNumber("tno", Long.class);

    public final StringPath tPrice = createString("tPrice");

    public QStoreTopping(String variable) {
        this(StoreTopping.class, forVariable(variable), INITS);
    }

    public QStoreTopping(Path<? extends StoreTopping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreTopping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreTopping(PathMetadata metadata, PathInits inits) {
        this(StoreTopping.class, metadata, inits);
    }

    public QStoreTopping(Class<? extends StoreTopping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sno = inits.isInitialized("sno") ? new QStore(forProperty("sno")) : null;
    }

}

