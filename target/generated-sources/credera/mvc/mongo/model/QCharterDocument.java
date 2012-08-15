package credera.mvc.mongo.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.*;
import com.mysema.query.types.path.*;

import javax.annotation.Generated;


/**
 * QCharterDocument is a Querydsl query type for CharterDocument
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QCharterDocument extends BeanPath<CharterDocument> {

    private static final long serialVersionUID = -858599381;

    public static final QCharterDocument charterDocument = new QCharterDocument("charterDocument");

    public final MapPath<String, String, StringPath> officers = this.<String, String, StringPath>createMap("officers", String.class, String.class, StringPath.class);

    public final ListPath<String, StringPath> streets = this.<String, StringPath>createList("streets", String.class, StringPath.class);

    public final StringPath yearOfCharter = createString("yearOfCharter");

    public QCharterDocument(String variable) {
        super(CharterDocument.class, forVariable(variable));
    }

    public QCharterDocument(Path<? extends CharterDocument> entity) {
        super(entity.getType(), entity.getMetadata());
    }

    public QCharterDocument(PathMetadata<?> metadata) {
        super(CharterDocument.class, metadata);
    }

}

