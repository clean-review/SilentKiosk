package org.judy.silentkiosk.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKiosk is a Querydsl query type for Kiosk
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKiosk extends EntityPathBase<Kiosk> {

    private static final long serialVersionUID = -719666532L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKiosk kiosk = new QKiosk("kiosk");

    public final DateTimePath<java.time.LocalDateTime> kEndDate = createDateTime("kEndDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> kStartDate = createDateTime("kStartDate", java.time.LocalDateTime.class);

    public final StringPath serialNum = createString("serialNum");

    public final org.judy.silentkiosk.store.entity.QStore sno;

    public QKiosk(String variable) {
        this(Kiosk.class, forVariable(variable), INITS);
    }

    public QKiosk(Path<? extends Kiosk> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKiosk(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKiosk(PathMetadata metadata, PathInits inits) {
        this(Kiosk.class, metadata, inits);
    }

    public QKiosk(Class<? extends Kiosk> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sno = inits.isInitialized("sno") ? new org.judy.silentkiosk.store.entity.QStore(forProperty("sno")) : null;
    }

}

