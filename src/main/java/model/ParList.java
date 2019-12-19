package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "par_list")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParList {
    @XmlAttribute()
    private String value;

    public ParList(String value) {
        this.value = value;
    }
}
