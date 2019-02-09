package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comentario.class)
public abstract class Comentario_ {

	public static volatile SingularAttribute<Comentario, String> conteudo;
	public static volatile SingularAttribute<Comentario, String> data;
	public static volatile SingularAttribute<Comentario, Long> usuario;
	public static volatile SingularAttribute<Comentario, Long> postagem;
	public static volatile SingularAttribute<Comentario, Long> id;

	public static final String CONTEUDO = "conteudo";
	public static final String DATA = "data";
	public static final String USUARIO = "usuario";
	public static final String POSTAGEM = "postagem";
	public static final String ID = "id";

}

