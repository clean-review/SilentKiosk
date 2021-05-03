package org.judy.silentkiosk.store.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = 1381069793L;

    public static final QStore store = new QStore("store");

    public final org.judy.silentkiosk.common.entity.QBaseEntity _super = new org.judy.silentkiosk.common.entity.QBaseEntity(this);

    public final StringPath address = createString("address");

    public final StringPath category = createString("category");

    public final BooleanPath enable = createBoolean("enable");

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lng = createNumber("lng", Double.class);

    public final StringPath logoImg = createString("logoImg");

    public final StringPath mid = createString("mid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public final StringPath sname = createString("sname");

    public final NumberPath<Long> sno = createNumber("sno", Long.class);

    public QStore(String variable) {
        super(Store.class, forVariable(variable));
    }

    public QStore(Path<? extends Store> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore(PathMetadata metadata) {
        super(Store.class, metadata);
    }

}

