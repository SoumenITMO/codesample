package com.samasa.hspms.Booking.validation.Dto.GuestSearch;

public class GuestSearchDto {

    private String bkgGenSource;
    private String bkgNbr;
    private String externalBkgRefNo;
    private Integer indvConfirmNo;
    private Integer bkgBlkRangeId;
    private String guestName;
    private String contactPerMobile;
    private String contactPerEmail;
    private Long bkgFrom;
    private Long bkgTo;
    private String roomNo;
    private String occRoomType;
    private Integer companyTaTo;
    private Integer groupUId;
    private String rateCode;
    private Character primaryInd;
    private Integer sharesGUid;
    private Character arrvPickReq;
    private Character isCheckIn;
    private Character getIsCheckOut;
    private String externalProRefNo;
    private String profileId;
    private String mealPlanCode;
    private String booker;
    private String bookerContactNumber;
    private String splSrvType;

    public String getBkgGenSource() {
        return bkgGenSource;
    }

    public void setBkgGenSource(String bkgGenSource) {
        this.bkgGenSource = bkgGenSource;
    }

    public String getBkgNbr() {
        return bkgNbr;
    }

    public void setBkgNbr(String bkgNbr) {
        this.bkgNbr = bkgNbr;
    }

    public String getExternalBkgRefNo() {
        return externalBkgRefNo;
    }

    public void setExternalBkgRefNo(String externalBkgRefNo) {
        this.externalBkgRefNo = externalBkgRefNo;
    }

    public Integer getIndvConfirmNo() {
        return indvConfirmNo == null ? 0 : indvConfirmNo;
    }

    public void setIndvConfirmNo(Integer indvConfirmNo) {
        this.indvConfirmNo = indvConfirmNo;
    }

    public Integer getBkgBlkRangeId() {
        return bkgBlkRangeId == null ? 0 : bkgBlkRangeId;
    }

    public void setBkgBlkRangeId(Integer bkgBlkRangeId) {
        this.bkgBlkRangeId = bkgBlkRangeId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getContactPerMobile() {
        return contactPerMobile;
    }

    public void setContactPerMobile(String contactPerMobile) {
        this.contactPerMobile = contactPerMobile;
    }

    public String getContactPerEmail() {
        return contactPerEmail;
    }

    public void setContactPerEmail(String contactPerEmail) {
        this.contactPerEmail = contactPerEmail;
    }

    public Long getBkgFrom() {
        return bkgFrom;
    }

    public void setBkgFrom(Long bkgFrom) {
        this.bkgFrom = bkgFrom;
    }

    public Long getBkgTo() {
        return bkgTo;
    }

    public void setBkgTo(Long bkgTo) {
        this.bkgTo = bkgTo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getOccRoomType() {
        return occRoomType;
    }

    public void setOccRoomType(String occRoomType) {
        this.occRoomType = occRoomType;
    }

    public Integer getCompanyTaTo() {
        return companyTaTo;
    }

    public void setCompanyTaTo(Integer companyTaTo) {
        this.companyTaTo = companyTaTo;
    }

    public Integer getGroupUId() {
        return groupUId == null ? 0 : groupUId;
    }

    public void setGroupUId(Integer groupUId) {
        this.groupUId = groupUId;
    }

    public String getRateCode() {
        return rateCode == null ? "" : rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public Character getPrimaryInd() {
        return primaryInd == null ? ' ' : primaryInd;
    }

    public void setPrimaryInd(Character primaryInd) {
        this.primaryInd = primaryInd;
    }

    public Integer getSharesGUid() {
        return sharesGUid == null ? 0 : sharesGUid;
    }

    public void setSharesGUid(Integer sharesGUid) {
        this.sharesGUid = sharesGUid;
    }

    public Character getArrvPickReq() {
        return arrvPickReq == null ? ' ' : arrvPickReq;
    }

    public void setArrvPickReq(Character arrvPickReq) {
        this.arrvPickReq = arrvPickReq;
    }

    public Character getIsCheckIn() {
        return isCheckIn == null ? ' ' : isCheckIn;
    }

    public void setIsCheckIn(Character isCheckIn) {
        this.isCheckIn = isCheckIn;
    }

    public Character getGetIsCheckOut() {
        return getIsCheckOut == null ? ' ' : getIsCheckOut;
    }

    public void setGetIsCheckOut(Character getIsCheckOut) {
        this.getIsCheckOut = getIsCheckOut;
    }

    public String getExternalProRefNo() {
        return externalProRefNo;
    }

    public void setExternalProRefNo(String externalProRefNo) {
        this.externalProRefNo = externalProRefNo;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getMealPlanCode() {
        return mealPlanCode;
    }

    public void setMealPlanCode(String mealPlanCode) {
        this.mealPlanCode = mealPlanCode;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getBookerContactNumber() {
        return bookerContactNumber;
    }

    public void setBookerContactNumber(String bookerContactNumber) {
        this.bookerContactNumber = bookerContactNumber;
    }

    public String getSplSrvType() {
        return splSrvType;
    }

    public void setSplSrvType(String splSrvType) {
        this.splSrvType = splSrvType;
    }
}
