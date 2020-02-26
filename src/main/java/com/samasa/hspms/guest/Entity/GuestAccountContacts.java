package com.samasa.hspms.guest.Entity;

import javax.persistence.*;

@Entity
@Table(name = "guest_account_contacts")
@IdClass(GuestAccountContactsId.class)
public class GuestAccountContacts {
    private String unitCode;
    private Integer guestUid;
    private String contactPerName;
    private String contactPerContact1;
    private String contactPerContact2;
    private String contactPerMobile;
    private String contactPerEmail;
    private String address1;
    private String address2;
    private String address3;
    private Integer zipCode;
    private String cityCode;
    private String cityName;
    private String stateCode;
    private String stateName;
    private String countryCode;
    private String countryName;
    private String contact1;
    private String contact2;
    private String fax;
    private String mobile;
    private String email;
    private String urlWeb;
    private String urlFacebook;
    private String urlProducts;
    private String urlWhatsapp;
    private String billingAddress1;
    private String billingAddress2;
    private String billingAddress3;
    private Integer billingZipCode;
    private Integer billingCityCode;
    private Integer billingStateCode;
    private Integer billingCountryCode;
    private String billingContact1;
    private String billingContact2;
    private String billingFax;

    @Id
    @Column(name = "unit_code", nullable = false, length = 5)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Id
    @Column(name = "guest_uid", nullable = false)
    public Integer getGuestUid() {
        return guestUid;
    }

    public void setGuestUid(Integer guestUid) {
        this.guestUid = guestUid;
    }

    @Basic
    @Column(name = "contact_per_name", nullable = true, length = 60)
    public String getContactPerName() {
        return contactPerName;
    }

    public void setContactPerName(String contactPerName) {
        this.contactPerName = contactPerName;
    }

    @Basic
    @Column(name = "contact_per_contact1", nullable = true, length = 15)
    public String getContactPerContact1() {
        return contactPerContact1;
    }

    public void setContactPerContact1(String contactPerContact1) {
        this.contactPerContact1 = contactPerContact1;
    }

    @Basic
    @Column(name = "contact_per_contact2", nullable = true, length = 15)
    public String getContactPerContact2() {
        return contactPerContact2;
    }

    public void setContactPerContact2(String contactPerContact2) {
        this.contactPerContact2 = contactPerContact2;
    }

    @Basic
    @Column(name = "contact_per_mobile", nullable = true, length = 15)
    public String getContactPerMobile() {
        return contactPerMobile;
    }

    public void setContactPerMobile(String contactPerMobile) {
        this.contactPerMobile = contactPerMobile;
    }

    @Basic
    @Column(name = "contact_per_email", nullable = true, length = 320)
    public String getContactPerEmail() {
        return contactPerEmail;
    }

    public void setContactPerEmail(String contactPerEmail) {
        this.contactPerEmail = contactPerEmail;
    }

