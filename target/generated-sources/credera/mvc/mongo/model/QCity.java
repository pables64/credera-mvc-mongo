package credera.mvc.mongo.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCity is a Querydsl query type for City
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCity extends EntityPathBase<City> {

    private static final long serialVersionUID = 1037682086;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCity city = new QCity("city");

    public final QCharterDocument charterDocument;

    public final StringPath countryCode = createString("countryCode");

    public final StringPath id = createString("id");

    public final DateTimePath<java.util.Date> lastModificationDate = createDateTime("lastModificationDate", java.util.Date.class);

    public final StringPath Name = createString("Name");

    public final NumberPath<Integer> Population = createNumber("Population", Integer.class);

    public QCity(String variable) {
        this(City.class, forVariable(variable), INITS);
    }

    public QCity(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCity(PathMetadata<?> metadata, PathInits inits) {
        this(City.class, metadata, inits);
    }

    public QCity(Class<? extends City> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.charterDocument = inits.isInitialized("charterDocument") ? new QCharterDocument(forProperty("charterDocument")) : null;
    }

}

