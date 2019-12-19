package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor
public class Order implements Serializable {

    @XmlElement(name = "services")
    private List<Services> orderServ;

    @XmlElement(name = "summa")
    private double summa;

    public Order(List<Services> serv, double summa) {
        this.orderServ = serv;
        this.summa = summa;
    }

}
