package org.judy.silentkiosk.test.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestOrder is a Querydsl query type for TestOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTestOrder extends EntityPathBase<TestOrder> {

    private static final long serialVersionUID = -770303601L;

    public static final QTestOrder testOrder = new QTestOrder("testOrder");

    public final StringPath menu = createString("menu");

    public final NumberPath<Long> ono = createNumber("ono", Long.class);

    public final NumberPath<Long> price = createNumber("price", Long.class);

    public final NumberPath<Long> qty = createNumber("qty", Long.class);

    public final NumberPath<Long> sno = createNumber("sno", Long.class);

    public QTestOrder(String variable) {
        super(TestOrder.class, forVariable(variable));
    }

    public QTestOrder(Path<? extends TestOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestOrder(PathMetadata metadata) {
        super(TestOrder.class, metadata);
    }

}

