package org.judy.silentkiosk.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreMenu is a Querydsl query type for StoreMenu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStoreMenu extends EntityPathBase<StoreMenu> {

    private static final long serialVersionUID = 585573600L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreMenu storeMenu = new QStoreMenu("storeMenu");

    public final NumberPath<Long> cno = createNumber("cno", Long.class);

    public final StringPath content = createString("content");

    public final StringPath menuName = createString("menuName");

    public final StringPath mImg = createString("mImg");

    public final NumberPath<Long> mno = createNumber("mno", Long.class);

    public final StringPath mPrice = createString("mPrice");

    public final QStore sno;

    public QStoreMenu(String variable) {
        this(StoreMenu.class, forVariable(variable), INITS);
    }

    public QStoreMenu(Path<? extends StoreMenu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreMenu(PathMetadata metadata, PathInits inits) {
        this(StoreMenu.class, metadata, inits);
    }

    public QStoreMenu(Class<? extends StoreMenu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sno = inits.isInitialized("sno") ? new QStore(forProperty("sno")) : null;
    }

}

