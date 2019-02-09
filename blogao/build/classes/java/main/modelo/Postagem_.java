package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Postagem.class)
public abstract class Postagem_ {

	public static volatile SingularAttribute<Postagem, String> texto;
	public static volatile SingularAttribute<Postagem, String> data;
	public static volatile SingularAttribute<Postagem, String> titulo;
	public static volatile SingularAttribute<Postagem, Long> id;

	public static final String TEXTO = "texto";
	public static final String DATA = "data";
	public static final String TITULO = "titulo";
	public static final String ID = "id";

}