    @Basic
    @Column(name = "Address1", nullable = true, length = 100)
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "Address2", nullable = true, length = 100)
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "Address3", nullable = true, length = 100)
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    @Basic
    @Column(name = "zip_code", nullable = true)
    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "city_code", nullable = true, length = 3)
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "city_name", nullable = true, length = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "state_code", nullable = true, length = 3)
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Basic
    @Column(name = "state_name", nullable = true, length = 100)
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Basic
    @Column(name = "country_code", nullable = true, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "country_name", nullable = true, length = 100)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "contact1", nullable = true, length = 15)
    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    @Basic
    @Column(name = "contact2", nullable = true, length = 15)
    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = 15)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 15)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 320)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "url_web", nullable = true, length = 500)
    public String getUrlWeb() {
        return urlWeb;
    }

    public void setUrlWeb(String urlWeb) {
        this.urlWeb = urlWeb;
    }

    @Basic
    @Column(name = "url_facebook", nullable = true, length = 500)
    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }

    @Basic
    @Column(name = "url_products", nullable = true, length = 500)
    public String getUrlProducts() {
        return urlProducts;
    }

    public void setUrlProducts(String urlProducts) {
        this.urlProducts = urlProducts;
    }

    @Basic
    @Column(name = "url_whatsapp", nullable = true, length = 500)
    public String getUrlWhatsapp() {
        return urlWhatsapp;
    }

    public void setUrlWhatsapp(String urlWhatsapp) {
        this.urlWhatsapp = urlWhatsapp;
    }

    @Basic
    @Column(name = "billing_address1", nullable = true, length = 100)
    public String getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    @Basic
    @Column(name = "billing_address2", nullable = true, length = 100)
    public String getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    @Basic
    @Column(name = "billing_address3", nullable = true, length = 100)
    public String getBillingAddress3() {
        return billingAddress3;
    }

    public void setBillingAddress3(String billingAddress3) {
        this.billingAddress3 = billingAddress3;
    }

    @Basic
    @Column(name = "billing_zip_code", nullable = true)
    public Integer getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(Integer billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    @Basic
    @Column(name = "billing_city_code", nullable = true)
    public Integer getBillingCityCode() {
        return billingCityCode;
    }

    public void setBillingCityCode(Integer billingCityCode) {
        this.billingCityCode = billingCityCode;
    }

    @Basic
    @Column(name = "billing_state_code", nullable = true)
    public Integer getBillingStateCode() {
        return billingStateCode;
    }

    public void setBillingStateCode(Integer billingStateCode) {
        this.billingStateCode = billingStateCode;
    }

    @Basic
    @Column(name = "billing_country_code", nullable = true)
    public Integer getBillingCountryCode() {
        return billingCountryCode;
    }

    public void setBillingCountryCode(Integer billingCountryCode) {
        this.billingCountryCode = billingCountryCode;
    }

    @Basic
    @Column(name = "billing_contact1", nullable = true, length = 15)
    public String getBillingContact1() {
        return billingContact1;
    }

    public void setBillingContact1(String billingContact1) {
        this.billingContact1 = billingContact1;
    }

    @Basic
    @Column(name = "billing_contact2", nullable = true, length = 15)
    public String getBillingContact2() {
        return billingContact2;
    }

    public void setBillingContact2(String billingContact2) {
        this.billingContact2 = billingContact2;
    }

    @Basic
    @Column(name = "billing_fax", nullable = true, length = 15)
    public String getBillingFax() {
        return billingFax;
    }

    public void setBillingFax(String billingFax) {
        this.billingFax = billingFax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestAccountContacts that = (GuestAccountContacts) o;

        if (unitCode != null ? !unitCode.equals(that.unitCode) : that.unitCode != null) return false;
        if (guestUid != null ? !guestUid.equals(that.guestUid) : that.guestUid != null) return false;
        if (contactPerName != null ? !contactPerName.equals(that.contactPerName) : that.contactPerName != null)
            return false;
        if (contactPerContact1 != null ? !contactPerContact1.equals(that.contactPerContact1) : that.contactPerContact1 != null)
            return false;
        if (contactPerContact2 != null ? !contactPerContact2.equals(that.contactPerContact2) : that.contactPerContact2 != null)
            return false;
        if (contactPerMobile != null ? !contactPerMobile.equals(that.contactPerMobile) : that.contactPerMobile != null)
            return false;
        if (contactPerEmail != null ? !contactPerEmail.equals(that.contactPerEmail) : that.contactPerEmail != null)
            return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (stateCode != null ? !stateCode.equals(that.stateCode) : that.stateCode != null) return false;
        if (stateName != null ? !stateName.equals(that.stateName) : that.stateName != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (contact1 != null ? !contact1.equals(that.contact1) : that.contact1 != null) return false;
        if (contact2 != null ? !contact2.equals(that.contact2) : that.contact2 != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (urlWeb != null ? !urlWeb.equals(that.urlWeb) : that.urlWeb != null) return false;
        if (urlFacebook != null ? !urlFacebook.equals(that.urlFacebook) : that.urlFacebook != null) return false;
        if (urlProducts != null ? !urlProducts.equals(that.urlProducts) : that.urlProducts != null) return false;
        if (urlWhatsapp != null ? !urlWhatsapp.equals(that.urlWhatsapp) : that.urlWhatsapp != null) return false;
        if (billingAddress1 != null ? !billingAddress1.equals(that.billingAddress1) : that.billingAddress1 != null)
            return false;
        if (billingAddress2 != null ? !billingAddress2.equals(that.billingAddress2) : that.billingAddress2 != null)
            return false;
        if (billingAddress3 != null ? !billingAddress3.equals(that.billingAddress3) : that.billingAddress3 != null)
            return false;
        if (billingZipCode != null ? !billingZipCode.equals(that.billingZipCode) : that.billingZipCode != null)
            return false;
        if (billingCityCode != null ? !billingCityCode.equals(that.billingCityCode) : that.billingCityCode != null)
            return false;
        if (billingStateCode != null ? !billingStateCode.equals(that.billingStateCode) : that.billingStateCode != null)
            return false;
        if (billingCountryCode != null ? !billingCountryCode.equals(that.billingCountryCode) : that.billingCountryCode != null)
            return false;
        if (billingContact1 != null ? !billingContact1.equals(that.billingContact1) : that.billingContact1 != null)
            return false;
        if (billingContact2 != null ? !billingContact2.equals(that.billingContact2) : that.billingContact2 != null)
            return false;
        if (billingFax != null ? !billingFax.equals(that.billingFax) : that.billingFax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitCode != null ? unitCode.hashCode() : 0;
        result = 31 * result + (guestUid != null ? guestUid.hashCode() : 0);
        result = 31 * result + (contactPerName != null ? contactPerName.hashCode() : 0);
        result = 31 * result + (contactPerContact1 != null ? contactPerContact1.hashCode() : 0);
        result = 31 * result + (contactPerContact2 != null ? contactPerContact2.hashCode() : 0);
        result = 31 * result + (contactPerMobile != null ? contactPerMobile.hashCode() : 0);
        result = 31 * result + (contactPerEmail != null ? contactPerEmail.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (stateName != null ? stateName.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (contact1 != null ? contact1.hashCode() : 0);
        result = 31 * result + (contact2 != null ? contact2.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (urlWeb != null ? urlWeb.hashCode() : 0);
        result = 31 * result + (urlFacebook != null ? urlFacebook.hashCode() : 0);
        result = 31 * result + (urlProducts != null ? urlProducts.hashCode() : 0);
        result = 31 * result + (urlWhatsapp != null ? urlWhatsapp.hashCode() : 0);
        result = 31 * result + (billingAddress1 != null ? billingAddress1.hashCode() : 0);
        result = 31 * result + (billingAddress2 != null ? billingAddress2.hashCode() : 0);
        result = 31 * result + (billingAddress3 != null ? billingAddress3.hashCode() : 0);
        result = 31 * result + (billingZipCode != null ? billingZipCode.hashCode() : 0);
        result = 31 * result + (billingCityCode != null ? billingCityCode.hashCode() : 0);
        result = 31 * result + (billingStateCode != null ? billingStateCode.hashCode() : 0);
        result = 31 * result + (billingCountryCode != null ? billingCountryCode.hashCode() : 0);
        result = 31 * result + (billingContact1 != null ? billingContact1.hashCode() : 0);
        result = 31 * result + (billingContact2 != null ? billingContact2.hashCode() : 0);
        result = 31 * result + (billingFax != null ? billingFax.hashCode() : 0);
        return result;
    }
}
