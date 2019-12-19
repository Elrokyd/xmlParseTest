package model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "par")
@XmlAccessorType(XmlAccessType.FIELD)
public class Par {
    public Par(List<ParList> parListItems, String step, String name, String fullname,
               String comment, int isEditable, int isScanable, int isVisible,
               int isRequired, int isPrinted, int isValidateOnLine, String type,
               int min_length, int max_length, double double_input, String value,
               String reg_exp, int from_debt) {
        this.parListItems = parListItems;
        this.step = step;
        this.name = name;
        this.fullname = fullname;
        this.comment = comment;
        this.isEditable = isEditable;
        this.isScanable = isScanable;
        this.isVisible = isVisible;
        this.isRequired = isRequired;
        this.isPrinted = isPrinted;
        this.isValidateOnLine = isValidateOnLine;
        this.type = type;
        this.min_length = min_length;
        this.max_length = max_length;
        this.double_input = double_input;
        this.value = value;
        this.reg_exp = reg_exp;
        this.from_debt = from_debt;
    }

    @XmlElement(name = "par_list")

    private List<ParList> parListItems;

    @XmlAttribute
    private String step;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String fullname;
    @XmlAttribute
    private String comment;
    @XmlAttribute
    private int isEditable;
    @XmlAttribute
    private int isScanable;
    @XmlAttribute
    private int isVisible;
    @XmlAttribute
    private int isRequired;
    @XmlAttribute
    private int isPrinted;
    @XmlAttribute
    private int isValidateOnLine;
    @XmlAttribute
    private String type;
    @XmlAttribute
    private int min_length;
    @XmlAttribute
    private int max_length;
    @XmlAttribute
    private double double_input;
    @XmlAttribute
    private String value;
    @XmlAttribute
    private String reg_exp;
    @XmlAttribute
    private int from_debt;

}
