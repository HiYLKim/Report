package pack;

import java.util.Date;

public class EducationDto {
	private String districtId;
	private String districtName;
	private int districtClassification;
	private String officeCode;
	private String officeName;
	private String supportCode;
	private String supportName;
	private Date creationDate;
	private Date changeDate;
	private int objectId;
	private Date baseDate;
	private String offerCode;
	private String offerName;
	
	
	
	public EducationDto() {}
	
	
	public EducationDto(String districtId, String districtName, int districtClassification, String officeCode,
			String officeName, String supportCode, String supportName, Date creationDate, Date changeDate,
			int objectId, Date baseDate, String offerCode, String offerName) {

		this.districtId = districtId;
		this.districtName = districtName;
		this.districtClassification = districtClassification;
		this.officeCode = officeCode;
		this.officeName = officeName;
		this.supportCode = supportCode;
		this.supportName = supportName;
		this.creationDate = creationDate;
		this.changeDate = changeDate;
		this.objectId = objectId;
		this.baseDate = baseDate;
		this.offerCode = offerCode;
		this.offerName = offerName;
	}
	
	@Override
	public String toString() {
		String str = districtId + ", " + districtName + ", " + districtClassification + ", " + officeCode 
				+ ", " + officeName + ", " + supportCode + ", " + supportName + ", " + creationDate 
				+ ", " + changeDate + ", " + objectId + ", " + baseDate + ", " + offerCode 
				+ ", " + offerName ;
		return str;
	}
	public String st() {
		String str ="교육행정구역명="+ districtName +", 시도교육청코드=" + officeCode 
				+ ", 시도교육청명=" + officeName + ", 교육지원청코드=" + supportCode + ", 교육지원청명=" + supportName + ", 공간객체ID=" + objectId ;
		return str;
	}
	
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public int getDistrictClassification() {
		return districtClassification;
	}
	public void setDistrictClassification(int districtClassification) {
		this.districtClassification = districtClassification;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getSupportCode() {
		return supportCode;
	}
	public void setSupportCode(String supportCode) {
		this.supportCode = supportCode;
	}
	public String getSupportName() {
		return supportName;
	}
	public void setSupportName(String supportName) {
		this.supportName = supportName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	public Date getBaseDate() {
		return baseDate;
	}
	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}
	
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	
	

}
	
	
	

