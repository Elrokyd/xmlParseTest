package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "serv")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor
public class Serv {
    @XmlElement(name = "serv_id")
    private String servId;
    @XmlElement(name = "bic")
    private long bic;
    @XmlElement(name = "schet")
    private String schet;
    @XmlElement(name = "corrSchet")
    private String corrSchet;
    @XmlElement(name = "pars")
    private List<Pars> pars;
    @XmlAttribute(name = "isClosed")
    private int isClosed;

    public Serv(String servId, long bic, String schet, String corrSchet, List<Pars> pars) {
        this.servId = servId;
        this.bic = bic;
        this.schet = schet;
        this.corrSchet = corrSchet;
        this.pars = pars;
    }
}
