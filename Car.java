import java.io.Serializable;

/**
 * Created by Source_it-3 on 10.06.2016.
 */
public class Car implements Serializable {
    private String name;
    private Integer number;
    Car (String n, Integer nu){
        name = n;
        number = nu;
    }
}
