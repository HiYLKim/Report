package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDao {
	public List<EducationDto> selectAll(){
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EducationDto dto = null;
		List<EducationDto> allList = new ArrayList<EducationDto>();
		try {
			String sql = "SELECT DISTRICT_ID, DISTRICT_NAME, OFFICE_CODE, OFFICE_NAME,"
					+ "SUPPORT_CODE, SUPPORT_NAME, CREATION_DATE, CHANGE_DATE,""
					+ "OBJECT_ID, BASE_DATA, OFFER_CODE, OFFER_NAME FROM education";
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dto = new EducationDto();
				dto.setDistrictId(rs.getString(1));
				dto.setDistrictName(rs.getString(2));
				dto.setOfficeCode(rs.getString(3));
				dto.setOfficeName(rs.getString(4));
				dto.setSupportCode(rs.getString(5));
				dto.setSupportName(rs.getString(6));
				dto.setCreationDate(rs.getDate(7));
				dto.setChangeDate(rs.getDate(8));
				dto.sestObjectId(rs.getInt(9));
				dto.setBaseDate(rs.getDate(10));
				dto.setOfferCode(rs.getString(11));
				dto.setOfferName(rs.getString(12));
				dto.setDistrictClassification(1);
				allList.add(dto);
			}		
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs !=null)
					rs.close();
				if (pstmt !=null)
					pstmt.close();
				if (conn !=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		} return allList:
	}//selectAll
	
	public EducationDto selectOne(String id) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EducationDto dto = null;
		List<EducationDto> allList = new ArrayList<EducationDto>();
		try {
			String sql = "SELECT * FROM education WHERE DISTRICT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new EducationDto();
				dto.setDistrictId(rs.getString(1));
				dto.setDistrictName(rs.getString(2));
				dto.setDistrictClassification(rs.getInt(3));
				dto.setOfficeCode(rs.getString(4));
				dto.setOfficeName(rs.getString(5));
				dto.setSupportCode(rs.getString(6));
				dto.setSupportName(rs.getString(7));
				dto.setCreationDate(rs.getDate(8));
				dto.setChangeDate(rs.getDate(9));
				dto.setObjectId(rs.getInt(10));
				dto.setBaseDate(rs.getDate(11));
				dto.setOfferCode(rs.getString(12));
				dto.setOfferName(rs.getString(13));
				
				allList.add(dto);
			}		
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs !=null) {
					rs.close();
				}
				if (pstmt !=null) {
					pstmt.close();
				}
				if (conn !=null) {					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		} return dto;
	}//selectOne
	
	public List<EducationDto> selectData(String colName,String str){
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EducationDto dto = null;
		List<EducationDto> allList = new ArrayList<EducationDto>();
		String sql = null;
		try {
			if(colName.equals("DISTRICT_ID")) {
				sql = "SELECT * from education WHERE DISRICT_ID =?";
			}else if (colName.equals("DISTRICT_NAME")) {
				sql ="SELECT * FROM education WHERE DISTRICT_NAME like ? ";
			}else if (colName.equals("OFFIcE_NAME")) {
				sql = "SELECT * FROM education WHERE OFFICE_NAME like ?";
			}
			//System.out.println(str);	
			//String sql = "SELECT * FROM education WHERE DISTRICT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			pstmt.setString(1, str);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dto = new EducationDto();
				dto.setDistrictId(rs.getString(1));
				dto.setDistrictName(rs.getString(2));
				dto.setDistrictClassification(rs.getInt(3));
				dto.setOfficeCode(rs.getString(4));
				dto.setOfficeName(rs.getString(5));
				dto.setSupportCode(rs.getString(6));
				dto.setSupportName(rs.getString(7));
				dto.setCreationDate(rs.getDate(8));
				dto.setChangeDate(rs.getDate(9));
				dto.setObjectId(rs.getInt(10));
				dto.setBaseDate(rs.getDate(11));
				dto.setOfferCode(rs.getString(12));
				dto.setOfferName(rs.getString(13));				
				list.add(dto);
			}		
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs !=null) {
					rs.close();
				}
				if (pstmt !=null) {
					pstmt.close();
				}
				if (conn !=null) {					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		} return list;
	}//selectOne
	
	public boolean insert(EducationDto dto) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;
		
		int flag = 0;		
		try {
			String sql = "INSERT INTO education"
				+ "(DISTRICT_ID, DISTRICT_NAME, DISTRICT_CLASSIFICATION, OFFICE_CODE, OFFICE_NAME, SUPPORT_CODE, SUPPORT_NAME,"
				+ "(CREATION_DATE, CHANGE_DATE, OBJECT_ID, BASE_DATA, OFFICE_CODE, OFFICE_NAME)"
				+ "VALUES(?, ?, 1, ?, ?, ?, ?, ?, CURDATE(), CURDAT(), ?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			pstmt.setString(1, dto.getDistrictId());//DB 시퀀스로 할 수 있느지?
			pstmt.setString(2, dto.getDistrictName());
			pstmt.setString(3, dto.getOfficeCode());
			pstmt.setString(4, dto.getOfficeName());
			pstmt.setString(5, dto.getSupportCode());
			pstmt.setString(6, dto.getSupportName());
			pstmt.setInt(7, dto.getObjectId());
			pstmt.setString(8, "2022-09-21");//현재시간으로 바꾸는 방법은?
			pstmt.setString(9, "C738100");
			pstmt.setString(10, "청주대학교 지방교육재정연구원");
			flag = pstmt.executeUpdate();			
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt !=null) 
					pstmt.close();								
				if (conn !=null) 				
					conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}
		if(flag > 0) {
			return true;
		} else {
			return false;
		}	
	}//insert
	
	public boolean update(EducationDto dto) {
		Connection conn = new DBConnect().getConn();
		PreparedStatement pstmt = null;		
		int flag = 0;		
		try {
			String sql = "UPDATE education SET DISTRICT_NAME=?, OFFICE_CODE=?, OFFICE_NAME=?, "
					+ "SUPPORT_CODE=?, SUPPORT_NAME=?, OBJECT_ID WHERE DISTRICT_ID =?";
			
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			pstmt.setString(1, dto.getDistrictId());//DB 시퀀스로 할 수 있느지?
			pstmt.setString(2, dto.getDistrictName());
			pstmt.setString(3, dto.getOfficeCode());
			pstmt.setString(4, dto.getOfficeName());
			pstmt.setString(5, dto.getSupportCode());
			pstmt.setString(6, dto.getSupportName());
			pstmt.setInt(7, dto.getObjectId());			
			flag = pstmt.executeUpdate();			
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt !=null) 
					pstmt.close();								
				if (conn !=null) 				
					conn.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}
		if(flag > 0) {
			return true;
		} else {
			return false;
		}		
	}	
	
	public boolean delete(String id) {
		Connection conn = new DBConnect().getConnecction();
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			String sql = "DELETE FROM education WHERE DISTRICT_ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			flag = pstmt.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (flag > 0) {
			return true;
		} else {
			return false;
		}
}
}
	
	
		
		
		
	
		
		
	
	
