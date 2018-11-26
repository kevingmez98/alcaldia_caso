package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-25T21:06:58")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> icono;
    public static volatile SingularAttribute<Permiso, Integer> id_permiso;
    public static volatile SingularAttribute<Permiso, String> urlPermiso;
    public static volatile SingularAttribute<Permiso, String> nombrePermiso;
    public static volatile ListAttribute<Permiso, ? extends Object> listaRoles;

}