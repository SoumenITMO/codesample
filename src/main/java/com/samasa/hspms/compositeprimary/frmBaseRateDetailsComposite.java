package com.samasa.hspms.compositeprimary;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class frmBaseRateDetailsComposite implements Serializable {

    private String unitCode;
    private String baseRateCode;
    private String dow;
    private String occType;
    private String occInd;
    private String curCode;

    public frmBaseRateDetailsComposite() {

    }
}
