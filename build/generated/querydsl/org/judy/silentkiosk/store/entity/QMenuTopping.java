package org.judy.silentkiosk.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuTopping is a Querydsl query type for MenuTopping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMenuTopping extends EntityPathBase<MenuTopping> {

    private static final long serialVersionUID = -1833085720L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuTopping menuTopping = new QMenuTopping("menuTopping");

    public final QStoreMenu storeMenu;

    public final QStoreTopping storeTopping;

    public QMenuTopping(String variable) {
        this(MenuTopping.class, forVariable(variable), INITS);
    }

    public QMenuTopping(Path<? extends MenuTopping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuTopping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuTopping(PathMetadata metadata, PathInits inits) {
        this(MenuTopping.class, metadata, inits);
    }

    public QMenuTopping(Class<? extends MenuTopping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.storeMenu = inits.isInitialized("storeMenu") ? new QStoreMenu(forProperty("storeMenu"), inits.get("storeMenu")) : null;
        this.storeTopping = inits.isInitialized("storeTopping") ? new QStoreTopping(forProperty("storeTopping"), inits.get("storeTopping")) : null;
    }

}

